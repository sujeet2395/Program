fact.f<- function(x)
{
  if(x<=1)
    return(1);
  return(x*fact.f(x-1));
}

fa<-fact.f(5)
fa

inputs = list(1, 2, 4, -5, 'oops', 0, 10)

for(input in inputs) {
   tryCatch(print(paste("log of", input, "=", log(input))),warning = function(w)
     { 
        x<-log(-input)
        print(paste("negative argument", input," log of absolute of ",input, x));
     }
     ,
     error = function(e) {print(paste("non-numeric argument", input));
     NaN
     })
}