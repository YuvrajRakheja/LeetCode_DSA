class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i=0,j=0;
        while(i<name.length() && j<typed.length()){
            if(name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
            }else{
                if(i>0 && name.charAt(i-1)==typed.charAt(j)){
                    j++;
                }else{
                    return false;
                }
            }
        }
        while(j<typed.length()){// include case when name="fdd" and typed="ffddddk"
            if(name.charAt(i-1)!=typed.charAt(j)){
                return false;
            }
            j++;
        }
        return i<name.length()?false:true; //for false take case name="fdde" typed="ffddd"
    }
}