
package common;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author F03 H4MM3R
 */
public class EmployeeListRunnerWithGenerics {
    
    public static void main(String[] args) {
        
    List<Employee> list = new ArrayList<Employee>();
    
    Employee e1 = new Employee("Bond", "David", "123456789");
    Employee e2 = new Employee("Maddux", "Kiara", "987654321");
    Employee e3 = new Employee("Hancock", "Nick", "555555555");
    Employee e4 = new Employee("Winterhalter", "Bill", "555555555");
    
    list.add(e1);
    list.add(e2);
    list.add(e3);
    list.add(e4);
    
    int size = list.size();
    System.out.println(size);
    Employee emp = list.get(1);
    System.out.println(emp);
    
    for(int i=0; i< list.size(); i++) {
        Employee e = list.get(i);
        System.out.println(e);
        }
    }
}
