class Employee {

    private String Name;
    private int employeeId;
   
    private double salary;

    public void Name(String firstName) {
        this.Name = firstName;
    }
    public void setEmployeeId(int a) {
        this.employeeId = a;
    }
    public void setSalary(double b) {
        this.salary = b;
    }

   
    
    @Override
    public String toString() {
        return "Employee Details:\n" +
                "First Name: " + Name + "\n" +
              
                "Employee ID: " + employeeId + "\n" +
             
                "Salary: " + salary;
    }
}

public  class q2 {
    
   
    public static void main(String[] args) {
        Employee emp  = new Employee();
        emp.Name("John");
        emp.setEmployeeId(12345);
       
        emp.setSalary(50000.00);
       
        System.out.println(emp.toString());

        

       
        
    }
    
}
