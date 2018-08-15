package LinkList;

public class NodeCircularLink {

	int data;
	NodeCircularLink prev;
	NodeCircularLink next;
	
	public NodeCircularLink(int data){
		this.data = data;
		this.prev = null;
		this.next = null;
	}
}
