//TC-0(NLOGN)
//AC-0(1)

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        
        char[] ss1=s1.toCharArray();
        Arrays.sort(ss1);
        for(int j=0;j<s2.length()-s1.length()+1;j++){
            String ss=s2.substring(j,j+s1.length());
            char[] ss2=ss.toCharArray();
            Arrays.sort(ss2);
            
            if(Arrays.equals(ss1,ss2)){
                return true;
            }
        }
        return false;
    }
}