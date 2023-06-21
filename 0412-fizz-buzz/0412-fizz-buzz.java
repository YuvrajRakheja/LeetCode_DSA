class Solution {
    public List<String> fizzBuzz(int num) {
        List<String> ans=new ArrayList<>();
        
        for(int n=1;n<=num;n++){
            if(n%3==0 && n%5==0){
                ans.add("FizzBuzz");
            }else if(n%3==0){
                ans.add("Fizz");
            }else if(n%5==0){
                ans.add("Buzz");
            }else{
                ans.add(n+"");
            }
        }
        return ans;
    }
}