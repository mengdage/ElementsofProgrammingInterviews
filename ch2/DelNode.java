public class DelNode{
	public boolean remove(Node m){
		if(m==null || m.next == null){
			return false;
		}
		m.data = m.next.data;
		m.next = m.next.next;
		return true;
	}
	public static void main(String[] args){
		Node head=null;
		for(int i = 0; i< 10; i++){
			if(head == null){
				head = new Node(i);
			}
			else{
				head.appendToTail(i);
			}
		}

		System.out.println(head);
		
		DelNode delNode = new DelNode();
		if(delNode.remove(head.next.next))
			System.out.println(head);


	}
}
