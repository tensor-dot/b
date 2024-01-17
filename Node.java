
public class Node {
	
	private int CarId;
	private String CarOwnerName;
	private String CarModel;
	private double CarPrice;
	private Node next;
	
	public int getCarId() {
		return CarId;
	}

	public void setCarId(int carId) {
		CarId = carId;
	}

	public String getCarOwnerName() {
		return CarOwnerName;
	}

	public void setCarOwnerName(String carOwnerName) {
		CarOwnerName = carOwnerName;
	}

	public String getCarModel() {
		return CarModel;
	}

	public void setCarModel(String carModel) {
		CarModel = carModel;
	}

	public double getCarPrice() {
		return CarPrice;
	}

	public void setCarPrice(double carPrice) {
		CarPrice = carPrice;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node(int carId, String carOwnerName, String carModel, double carPrice) {
		super();
		CarId = carId;
		CarOwnerName = carOwnerName;
		CarModel = carModel;
		CarPrice = carPrice;
		this.next=null;
	}

	@Override
	public String toString() {
		return "Node [CarId=" + CarId + ", CarOwnerName=" + CarOwnerName + ", CarModel=" + CarModel + ", CarPrice="
				+ CarPrice + "]";
	}
	
	
	
	

}
