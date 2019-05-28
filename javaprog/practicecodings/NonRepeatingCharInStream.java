package practicecodings;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class NonRepeatingCharInStream {
    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t-->0)
        {
            int n;
            n=sc.nextInt();
            //char stream[]=new char[n];
            char ch;
            Queue<Character> q=new LinkedList<>();
            int[] map=new int[26];
            int i=0;
            while(i<n)
            {
                ch=sc.next().charAt(0);
                if(map[ch-'a']==0)
                {
                    q.add(new Character(ch));
                    map[ch-'a']++;
                }else{
                    char sec_ch;
                    List<Character> list=(LinkedList)q;
                    if(!q.isEmpty()){
                        sec_ch=q.peek();
                       if(ch==sec_ch)
                           q.remove();
                       else{
                           Character chh=new Character(ch);
                           if(list.contains(chh))
                           {
                               list.remove(chh);
                           }
                       }
                    }
                    else sec_ch='\0';
                }
                if(!q.isEmpty())
                    System.out.print((char)q.peek()+" ");
                else{
                    System.out.print("-1 ");
                }
                i++;
            }
            System.out.println();
        }
    }
}


/*
input:
2
40
v f g v j w d v j j a f q z z x l c x d z n c q g j l a p o p k v x f g v i c e 
12
o t z o m e q l f t x z

output:
v v v f f f f f f f f g g g g g g g g g g g g g w w w w w w w w w w w w w w w w 
o o o t t t t t t z z m 
*/