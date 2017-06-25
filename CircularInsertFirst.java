package interview;

public class CircularInsertFirst {
Node last;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
CircularInsertFirst cll=new CircularInsertFirst();
cll.insertFirst(10);
cll.insertFirst(9);
cll.insertFirst(8);
cll.insertFirst(7);

cll.traverse();
	}

	public void insertFirst(int d){
		Node n1=new Node(d);
		if(last==null){
			
			n1.next=n1;
			last=n1;
			return;
		}
		n1.next=last.next;
		last.next=n1;
	}
	
	public void traverse(){
		Node temp=last;
		do{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}while(temp!=last);
	}
	
}
