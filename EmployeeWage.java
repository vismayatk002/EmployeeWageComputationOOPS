class EmployeeWage{
      
    int IS_PRESENT = 1;
    public void checkIsPresent(double empCheck){
        if(empCheck == IS_PRESENT)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent"); 
    }
}