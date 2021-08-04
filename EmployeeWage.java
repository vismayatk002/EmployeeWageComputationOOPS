class EmployeeWage{
    
    int IS_PRESENT = 1;
    int WAGE_PER_HR=20;
    int FULL_DAY_HR=8;

    public boolean checkIsPresent(double empCheck){
        if(empCheck == IS_PRESENT){
            return true;
        }
        else{
            return false;
        }
    }
    public int calcDailyEmpWage(){
        int dailyEmpWage =  WAGE_PER_HR * FULL_DAY_HR;
        return  dailyEmpWage; 
    }
}