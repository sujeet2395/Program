#get details of movies on providing the list of movie's name)
final_data=get_movie_data(movie=c("apollo 13","12 angry men"))
str(final_data)

### movie --> queried movie
movie="Interstellar"
movie=tolower(movie)
vec1=subset(movies,Title==movie)[1,]
#movies of commom directors
d1=as.data.frame(get_movies_by_common_directors(vec1,movies))
str(d1)
#movies of common actors
d2=as.data.frame(get_movies_by_common_actors(vec1,movies))
str(d2)
#movies of common writers
d3=as.data.frame(get_movies_by_common_writers(vec1,movies))
str(d3)
#movies of common productions
d4=as.data.frame(get_movies_by_common_production(vec1,movies))
str(d4)


data=recommendation(movies,"Interstellar")
data[1:10,]