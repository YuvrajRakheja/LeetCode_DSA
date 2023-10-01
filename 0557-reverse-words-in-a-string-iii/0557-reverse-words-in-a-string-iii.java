//TC-0(N)
//SC-0(1)

class Solution {
    public String reverseWords(String s) {
        int start=0;
        char[] arr=s.toCharArray();
        
        for(int j=0;j<arr.length;j++){
            if(arr[j]==' '){
                reverse(start,j-1,arr);
                start=j+1;
            }else if(j==arr.length-1){
                reverse(start,j,arr);
            }
        }
        return new String(arr);
    }
    private void reverse(int start,int end,char[] arr){
        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}