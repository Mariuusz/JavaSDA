package pl.anicos.patterns.exercises.prototype;

import org.junit.Assert;
import org.junit.Test;

public class EmployeesTest {

    @Test
    public void shouldCloneObj() throws CloneNotSupportedException {
        Employees employees = new Employees();
        employees.addNew("E1");
        employees.addNew("E2");

        //Use the clone method to get the Employee object
        Employees clone = (Employees) employees.clone();
        employees.addNew("E3");
        clone.addNew("E4");

        System.out.println("employees List: " + employees.getEmpList());
        System.out.println("clone List: " + clone.getEmpList());

        Assert.assertEquals(3, employees.getEmpList().size());
        Assert.assertEquals(3, clone.getEmpList().size());
    }
}