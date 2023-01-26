class Solution {
    public String sortSentence(String s) {
        String[] arr=s.split(" ");
        String[] sorted_arr=new String[arr.length];
        StringBuilder sb=new StringBuilder();
        
        for(String word:arr){
            int idx=word.length()-1;
            sorted_arr[word.charAt(idx)-'1']=word.substring(0,idx);//therefore will be appended as [0,idx-1]
        }
        int i=0;
        for(i=0;i<sorted_arr.length-1;i++){
            sb.append(sorted_arr[i]+" ");
        }
        sb.append(sorted_arr[i]);
        return sb.toString();
    }
}