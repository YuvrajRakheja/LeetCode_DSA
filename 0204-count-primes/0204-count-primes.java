//TC-0(NLOGLOGN)
//SC-0(N)
//SIEVE_OF_ERATOSTHENES

class Solution {
    public int countPrimes(int n) {
        if(n<= 1)    return 0;
        
        boolean[] prime=new boolean[n+1];
        Arrays.fill(prime,true);
        
        //true means prime false means not prime
        int cnt=0;
        
        for(int i=2;i*i<=prime.length;i++){
            if(prime[i]==true){
                for(int j=2*i;j<prime.length;j+=i){
                    prime[j]=false;//marking not prime
                }
            }
        }
        for(int i=2;i<n;i++){
            if(prime[i]==true){
                cnt++;
            }
        }
        return cnt;
    }
}