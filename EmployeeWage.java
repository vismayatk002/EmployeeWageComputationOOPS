class EmployeeWage{
    
    final int IS_PRESENT = 1;
    final int FULL_TIME = 1;
    final int WORKING_DAYS = 20;
    int fullDayHr= 16;
    int wagePerHr = 20;
    
    public boolean checkIsPresent(int empCheck){
        if(empCheck == IS_PRESENT){ 
            return true;
        }
        else{ 
            return false;
        }
    }
    public int calcDailyEmpWage(int empType){

         int dailyEmpWage = 0;
        switch(empType){
            case  FULL_TIME : 
                dailyEmpWage =  wagePerHr * fullDayHr;
            break;
            default : 
                dailyEmpWage = dailyEmpWage / 2;
                
        }
        return dailyEmpWage;
    }
    public int calcMonthlyWage(){

        int monthlyWage = 0;
        int dailyWage;
        for(int day=1; day<=WORKING_DAYS; day++){
            int empCheck = (int)(Math.random() * 10) % 2;
            if(checkIsPresent(empCheck)){    
                int empType = (int)(Math.random() * 10) % 2;
                dailyWage = calcDailyEmpWage(empType);   
            
                monthlyWage += dailyWage;
            }
        }
        return monthlyWage;
    }
}