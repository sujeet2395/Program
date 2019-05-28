#Creating the list which are to be recommended
freqLCS<-cbind(freqLCS,clusterNum=FRCluster$cluster)
reqLCS_List<-subset(freqLCS,freqLCS$clusterNum==2)
nrow(reqLCS_List)
reqLCS_Subset<-NULL
reqSubset<-NULL
for( i in 1:nrow(reqLCS_List)){
  if(i==1)
  {
    reqLCS_Subset<-subset(reqLCS,reqLCS$LCS==reqLCS_List$LCS[[i]])
  }else
  {
    reqLCS_Subset<-rbind(reqLCS_Subset,subset(reqLCS,reqLCS$LCS==reqLCS_List$LCS[[i]]))
  }
}  
recommendLogData<-NULL
for( i in 1:nrow(reqLCS_Subset))
{
  if(i==1)
    recommendLogData<-subset(firstUser, firstUser$Date==reqLCS_Subset$Key[[i]])
  else
  {
    recommendLogData<-rbind(recommendLogData,subset(firstUser, firstUser$Date==reqLCS_Subset$Key[[i]]))
  }
}
recommendLink<-recommendLogData$Request_Link
head(recommendLink)
length(recommendLink)
