//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int A =sc.nextInt();
            int B =sc.nextInt();
            int C =sc.nextInt();
            int D =sc.nextInt();
             
           System.out.println(new Solution().carpetBox(A,B,C,D)); 
        }
    }
}

// } Driver Code Ends


//User function Template for Java

//https://www.youtube.com/watch?v=wWpZ65LaF84
class Solution{
    int carpetBox(int A, int B, int C, int D) { 
        //code here
        int steps1=0;
        int length=A,width=B;//carpet dimension
        
        while(length>C || width>D){//when we fold A over C and B over D
            if(length>C){
                length/=2;
                steps1++;
            }
            if(width>D){
                width/=2;
                steps1++;
            }
        }
        
        length=A;
        width=B;
        
        int steps2=0;
        while(length>D || width>C){//when we fold A over  and B over D
            if(length>D){
                length/=2;
                steps2++;
            }
            if(width>C){
                width/=2;
                steps2++;
            }
        }
        
        return (int)Math.min(steps1,steps2);
    }
   
}
