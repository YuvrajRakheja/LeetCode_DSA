class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return Collections.emptyList();
        
        List<List<Character>> letters = new ArrayList<>();
        List<String> output = new ArrayList<>();

        everyNumber(new ArrayList<>(),letters,digits);
        backTrack(output, new String(), letters,0, digits.length());

        return output;
    }
    private void everyNumber(List<Character> letters,List<List<Character>> numbers,String digits){
        int length = digits.length();

        for (int i=0;i<length;i++) {
            char c = digits.charAt(i);
            switch (c) {
                case '2':
                    letters.addAll(Arrays.asList('a','b','c'));
                    break;
                case '3':
                    letters.addAll(Arrays.asList('d','e','f'));
                    break;
                case '4':
                    letters.addAll(Arrays.asList('g','h','i'));
                    break;
                case '5':
                    letters.addAll(Arrays.asList('j','k','l'));
                    break;
                case '6':
                    letters.addAll(Arrays.asList('m','n','o'));
                    break;
                case '7':
                    letters.addAll(Arrays.asList('p','q','r','s'));
                    break;
                case '8':
                    letters.addAll(Arrays.asList('t','u','v'));
                    break;
                case '9':
                    letters.addAll(Arrays.asList('w','x','y','z'));
                    break;
            }
            numbers.add(new ArrayList<>(letters));
            letters.clear();
        }
        
    }
    private void backTrack(List<String> output,String tempOutput, List<List<Character>> tempList,int indexTemList,int length){
        int size = tempOutput.length();
        if(size==length) {
            output.add(tempOutput);
            return;
        }
        else{
            for (int i = 0; i < tempList.get(indexTemList).size(); i++) {
                backTrack(output,tempOutput+=tempList.get(indexTemList).get(i),tempList,indexTemList+1,length);
                tempOutput = tempOutput.substring(0,size);
            }
        }
    }
}
