#To import log file

library(readxl)
access_log2 <- read_excel("E:/sujeet sharma/Rcode/access_log/access_log2.xlsx")
View(access_log2)

#Extracting subset of log file which have successfull request

logData<-subset(access_log2, access_log2$Status==200)

#Extracting subset of log file which have Valid IP address

logData<-logData[grep("(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]).){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])",logData$`IP address`),]
head(logData)

#Creating data frame in which Request field have Image Media Link

logImg<-logData[grep(c(".png|.gif|.jpeg|.jpg|.ai|.bmp|.ico|.ps|.psd|.svg|.tif|.tiff"),logData$Request),]

#Removing rows in which Request field have image media link

logData1<-logData[-grep(c(".png|.gif|.jpeg|.jpg|.ai|.bmp|.ico|.ps|.psd|.svg|.tif|.tiff"),logData$Request),]

#Removing rows in which Request field have robot requests

logData1<-logData1[-grep(c("robot"),logData1$Request),]

#Converting date time field in standard format 

logData1$Date<-strptime(logData1$Date,"[%d/%B/%Y:%H:%M:%S")

#Removing rows in which Request made without domain name

logData1<-logData1[-grep("GET / HTTP/1.1|GET / HTTP/1|GET / HTTP",logData1$Request),]

#Removing Status and Size Comlumn

logData1$Status<-NULL
logData1$Size<-NULL

#View Refine Log file

head(logData1,10)

#Spliting Request into Method and Link
library(stringr)
domainSet<-str_split_fixed(logData1$Request," /",2)
head(domainSet)

#Spliting Link of domainSet into Domain and Rest link part
domainReq<-str_split_fixed(domainSet[,2],"/",2)
head(domainReq)

#Creating dataframe of Method, Domain and Request_Link
DomainSet<-data.frame(domainSet[,1],domainReq[,1], domainSet[,2])
names(DomainSet)<-c("Method", "Domain","Request_Link")
head(DomainSet)

#Combining Comlumn of DomainSet with trainLogData
logData2<-data.frame(logData1,DomainSet)
head(logData2)

#Creating Sample
set.seed(101) # Set Seed so that same sample can be reproduced in future also
# Now Selecting 90% of data as sample from total 'n' rows of the data  
sampleSeq <- sample.int(n = nrow(logData2), size = floor(0.90*nrow(logData2)), replace = F)
trainLogData<-logData2[sampleSeq,]
testLogData<-logData2[-sampleSeq,]

library(plyr)
FrequencyReq<-count(as.character(trainLogData$Request_Link))
plot(FrequencyReq$x,FrequencyReq$freq, xlab="Requested Link", ylab="Frequecny")

#distinct users identifying on basis of IP Address
ipAddr<-trainLogData$IP.address
users<-count(ipAddr)
plot(users$x,users$freq,xlab="ip_address", ylab="frequency")
users

#Selecting one user who has made maiximum request and named as firstuser
firstUser<-subset(trainLogData,trainLogData$IP.address==users[which.max(users$freq),1])
testLogDataFU<-subset(testLogData,testLogData$IP.address==users[which.max(users$freq),1])

#Graph of Frequency vs Link of firstuser
freqLink<-count(firstUser$Request)
plot(freqLink$x, freqLink$freq, xlab="Requested Link", ylab="Frequency", main="User Session")
