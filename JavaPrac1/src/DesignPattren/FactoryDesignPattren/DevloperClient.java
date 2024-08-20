package DesignPattren.FactoryDesignPattren;

public class DevloperClient {
    public static void main(String[] args) {
/*
    *  The Factory Method pattern defines an interface for creating a single object in super class ,
    *  but lets subclasses alter the type of objects that will be created.

      Useful when there is one superclass and multiple subclasses and we get the object of the subclasses
      based on input and requirements

      This pattern promotes loose coupling by eliminating the need to bind application-specific sub
      * classes into the code.
    * */
        EmployeeFactory employeeFactory = new EmployeeFactory();
        Employee Emp = employeeFactory.getEmployee("WebDev");
        System.out.println(Emp.Salary());

        Employee Emp1 = employeeFactory.getEmployee("BackendDeV");
        System.out.println(Emp1.Salary());



    }
}
