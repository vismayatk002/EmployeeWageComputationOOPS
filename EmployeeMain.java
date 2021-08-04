public class EmployeeMain{

    public static void main(String[] args){
        EmployeeWage emp = new EmployeeWage();
        double empCheck = Math.floor (Math.random() * 10) % 2;
        double empType = Math.floor (Math.random() * 10) % 2;
        if(emp.checkIsPresent(empCheck)){
            emp.calcDailyEmpWage(empType);
        }
        else{
            System.out.println("Employee is absent");
        }
    }
}