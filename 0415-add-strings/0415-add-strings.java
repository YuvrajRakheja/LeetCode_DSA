class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1,j=num2.length()-1;
        int carry=0;
        StringBuilder sb=new StringBuilder();
        
        while(i>=0 || j>=0 || carry!=0){
            int ival=(i>=0)?num1.charAt(i)-'0':0;
            int jval=(j>=0)?num2.charAt(j)-'0':0;
            
            i--;
            j--;
            
            int sum=ival+jval+carry;
            sb.append(sum%10);
            carry=sum/10;
        }
        return sb.reverse().toString();
    }
}