
package common;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author F03 H4MM3R
 */
public class EmployeeList {
    
    List employeeList = new ArrayList();
    public EmployeeList(){
    employeeList.add(new Employee("Bond", "David", "123456789"));
    employeeList.add("Maddux", "Kiara", "987654321");
    employeeList.add("Hancock", "Nick", "555555555");
    }
}
