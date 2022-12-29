class Solution {
    private class Task implements Comparable {
        final int id;
        final int et;
        final int pt;

        public Task(int id, int et, int pt) {
            this.id = id;
            this.et = et;
            this.pt = pt;
        }

        @Override
        public int compareTo(Object o) {
            Task t = (Task)o;
            return (pt == t.pt) ? Integer.compare(id, t.id) : Integer.compare(pt, t.pt);
        }
    }


    public int[] getOrder(int[][] tasks) {
        List<Task> stasks = new ArrayList<>(tasks.length); 
        for (int i = 0 ; i < tasks.length; ++i) {
            stasks.add(new Task(i, tasks[i][0], tasks[i][1]));
        }
        stasks.sort((t1, t2) -> Integer.compare(t1.et, t2.et));
        
        PriorityQueue<Task> pq = new PriorityQueue<>();
        
        int i = 0;
        int t = 0;
        int j = 0;
        int[] ans = new int[tasks.length];
        
        while (i < stasks.size() || !pq.isEmpty()) {
            if (i < stasks.size() && pq.isEmpty() && t < stasks.get(i).et) {
                t = stasks.get(i).et;
            }
            while (i < stasks.size() && stasks.get(i).et <= t) {
                pq.add(stasks.get(i));
                i += 1;
            }
            if (!pq.isEmpty()) {
                ans[j] = pq.peek().id;
                j += 1;
                t += pq.poll().pt;
            }
        }
        return ans;
    }
}

