class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        List<List<Integer>> ans = new ArrayList<>();
        
        Comparator<Pair> comp = (a, b) -> a.sum == b.sum ? a.x - b.x : a.sum - b.sum;
        TreeSet<Pair> set = new TreeSet<>(comp);
        set.add(new Pair(0, 0, nums1[0] + nums2[0]));
        
        while (k > 0 && !set.isEmpty()) {
            Pair pair = set.pollFirst();
            int v1 = nums1[pair.x];
            int v2 = nums2[pair.y];
            ans.add(Arrays.asList(v1, v2));
            
            if (pair.x+1 < len1) {
                set.add(new Pair(pair.x+1, pair.y, nums1[pair.x+1] + nums2[pair.y]));
            }
            if (pair.y+1 < len2) {
                set.add(new Pair(pair.x, pair.y+1, nums1[pair.x] + nums2[pair.y+1]));
            }
            k--;
        }
        return ans;
    }
    
    private record Pair(int x, int y, int sum) {}
}
