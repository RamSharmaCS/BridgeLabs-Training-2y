import java.util.*;

class Employee {
    private String name;
    public Employee(String name){ this.name = name; }
    public String getName(){ return name; }
}

class Department {
    private String name;
    private List<Employee> employees = new ArrayList<>();
    public Department(String name){ this.name = name; }
    public void addEmployee(Employee e){ employees.add(e); }
    public void listEmployees(){
        System.out.println("Dept: " + name);
        for(Employee e: employees) System.out.println("- " + e.getName());
    }
}

class Company {
    private String name;
    private List<Department> departments = new ArrayList<>();
    public Company(String name){ this.name=name; }
    public Department createDepartment(String deptName){
        Department d = new Department(deptName);
        departments.add(d);
        return d;
    }
    public void closeCompany(){
        // simulate deletion: clear all departments & employees
        departments.clear();
        System.out.println("Company " + name + " closed; all departments removed.");
    }
    public void listStructure(){
        System.out.println("Company: " + name);
        for(Department d: departments) d.listEmployees();
    }
}

public class CompanyDeptEmp {
    public static void main(String[] args){
        Company co = new Company("TechCo");
        Department dev = co.createDepartment("Development");
        dev.addEmployee(new Employee("Radhika"));
        dev.addEmployee(new Employee("Priyanshu"));
        co.listStructure();
        co.closeCompany();
        co.listStructure(); // shows nothing
    }
}
