class Node{
	public int data;
	public Node next = null;

	public Node(int i){
		data = i;
	}

	public void appendToTail(int n){
		Node newNode = new Node(n);
		Node tail = this;
		while(tail.next != null){
			tail = tail.next;
		}
		tail.next = newNode;
	}
	public String toString(){
		StringBuilder result = new StringBuilder();
		result.append("[");
		Node head = this;
		while(head != null){
			result.append(head.data + ", ");
			head = head.next;
		}
		if(result.length() >1){
			result.deleteCharAt(result.length()-1);
			result.deleteCharAt(result.length()-1);
		}
		result.append("]");
		return result.toString();
	}
}

public class K2Last{
	private int numToLast=0;
	public Node findKLast(Node n, int k){
		if(n == null) return null;
		//numToLast = findKLast(n.next, k) +1;
		Node nd = findKLast(n.next, k);
		numToLast++;

		if(numToLast == k){
			System.out.printf("the %d th node to the last has the value %d\n", k, n.data);
			return n;
		}
		return nd;
	}

	public static void main(String[] args){
		Node head=null;
		for(int i = 0; i< 11; i++){
			if(head==null){
				head = new Node(i);
			}
			else{
				head.appendToTail(i);
			}
		}
		System.out.println(head);

		K2Last klast = new K2Last();
		Node nd = klast.findKLast(head, 5);
		System.out.printf("The %dth node to the last is the Node with the value %d\n", 5, nd.data);


	}
}
