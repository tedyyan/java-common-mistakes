package javaskill.mapstruct;
/**
*@author    created by Teddy
*@date  Aug 10, 2020---12:31:45 PM
*/

public class CustomerDTO {

    public Long id;
    public String customerName;
    
    CustomerDTO(Long id, String customerName){
    	this.id = id;
    	this.customerName = customerName;
    }
}
