### To load datasets
library(readr)
movies=read.csv("E:/sujeet sharma/Rcode/movie_analysis/movie_updated.csv",stringsAsFactors = F)
movies=generate_dataset(movies)

### To remove duplicates
dups=duplicated(movies$Title)
movies=movies[!dups,]

### To substitute N/A to NA
movies$Metascore=gsub("N/A","NA",movies$Metascore)
movies$Metascore=as.numeric(movies$Metascore)

### To convert title to lower case
movies$Title=tolower(movies$Title)

### To convert Runtime into numeric
movies$Runtime=as.numeric(gsub(" min","",movies$Runtime))


