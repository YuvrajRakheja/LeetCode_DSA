//TC-0(N)
//SC-0(N)
//OPTIMIZED
class Solution {
    public int maximumSwap(int num){
        
        char[] arr=Integer.toString(num).toCharArray();
        //1.Prepare last index of digits
        int[] freq=new int[10];
        
        for(int i=0;i<arr.length;i++){
            int digit=arr[i]-'0';
            freq[digit]=i;
        }
        //2.figure out index for swapping
        boolean flag=false;
        
        for(int i=0;i<arr.length;i++){
            int digit=arr[i]-'0';
            for(int j=9;j>digit;j--){
                if(i<freq[j]){
                    char temp=arr[i];
                    arr[i]=arr[freq[j]];
                    arr[freq[j]]=temp;
                    flag=true;
                    break;
                }
            }
            if(flag)    break;
        }
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        return Integer.parseInt(sb.toString());
    }
}