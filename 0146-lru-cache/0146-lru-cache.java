class LRUCache {
    public class Node{
        int key,value;
        Node prev,next;
        
        Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    HashMap<Integer,Node> map=new HashMap<>();
    Node head=new Node(0,0),tail=new Node(0,0);
    int cap;
    
    public LRUCache(int capacity) {
        cap=capacity;
        head.next=tail;
        tail.prev=head;
        
    }
    private void insert(Node node){
        map.put(node.key,node);
    
        Node nextnbr=head.next;
        
        head.next=node;
        nextnbr.prev=node;
            
        node.next=nextnbr;
        node.prev=head;
        
    }
    private void remove(Node node){
        Node prvnode=node.prev;
        Node nxtnode=node.next;
        
        prvnode.next=nxtnode;
        nxtnode.prev=prvnode;
    } 
    public int get(int key) {
        Node nn=map.get(key);
        
        if(nn==null){
            return -1;
        }else{
            int vl=nn.value;
            remove(nn);
            insert(nn);
            return vl;
        }
    }
    
    public void put(int key, int value) {
        Node nn=map.get(key);
        if(map.containsKey(key)){
            nn.value=value;
            remove(nn);
            insert(nn);
        }else{
            Node newNode=new Node(key,value);
            if(cap==map.size()){
                Node toberemoved=tail.prev;
                map.remove(toberemoved.key);
                remove(toberemoved);
            }
            insert(newNode);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */