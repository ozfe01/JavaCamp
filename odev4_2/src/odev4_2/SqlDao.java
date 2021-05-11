package odev4_2;

public class SqlDao implements CustomerDao {

	@Override
	public void add(Customer customer) {
		System.out.println(customer.getFirstName() + " Sql ile eklendi");
		
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		
	}

}
