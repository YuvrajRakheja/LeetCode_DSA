//redo
class Solution {
  public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
    var projects = new PriorityQueue<int[]>((a, b) -> Integer.compare(a[0], b[0]));

    for (var i=0; i < profits.length; i++)
      projects.offer(new int[] {capital[i], profits[i]});

    var queue = new PriorityQueue<Integer>(Collections.reverseOrder());

    while (k-- > 0) {
      for (var a = projects.peek(); a != null && a[0] <= w; a = projects.peek())
        queue.offer(projects.poll()[1]);

      if (queue.isEmpty()) return w;
      w += queue.poll();
    }
    return w;
  }
}
