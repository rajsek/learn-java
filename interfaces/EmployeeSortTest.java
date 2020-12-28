package interfaces;

import java.util.Arrays;

public class EmployeeSortTest {
    public static void main(String[] args) {
        var staff = new Employee[3];
        staff[0] = new Employee("Ashwin", 2500000);
        staff[1] = new Employee("Raj", 210000);
        staff[2] = new Employee("kumar", 2568715);
        
        Arrays.sort(staff);

        for(Employee e: staff) {
            System.out.println("Name="+e.getName()+", salary = "+e.getSalary());
        }

    }
    
}
