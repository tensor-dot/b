import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SingleLinkedList {
private Node head;

public Node getHead() {
	return head;
}

public void setHead(Node head) {
	this.head = head;
}

public SingleLinkedList() {
	super();
	this.head = null;
}

public boolean insert(int carId, String carOwnerName, String carModel, double carPrice) {
	Node nn = new Node(carId,carOwnerName,carModel,carPrice);
	
	if(head==null) {
		head = nn;
		return true;
	}
	Node last = head ;
	while(last.getNext()!=null) {
		last = last.getNext();
	}
	last.setNext(nn);
	return true;

}


public void display() {
	Node temp = head;
	while(temp!=null) {
		System.out.println(temp);
		temp=temp.getNext();
	}
	
}

public int totalNodes() {
	int count =0;
	Node temp = head;
	while(temp!=null) {
		count++;
		temp=temp.getNext();
	}
	return count;
}

public boolean delete() {
	if(head == null) {
		return false;
	}
	Node temp = head;
	while(temp.getNext().getNext()!=null) {
		temp=temp.getNext();
	}
	temp.setNext(null);
	return true;
	
}

public boolean insertFromFront(int carId, String carOwnerName, String carModel, double carPrice) {
	Node nn = new Node(carId,carOwnerName,carModel,carPrice);
	if(head==null) {
		head = nn;
		return true;
	}
	nn.setNext(head);
	head=nn;
	return true;
}

public boolean deleteFromFront() {
	if(head==null) {
		return false;
	}
	head=head.getNext();
	return true;
}

public void findByModel(String model) {
	Node temp = head;
	while(temp!=null) {
		if(temp.getCarModel().equals(model)) {
			System.out.println(temp);
		}
		temp=temp.getNext();
	}
}

public void sortCarByPrice() {
	List<Node> list = new ArrayList<>();
	Node temp=head;
	while(temp!=null) {
		list.add(temp);
		temp=temp.getNext();
	}
	
//	int size=list.size();
//	list.toArray();
//	for(int i=0;i<size;i++) {
//		System.out.println();
//	}
	
	list.sort(new Comparator<Node>() {
		@Override
		public int compare(Node t1, Node t2) {
			if(t1.getCarPrice()<t2.getCarPrice())
				return 1;
			else if (t1.getCarPrice()>t2.getCarPrice())
				return -1;
			return 0;
		}
	});
	list.forEach(System.out::println);
}

public boolean insertByPosition(int carId, String carOwnerName, String carModel, double carPrice,int pos) {
	Node nn = new Node(carId,carOwnerName,carModel,carPrice);
	if(pos<=0 || head == null ) {
		return false;
	}
	if(pos==1) {
		nn.setNext(head);
		head=nn;
		return true;
	}
	Node prev = head;
	for(int i=1;i<pos-1;i++) {
		prev = prev.getNext();
		if(prev==null)
			return false;
	}
	nn.setNext(prev.getNext());
	prev.setNext(nn);
	return true;
}

public boolean deleteByPosition(int pos) {
	if(pos<=0 || head == null ) {
		return false;
	}
	if(pos==1) {
		head=head.getNext();
		return true;
	}
	Node prev = head;
	for(int i=1;i<pos-1;i++) {
		prev = prev.getNext();
		if(prev==null)
			return false;
	}
	prev.setNext(prev.getNext().getNext());
	return true;
}

}
