package javaskill.mapstruct;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
*@author    created by Teddy
*@date  Aug 10, 2020---12:24:34 PM
*/



@Mapper
public interface CustomerMapper {
	
    CustomerMapper INSTANCE = Mappers.getMapper( CustomerMapper.class );

    @Mapping(source = "customerName", target = "name")
    Customer toCustomer(CustomerDTO customerDto);

    @InheritInverseConfiguration
    CustomerDTO fromCustomer(Customer customer);
}
