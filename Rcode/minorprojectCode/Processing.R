#Selecting one row form testing set 
inputReqLink<-as.character(testLogDataFU[7,"Request_Link"])
inputReqDom<-testLogDataFU[7,"Domain"]
#creating the list of lOngest of common substring on selected input request_link
reqLCS<-NULL
dateAsKeys<-NULL
for(i in 1:length(firstUser$Request_Link))
{
  if(firstUser[i,"Domain"]==inputReqDom)
  {
    reqlink<-as.character( firstUser[i, "Request_Link"])
    LCS_DF<-data.frame(LenLongStr(reqlink,inputReqLink))
    key<-data.frame(firstUser[i,"Date"])
    if(i==1)
    {
      reqLCS<-LCS_DF
      dateAsKeys<-key
    }
    else{
      reqLCS<-rbind(reqLCS,LCS_DF)
      dateAsKeys<-rbind(dateAsKeys,key)
    }
    
  }
}
names(reqLCS)<-c("LCS")
names(dateAsKeys)<-c("Key")
reqLCS<-cbind(reqLCS,dateAsKeys)

#frequency of longest common substring
library(plyr)
freqLCS<-count(reqLCS$LCS)
names(freqLCS)<-c("LCS","freq")
plot(freqLCS$LCS,freqLCS$freq, xlab="LCSs", ylab="Frequency", main="Requested Link Matched and Frequency")

#length of LCS
lenLCS<-nchar(as.character( freqLCS$LCS))
freqLCS<-cbind(freqLCS,lenLCS)
names(freqLCS)<-c("LCS","freq","lenLCS")

#Kmeans applying
FR<-data.frame(freqLCS$freq,freqLCS$lenLCS)
FRCluster<-kmeans(FR,2)
FRCluster
FRCluster$size
