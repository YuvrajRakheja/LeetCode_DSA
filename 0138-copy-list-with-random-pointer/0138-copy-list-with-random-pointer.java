//TC-0(N)
//SC-0(1)
//OPTIMIZED
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
        if(head==null){
            return head;
        }
        copyList(head);
        copyRandomPointers(head);
        return extractDeepCopy(head);
    }
    
    public void copyList(Node node){
        Node curr=node;
        
        while(curr!=null){
            Node forwd=curr.next;
            Node nn=new Node(curr.val);
            
            curr.next=nn;
            nn.next=forwd;
            
            curr=forwd;
        }
    }
    public void copyRandomPointers(Node node){
        Node curr=node;
        
        while(curr!=null){
            Node random=curr.random;
            if(random!=null){
                curr.next.random=random.next;
            }
                        
            curr=curr.next.next;            
        }
    }
    public Node extractDeepCopy(Node node){
        Node dummy=new Node(-1);
        Node prev=dummy,curr=node;
        
        while(curr!=null){
            prev.next=curr.next;
            prev=prev.next;
            
            curr.next=prev.next;
            curr=curr.next;
        }
        return dummy.next;
    }
    
}