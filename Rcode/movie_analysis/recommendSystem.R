recommendation=function(movies,movie)
{
  ### movies --> movie data
  ### movie --> queried movie
  
  movie=tolower(movie)
  vec1=subset(movies,Title==movie)[1,]
  
  ### movies having common actors, writers, directors or production
  ### companies with queried movie
  d1=as.data.frame(get_movies_by_common_directors(vec1,movies))
  d1=rbind(d1,as.data.frame(get_movies_by_common_actors(vec1,movies)))
  d1=rbind(d1,as.data.frame(get_movies_by_common_writers(vec1,movies)))
  d1=rbind(d1,as.data.frame(get_movies_by_common_production(vec1,movies)))
  
  ### features used to calculate similarity
  col=colnames(movies)[24:length(colnames(movies))]
  col=c("Metascore","imdbRating",col)
  
  features=movies[,col]
  d=strsplit(vec1$Keywords,", ")
  d=unlist(d)
  
  ### to add column for plot keywords of queried movie
  vec1=vec1[,col]
  vec1[d]=1
  features[d]=0
  
  len=nrow(movies)
  for(i in 1:len)
  {
    f1=strsplit(movies[i,"Keywords"],", ")
    f1=unlist(f1)
    
    common=intersect(d,f1)
    features[i,common]=1
  }
  
  ### to calculate similarity with queried movie
  sim<- apply(features,1,function(x) sum(vec1 * x,na.rm=T)/(sqrt(sum(vec1^2,na.rm=T))*sqrt(sum(x^2,na.rm=T))))
  data=as.data.frame(cbind(movies$Title,sim))
  colnames(data)[1]="Title"
  
  ### to sort according to similarity
  data=data[order(data$sim,data$Title,decreasing = T),]
  data=subset(data,Title!=movie)
  
  ### data frame returning recommended data
  data
}