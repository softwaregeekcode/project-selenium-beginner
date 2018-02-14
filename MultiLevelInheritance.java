package javaBeginner;

class car{
	
	public car() {
		System.out.println("Class Car");
	}
	public void vechicleType() {
		System.out.println("Vechicle type: Car");
	}
}

class Maruti extends car{
	public Maruti() {
		System.out.println("Class Maruti");
	}
	public void brand() {
		System.out.println("Brand: Maruti");
	}
	public void speed() {
		System.out.println("Max: 90 KMpH");
	}
	
}

class Maruti800 extends Maruti{
	public Maruti800() {
		System.out.println("maruti model 800");
	}
	public void speed() {
		System.out.println("Max: 80 KMpH");
	}
}



public class MultiLevelInheritance extends Maruti800 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Maruti800 obj  = new Maruti800();
		obj.vechicleType();
		obj.brand();
		obj.speed();

	}

}
