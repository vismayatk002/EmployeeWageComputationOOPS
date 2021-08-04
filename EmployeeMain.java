public class EmployeeMain{

    public static void main(String[] args){
        EmployeeWage emp = new EmployeeWage();
        int empCheck = (int)(Math.random() * 10) % 2;
        int empType = (int)(Math.random() * 10) % 2;
        if(emp.checkIsPresent(empCheck)){
            emp.calcDailyEmpWage(empType);
        }
        else{
            System.out.println("Employee is absent");
        }
    }
}