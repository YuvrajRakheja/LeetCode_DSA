//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int[] a = IntArray.input(br, 3);
            
            
            int[] S1 = IntArray.input(br, a[0]);
            
            
            int[] S2 = IntArray.input(br, a[1]);
            
            
            int[] S3 = IntArray.input(br, a[2]);
            
            Solution obj = new Solution();
            int res = obj.maxEqualSum(a[0],a[1],a[2], S1, S2, S3);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int maxEqualSum(int N1,int N2,int N3, int[] S1, int[] S2, int[] S3) {
        // code here
        int i=0,j=0,k=0,sum1=0,sum2=0,sum3=0;
        
        for(int p=0;p<N1;p++)   sum1+=S1[p];
        for(int p=0;p<N2;p++)   sum2+=S2[p];
        for(int p=0;p<N3;p++)   sum3+=S3[p];
        
        while(true){
            if(i==N1 || j==N2 || k==N3)     return 0;
            
            if(sum1==sum2 && sum2==sum3)    return sum1;
            
            if(sum1>=sum2 && sum1>=sum3){
                sum1-=S1[i];
                i++;
            }else if(sum2>=sum3 && sum2>=sum1){
                sum2-=S2[j];
                j++;
            }else{
                sum3-=S3[k];
                k++;
            }
        }
    }
}
        
