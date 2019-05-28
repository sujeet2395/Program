mylist<-list()
list1<-list()
list2<-list()
for(i in 1:10)
{
  if(i%%2==0){
    list1<-c(list1,i);
    mylist[[1]]<-list1; print(i);
  }
  else{
    list2<-c(list2,i);
    mylist[[2]]<-list2;
    print(i);
  }
}


mylist

