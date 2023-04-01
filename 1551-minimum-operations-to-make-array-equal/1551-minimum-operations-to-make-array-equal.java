//TC-0(1)
//SC-0(1)
class Solution {
    public int minOperations(int n) {
        //Explaination
        // N=4   1 3 5 7 N IS EVEN
        //MEAN=4
        //DIFFERENCE IS -3 -1 +1 +3
        
        //do n/2 as half is positive and half is negative
        
        //SO OPERATIONS TO BE CARRIED IS 1+3=4....IN GENERAL IT IS N/2(2A +(N-1)D)==N/2(2+(N-1)2)=N/2(2N)=N^2
        //IN ODD CASE
        //N=5  1 3 5 7 9  MEAN=5
        //DIFFERENCE IS -4 -2  0 +2 +4
        //SO OPERATIONS TO BE CARRIED IS 2+4=6....   
        //IN GENERAL IT IS SUM IS =N/2(2A+(N-1)D)=N/2(4+(N-1)2)=N/2(2N+2)=N(N+1)
        int ans=0;
        if(n%2==1){//odd case
            n=n/2;
            ans=n*(n+1);
        }else{//even case
            n=n/2;
            ans=n*n;
        }
        return ans;
    }
}