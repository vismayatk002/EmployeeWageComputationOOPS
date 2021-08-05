public class EmployeeMain{

    public static void main(String[] args){
        
        EmployeeWage emp = new EmployeeWage(20,20);
        int wage = emp.calcMonthlyWage();
        System.out.println("Monthly wage :" + wage);
    }
}