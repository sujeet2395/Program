srx<-seq(1:20)
sry<-seq(2:21)
srz<-c(10,20,24,14,15,16,18,19,14,24,26,28,29,25,10,20,24,14,15,16)
df<-data.frame(x=srx,y=sry,z=srz)
head(df)
library(scatterD3)
library(plot3D)
scatter3D(srx, sry, srz, bty = "b2", colkey = FALSE, main ="bty= 'b2'")
library(plyr)
pt<-c(10,20,24,14,15,16,18,19,14,24,26,28,29,25,10,20,24,14,15,16,18,19,14,24,26,28,29,25,10,20,24,14,15,16,18,19,14,24,26,28,29,25)
freq<-count(pt)
df_cluster<-kmeans(freq,2)
df_cluster
df1_cluster<-kmeans(pt,2)
df1_cluster
library(dplyr)
library(ggplot2)
df_cluster$cluster<-as.factor(df_cluster$cluster)
ggplot(freq,aes(, freq, color=c("red","black")))+geom_point()
len_lcm<-freq
hist(freq$x)

plot(freq$x,freq$freq)
plot(c(freq$freq), col=c("red"))

library(tidyr)
separate(data=logData1, col = Request, into = c("Method", "Link"), sep = "\\/")
#logData3<-transform(logData1, Request = strsplit(Request, split = "\\/", names = c('Method', 'Link')))


#row.names(domainSet)<-NULL
domainSetcbind(str_split_fixed(domainSet[,2],"/",2))
head(domainSet,10)

#logData2<-subset(logData1,logData1$Request!="GET/HTTP/1.1")
#logData2<-logData1[,-logData1$Request %like% "GET/HTTP/1.1"]

library(dplyr)
distinctIpAddrs<-distinct(logData,logData$`IP address`)
str(distinctIpAddrs)

dateTimeSet<-strptime(logData$Date, "[%d/%B/%Y:%H:%M:%S")
head(dateTimeSet)

dateSet<-as.Date(dateTimeSet,"%d-%b-%Y")

dateTimeDF<-t(as.data.frame(strsplit(as.character(dateTimeSet)," ")))
row.names(dateTimeDF)<-NULL
head(dateTimeDF)

relativeTime<-c(0,diff(dateTimeSet))
head(relativeTime)

#part of LCS.R file

lcs<-LenLongStr("sujeetkusfdsmat","shsujeetsdkumare")
lcs
lcs<-LenLongStr("reqlink","inputReqLink")
lcs



reqDF<-access_log2$Request[1:500]
inputReq<-reqDF[[2]]
inputReq

#part of Lcs.R file
head(reqLCS)
library(plyr)
y<-count(reqLCS)
head(y)
X<-count(reqDF)
head(X)

X<-count(trainLogData$Request_Link)
head(X)