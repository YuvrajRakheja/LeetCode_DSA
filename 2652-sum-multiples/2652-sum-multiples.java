class Solution {
    public int sumOfMultiples(int n) {
        int sum3=calc(n,3);
        int sum5=calc(n,5);
        int sum7=calc(n,7);
        
        int sum15=calc(n,15);//a*b->15
        int sum35=calc(n,35);//b*c->35
        int sum21=calc(n,21);//c*a->21
        
        int sum105=calc(n,105);//a*b*c;
        
        return (sum3+sum5+sum7-sum15-sum35-sum21+sum105);
    }
    public int calc(int n,int div){
        int nos_of_ele=n/div;
        int sum=(nos_of_ele*(nos_of_ele+1))/2;//n*(n+1)/2
        
        return sum*div;
    }
}