
package firstapp;

import java.time.LocalDateTime;


public class Client {

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

   
    private String firstName;
    private String lastName;
    private LocalDateTime lastTransaction;
    
    
}
