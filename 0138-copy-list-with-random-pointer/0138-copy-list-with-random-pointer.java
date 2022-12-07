/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map=new HashMap<>();
        
        Node curr=head;
        Node nhead=new Node(-1);
        Node prev=nhead;
        
        while(curr!=null){
            Node nn=new Node(curr.val);
            prev.next=nn;
            map.put(curr,nn);
            
            prev=prev.next;
            curr=curr.next;
        }
        nhead=nhead.next;
        Node c1=head;
        Node c2=nhead;
        
        while(c1!=null){
            c2.random=(c1!=null)?map.get(c1.random):null;
            
            c1=c1.next;
            c2=c2.next;
        }
        return nhead;
    }
}