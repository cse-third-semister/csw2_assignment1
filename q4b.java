class com{
    private String Name;
    private int employeeId;
   
    private double salary;
    com(){

    }
    public com(String firstName,int a,double b){
        this.Name = firstName;
        this.employeeId = a;
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
public class q4b {
    public static void main(String[] args) {
       
        
        com emp  = new com("hari",54,56465);
       
        System.out.println(emp.toString());

        

       
        
    }
  
    
}
