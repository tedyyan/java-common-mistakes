package javaskill.mapstruct;

import lombok.Getter;
import lombok.Setter;

/**
*@author    created by Teddy
*@date  Aug 10, 2020---12:31:24 PM
*/

@Getter @Setter // <--- THIS is it
public class Customer {

    private Long id;
    private String name;

    //getters and setter omitted for brevity
}
