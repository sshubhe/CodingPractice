package LinkList;

public class CircularLinkListImpl {

	NodeCircularLink Start,End;
	boolean CircularListStarted = false;
	public CircularLinkListImpl(){
		this.Start = null;
	}
	
	public void insert(int val){
		NodeCircularLink CompleteCircularImpl;
		if(Start == null){
			Start = new NodeCircularLink(val);
			CircularListStarted = true;
		}
		else{
			insert(Start,val);
			End.next = Start;
			}
		
	}

	
	public void insert(NodeCircularLink n , int data){
		
		
			if(n == End || n.next == null){
				NodeCircularLink nextnode = new NodeCircularLink(data);
				n.next = nextnode;
				n.next.prev = n;
				End = n.next;				
			}
			else{
			n = n.next;
			insert(n,data);
			}
		
	}
	
	
	
}
