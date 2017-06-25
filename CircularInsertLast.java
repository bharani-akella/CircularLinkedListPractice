package interview;

public class CircularInsertLast {
Node last;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
               CircularInsertLast cll=new CircularInsertLast();
               cll.insertLast(10);
               cll.insertLast(40);
               cll.insertLast(30);
               cll.insertLast(40);
               
               cll.traverse();
	}

	public void insertLast(int d){
		Node n1=new Node(d);
		if(last==null){
			n1.next=n1;
			last=n1;
		}
		n1.next=last.next;
		last.next=n1;
		last=n1;
	}
	
	public void traverse(){
		Node temp=last;
		do{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}while(temp!=last);
	}
}
