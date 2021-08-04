public class EmployeeMain{

    public static void main(String[] args){
        
        EmployeeWage emp = new EmployeeWage();
        int wage = emp.calcMonthlyWage();
        System.out.println("Monthly wage :" + wage);
    }
}