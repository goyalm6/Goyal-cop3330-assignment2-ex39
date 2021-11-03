package ex39;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void sortEmployeesSortsEmployeesByLastName() {
        Employee emp = new Employee("John", "Johnson", "Manager", "2016-12-31");
        emp.employees.put(1,emp);
        Employee emp1 = new Employee("Michael", "Webber", "Software Engineer", "2016-10-05");
        emp.employees.put(2,emp1);
        Employee emp2 = new Employee("Amanda", "Callan", "Programmer", "2016-12-19");
        emp.employees.put(3,emp2);

        Map<Integer, Employee> sortedList = ex39.Employee.SortEmployees();
        assertEquals("[3, 1, 2]", sortedList.keySet().toString());
    }

    @Test
    void sortEmployeesSortsEmployeesByLastNames() {
        Employee emp = new Employee("Sally", "Xiong", "Manager", "2016-12-31");
        emp.employees.put(1,emp);
        Employee emp1 = new Employee("John", "Doe", "Software Engineer", "2016-10-05");
        emp.employees.put(2,emp1);
        Employee emp2 = new Employee("Amanda", "Webber", "Programmer", "2016-12-19");
        emp.employees.put(3,emp2);

        Map<Integer, Employee> sortedList = ex39.Employee.SortEmployees();
        assertEquals("[2, 3, 1]", sortedList.keySet().toString());
    }
}