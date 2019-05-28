import array

def consecutiveNearest(arr):
    print(arr)
    arr.sort(key=lambda e: e[0])
    print(arr)
    out=[]
    minstep=100000
    print(arr[2][1], type(arr[2][1]))
    print(len(arr)-1)
    for i in range(len(arr)-1):
        print(arr[i], i)
        a=arr[i][0]
        b=arr[i+1][0]
        print(a)
        print(b)
        if a+1==b:
            if((arr[i+1][1]-arr[i][1])<=minstep):
                sp=(arr[i+1][1]-arr[i][1])
                print(abs(sp))
                if sp<minstep:
                    print(out)
                    out.clear()
                    oute=[]
                    oute.append(arr[i])
                    oute.append(arr[i+1])
                    out.append(oute)
                elif sp==minstep:
                    oute=[]
                    oute.append(arr[i])
                    oute.append(arr[i+1])
                    out.append(oute)
                print(abs(sp))
                minstep=abs(sp)
    return out
if __name__=='__main__':
    arr=array.array('i',[3,28,20,38,21,2])
    copy=[]
    for i in range(len(arr)):
        ar=[]
        ar.append(arr[i])
        ar.append(i)
        copy.append(ar)
    out=consecutiveNearest(copy)
    print(out)
    for e in out:
        print(e)
