class Solution {
    public int[] colorTheArray(int n, int[][] queries) {
        int[] arr=new int[n];
        int[] ans=new int[queries.length];
        int count=0;
        boolean flag1=false,flag2=false;
        
        for(int i=0;i<queries.length;i++){
            int idx=queries[i][0];
            int val=queries[i][1];
            flag1=false;
            flag2=false;
            
            if(idx>0 && arr[idx-1]!=0 && arr[idx-1]==arr[idx]){
                flag1=true;
            }  
            if(idx<arr.length-1 && arr[idx+1]!=0 && arr[idx+1]==arr[idx]){
                flag2=true;
            }
            arr[idx]=val;
            
            if(idx>0 && arr[idx-1]!=0 && arr[idx-1]==arr[idx]){
                count++;
            }    
            if(idx<arr.length-1 && arr[idx+1]!=0 && arr[idx+1]==arr[idx]){
                count++;
            }
            
            if(flag1)    count--;
            if(flag2)   count--;
            
            ans[i]=count;
        }
        return ans;
    }
}