package LinkList;
public class LinkList {

	public static void main(String[] args) {
	
			LinkListImpl l = new LinkListImpl();
			CircularLinkListImpl cl = new CircularLinkListImpl();
			cl.insert(12);
			cl.insert(123123);
			cl.insert(22);
			cl.insert(2112);
			l.insert(5);
			l.insert(123);
			l.insert(21);
			l.display();
		}
	
	
	}


