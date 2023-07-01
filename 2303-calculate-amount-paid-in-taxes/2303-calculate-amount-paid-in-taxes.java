class Solution {
    public double calculateTax(int[][] brackets, int income) {
        int idx=0;
        double tax=0.0;
        
        while(income>0){
            int curr=(idx>=1)?brackets[idx][0]-brackets[idx-1][0]:brackets[idx][0];
            
            if(income>=curr){
                tax+=(curr*brackets[idx][1])/100.0;
            }else{
                tax+=(income*brackets[idx][1])/100.0;
                break;
            }  
            income-=curr;
            idx++;
        }
        return tax;
    }
}