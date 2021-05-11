package odev4_2;

public class StarbucksCustomerManager extends CustomerManager {
	
	private PersonCheckService personCheckService;
	
	
	public StarbucksCustomerManager(PersonCheckService personCheckService) {
		super();
		this.personCheckService = personCheckService;
	}


	public void save(Customer customer) {
		if(personCheckService.checkPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Geçersiz müþteri");
		}
	}
}
