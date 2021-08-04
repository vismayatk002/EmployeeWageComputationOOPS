class EmployeeWage{
      
    int IS_PRESENT = 1;
    int WAGE_PER_HR = 20;
    int FULLDAY_HR = 16;
    int FULLTIME = 1;
    public boolean checkIsPresent(double empCheck){
        if(empCheck == IS_PRESENT){
            return true;
        }
        else{
            return false;
        }
    }
    public void calcDailyEmpWage(double empType){
        int dailyEmpWage =  WAGE_PER_HR * FULLDAY_HR;
        if(empType == FULLTIME){
            System.out.println("Employee Type : Full time");
            System.out.println("Daily Employee Wage :" + dailyEmpWage);
        }
        else{
            System.out.println("Employee Type : Part time");
            System.out.println("Daily Employee Wage :" + (dailyEmpWage / 2));
        }
    }
}