class Solution {
    public String defangIPaddr(String address) {
        StringBuilder ans=new StringBuilder();
        
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                ans.append('[');
                ans.append(address.charAt(i));
                ans.append(']');
                continue;
            }
            ans.append(address.charAt(i));
        }
        return ans.toString();
    }
}