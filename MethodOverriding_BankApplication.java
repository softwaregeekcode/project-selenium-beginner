package javaBeginner;

class Bank{
	int getRatOofInterest() {
		return 0;
		}
}

class SBI extends Bank{
	int getRateOfInterst() {
		return 8;
	}
}


class ICICI extends Bank{
	int getRateOfInterst() {
		return 7;
	}
}


class AXIS extends Bank{
	int getRateOfInterst() {
		return 9;
	}
}

public class MethodOverriding_BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		
		System.out.println("SBI rate of Interest:"+s.getRateOfInterst());
		System.out.println("ICICI rate of Interest:"+s.getRateOfInterst());
		System.out.println("AXIS rate of Interst:"+s.getRateOfInterst());

	}

}
