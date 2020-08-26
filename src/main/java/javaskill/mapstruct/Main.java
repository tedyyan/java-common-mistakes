package javaskill.mapstruct;
/**
*@author    created by Teddy
*@date  Aug 10, 2020---4:06:53 PM
*/
public class Main {

	public static void main(String[] args) {
		CustomerDTO customerDto = new CustomerDTO(1l,"abc");
		Customer c = CustomerMapper.INSTANCE.toCustomer(customerDto);
		System.out.print(c.getId());

	}

}
