package interview;

public class CircularLinkedList {
Node last;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
CircularLinkedList cll=new CircularLinkedList();
              cll.last=new Node(10);
              cll.last.next=cll.last;
              Node second=new Node(20);
              second.next=cll.last.next;
              cll.last.next=second;
              cll.last=second;
              Node third=new Node(30);
              third.next=cll.last.next;
              cll.last.next=third;
              cll.last=third;
              cll.traverse();
	}

	public void traverse(){
		Node temp=last;
		do{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}while(temp!=last);
	}
	
}
