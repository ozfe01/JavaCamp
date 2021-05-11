package odev4_2;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1,"halit","özdemir",2002,"44317728950");
		
		CustomerManager a = new StarbucksCustomerManager(new MernisServiceAdapter());
		a.save(customer1);
				
		

	}

}
