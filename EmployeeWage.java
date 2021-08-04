class EmployeeWage{
      
    int IS_PRESENT = 1;
    int WAGE_PER_HR=20;
    int FULLDAY_HR=8;

    public boolean checkIsPresent(double empCheck){
        if(empCheck == IS_PRESENT){
            return true;
        }
        else{
            return false;
        }
    }
    public void calcDailyEmpWage(){
        int dailyEmpWage =  WAGE_PER_HR * FULLDAY_HR;
        System.out.println("Daily Employee Wage :" + dailyEmpWage);
    }
}