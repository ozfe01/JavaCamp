package odev4_2;

public class OracleDao implements CustomerDao {


	@Override
	public void add(Customer customer) {
		System.out.println(customer.getFirstName() + " eklendi.");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Silindi.");// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("BÝlgileriniz güncellendi.");// TODO Auto-generated method stub
		
	}
	
}
