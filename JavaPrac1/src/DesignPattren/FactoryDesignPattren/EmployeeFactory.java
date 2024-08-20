package DesignPattren.FactoryDesignPattren;

public class EmployeeFactory {

    public Employee getEmployee(String employeeType){
        if(employeeType.trim().equalsIgnoreCase("BackendDev")){
            return new BackendDev();
        } else if (employeeType.trim().equalsIgnoreCase("WebDev")) {
            return new WebDev();
        }else {
            return null;
        }
    }
}
