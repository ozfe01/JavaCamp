package odev4_2;

public abstract class CustomerManager implements CustomerService {
	public void save(Customer customer) {
		System.out.println("Veritaban�na eklendi " + customer.getFirstName());
	}
	public void delete() {
		
	}
	public void update() {
		
	}
	
}
