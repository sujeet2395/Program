get_movie_details=function(movie_name)
{
  data=subset(movies, movies$Title==movie_name)
  data
}

get_movie_data=function(movieslist)
{
  ### to get length of movie names vector
  len=length(movieslist)
  print(1)
  
  data=get_movie_details(movieslist[1])
  
  d=tryCatch({
    for(i in 2:len)
    {
      print(i)
      data=rbind(data,get_movie_details(movieslist[i]))
    }
    
    data
    
  },error={
    data
  })
  d
}

get_all_types=function(mov)
{
  ### to merge vector into a string
  d=paste(mov,collapse=", ")
  ### Example,
  ###  [1] "Action"
  ###  [2] "War, Sci-Fi"
  ### Output: "Action, War, Sci-Fi"
  
  ### To split a string
  d=strsplit(d,", ")
  d=unlist(d)
  ### [1] "Action" [2] "War" [3] "Sci-Fi"
  
  len=length(d)
  all=""
  
  for(i in 1:len)
  {
    all=union(all,d[i])
  }
  all[2:length(all)]
}

generate_dataset=function(mov)
{
  ### To get all genres
  genres=get_all_types(mov$Genre)
  
  ### Initialize all columns to 0
  mov[genres]=0
  len=nrow(mov)
  
  for(i in 1:len)
  {
    d=strsplit(mov$Genre[i],", ")
    d=unlist(d)
    
    ### Assign 1 if row has that genre
    mov[i,d]=1
  }
  mov
}


get_movies_by_common_actors=function(vec1,data)
{
  ### vec1 --> queried movie
  ### data --> movie dataset
  ### To split string into vectors
  
  f1=strsplit(vec1$Cast,", ")
  f2=strsplit(data$Cast,", ")
  
  len=nrow(data)
  ans=array(F,len)
  len2=length(f1[[1]])
  
  ### To check queried movie' cast and other movies' cast have actors in
  ### common
  for(i in 1:len)
  {
    for(j in 1:len2)
    {
      if(!is.na(match(f1[[1]][j],f2[[i]])) )
      {
        ans[i]=T
      }
    }
  }
  d=subset(data,ans==T)
  d
}


get_movies_by_common_directors=function(vec1,data)
{
  f1=strsplit(vec1$Director,", ")
  f2=strsplit(data$Director,", ")
  
  len=nrow(data)
  ans=array(F,len)
  #d=apply(f2,1,function(x) sum(f1[[1]]==x[[1]]))
  len2=length(f1[[1]])
  
  for(i in 1:len)
  {
    for(j in 1:len2)
    {
      if(!is.na(match(f1[[1]][j],f2[[i]])) )
      {
        ans[i]=T
      }
    }
  }
  
  d=subset(data,ans==T)
  d
}

get_movies_by_common_writers=function(vec1,data)
{
  f1=strsplit(vec1$Writer,", ")
  f2=strsplit(data$Writer,", ")
  
  len=nrow(data)
  ans=array(F,len)
  
  #d=apply(f2,1,function(x) sum(f1[[1]]==x[[1]]))
  len2=length(f1[[1]])
  
  for(i in 1:len)
  {
    for(j in 1:len2)
    {
      if(!is.na(match(f1[[1]][j],f2[[i]])) )
      {
        ans[i]=T
      }
    }
  }
  
  d=subset(data,ans==T)
  d
}

get_movies_by_common_production=function(vec1,data)
{
  f1=strsplit(vec1$Production,", ")
  f2=strsplit(data$Production,", ")
  
  len=nrow(data)
  ans=array(F,len)
  
  #d=apply(f2,1,function(x) sum(f1[[1]]==x[[1]]))
  len2=length(f1[[1]])
  
  for(i in 1:len)
  {
    for(j in 1:len2)
    {
      if(!is.na(match(f1[[1]][j],f2[[i]])) )
      {
        ans[i]=T
      }
    }
  }
  
  d=subset(data,ans==T)
  d
}
