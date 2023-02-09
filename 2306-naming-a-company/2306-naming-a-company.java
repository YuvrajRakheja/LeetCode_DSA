class Solution {
    public long distinctNames(String[] ideas) {
        long ans=0;
        HashSet<String>[] hset=new HashSet[26];
        for(int i=0;i<26;i++){
        	hset[i]=new HashSet<>();
        }
        for(String str:ideas){
        	hset[str.charAt(0)-'a'].add(str.substring(1));
        }
        for(int i=0;i<26;i++){
        	for(int j=i+1;j<26;j++){
                if(hset[i].size()>0 && hset[j].size()>0){
                    long sameSuffixes=0;
        		    for(String s:hset[i]){
        			    if(hset[j].contains(s)){
        				    sameSuffixes++;
        			    }
        		    }
        		    long combinations=(hset[i].size()-sameSuffixes)*(hset[j].size()-sameSuffixes);
        		    ans+=2*combinations;
                }
        	}
        }
        return ans;
    }
}
