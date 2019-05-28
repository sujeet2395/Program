library(readxl)
access_log2 <- read_excel("C:/Users/sharma/Downloads/access_log/access_log2.xlsx")
View(access_log2)


logData<- as.data.frame(access_log2);
str(logData)
head(logData)
tail(logData)

library(qdap)
ip_request<- data.frame(ip_address=logData$"IP address", request=logData$Request)
#users<-subset(ip_request$ip_address,by="ip_address")
ip_req_sample<-sample(nrow(ip_request),20)
ip_req_sample
ip_req_samples<-subset(logData[ip_req_sample,])
class(ip_req_samples)