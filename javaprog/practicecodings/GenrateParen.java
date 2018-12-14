package practicecodings;

import java.util.ArrayList;

public class GenrateParen {
    
    private void _printParenthesis(int pos, int n, int open, int close, ArrayList<String> res, char[] str)
    {
        if(close == n) 
        {
            res.add(String.valueOf(str));
            return;
        }
        else
        { 
            if(open < n)
            {
                str[pos]='(';
                _printParenthesis(pos+1, n, open+1, close,res,str);
            }
            if(open > close) 
            {
                str[pos]=')';
                _printParenthesis(pos+1, n, open, close+1,res,str);
            }
        }
    }

    public ArrayList<String> generateParenthesis(int A) {
        ArrayList<String> r=new ArrayList<>();
        char[] str=new char[2*A];
        _printParenthesis(0, A, 0, 0, r, str);
        return r;
    }
    public static void main(String[] args) {
        GenrateParen gp=new GenrateParen();
        ArrayList<String> r=gp.generateParenthesis(3);
        System.out.println(""+r);
    }
}
