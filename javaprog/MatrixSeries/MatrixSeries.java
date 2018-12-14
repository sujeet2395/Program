package MatrixSeries;

import java.util.Scanner;

/**
 * 
 * @author Sharma
 * ref:  https://practice.geeksforgeeks.org/contest-problem/matrix-series/0/
 * A series is defined as follows :
M, MT, MMT, M(MT)2, M2(MT)3, M3(MT)5, M5(MT)8 . . . . . . . ., where M is a binary square matrix of size K x K (Binary Matrix is a special type of Matrix where each element of the matrix is either 0 or 1). And MT represents the transpose of Matrix M.
Given N and K, find the Nth term of the series.
* 
* 
* Example :
Input :
2 //test case number;
2 4 //k n
1 1 // mat k*k
0 1
2 5
1 1
0 1

Output :
3 1
2 1
7 2
3 1
 */



public class MatrixSeries {
    static Scanner sc=new Scanner(System.in);
    
    public static PowerObj powerFun(int n) {
        
        PowerObj powObj1=new PowerObj(1,0);
        PowerObj powObj2=new PowerObj(0,1);
        PowerObj powObj=null;
        if(n==1){
            return powObj1;
        }
        if(n==2){
            return powObj2;
        }
        int i;
        for(i=3; i<=n; i++)
        {
            powObj=PowerObj.addPow(powObj1, powObj2);
            powObj1=powObj2;
            powObj2=powObj;
        }
        
        return powObj;
    }
    
    public static SquareMatrix matrixPow(SquareMatrix s, int start, int end){
        SquareMatrix r;
        int mid;
        if(start==end)
        {
            return s;
        }
        mid=(start+end)/2;
        SquareMatrix a=matrixPow(s, start, mid);
        SquareMatrix b=matrixPow(s, mid+1, end);
        r=SquareMatrix.mul(a, b);
        return r;
    }
    
    public static SquareMatrix nthMatrix(SquareMatrix m, int n)
    {
        PowerObj nPow=powerFun(n);
        SquareMatrix mt=m.transpose();
        SquareMatrix ma=matrixPow(m, 1, nPow.getA());
        SquareMatrix mb=matrixPow(mt, 1, nPow.getB());
        SquareMatrix r=SquareMatrix.mul(ma, mb);
        return r;  
    }
    
    public static void main(String[] args) {
        //String s=powerFun(7).toString();
        //System.out.println(s);
        SquareMatrix ma=new SquareMatrix(new int[][]{{1,1},{0,1}});
        //SquareMatrix mb=new SquareMatrix(new int[][]{{0,1},{0,1}});
        //SquareMatrix mr=SquareMatrix.mul(ma, mb);
        SquareMatrix mr=nthMatrix(ma, 5);
        mr.print();
    }
}
