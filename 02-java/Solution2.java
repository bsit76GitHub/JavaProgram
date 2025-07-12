import java.util.*;
import java.io.*;

class Solution2{
    public static void main(String []argh){
        int j,s1;
        
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
        
        int s[]=new int[n];
        for(j=0;j<n;j++)
        {
           s1= s1 + a + (parseInt(Math.pow(2,j))) * b;
           s[j]=s1;
        }
        for(int m=0;m<n;m++){
        System.out.println(s[m]);
        }
    }
        in.close();
       
    }
}