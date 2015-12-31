import java.util.Random;
public class Partition{
	public Node doPartitionStable(Node head, int x){
		Node lessStartPointer=null, lessEndPointer=null;
		Node greaterStartPointer=null, greaterEndPointer=null;

		Node pointer = head;
		while(pointer != null){
			if(pointer.data <x){
				if(lessStartPointer == null){
					lessStartPointer = pointer;
					lessEndPointer = pointer;
				}
				else{
					lessEndPointer.next = pointer;
					lessEndPointer = lessEndPointer.next;
				}
			}
			else{
				if(greaterStartPointer == null){
					greaterStartPointer = pointer;
					greaterEndPointer = pointer;
				}
				else{
					greaterEndPointer.next = pointer;
					greaterEndPointer = greaterEndPointer.next;
				}
			}
			pointer = pointer.next;
		}

		if(lessStartPointer == null) return greaterStartPointer;
		
		lessEndPointer.next = greaterStartPointer;
		greaterEndPointer.next = null;
		return lessStartPointer;
	}
	public Node doPartitionSpace(Node head, int x){
		Node startPointer = head;
		Node pointer  = head;
		Node prev = null;
		while(pointer != null){
			if(pointer.data < x){
				if(prev == null){
					prev = pointer;
					pointer = pointer.next;
				}
				else{
					prev.next = pointer.next;
					pointer.next = startPointer;
					startPointer = pointer;
					pointer = prev.next;

				}
			}
			else{
				prev = pointer;
				pointer = pointer.next;
			}
		}
		return startPointer;
	}

	public static void main(String[] args){
		Random rand = new Random(123);
		Node head=null;
		for(int i = 0; i<11; i++){
			if(head == null){
				head = new Node(rand.nextInt(50));
			}
			else{
				head.appendToTail(rand.nextInt(50));
			}

		}

		System.out.println(head);
		Partition par = new Partition();
		//Node head1 = par.doPartitionStable(head, 25);
		Node head2 = par.doPartitionSpace(head, 25);
		//System.out.println(head1);
		System.out.println(head2);
	}
}
