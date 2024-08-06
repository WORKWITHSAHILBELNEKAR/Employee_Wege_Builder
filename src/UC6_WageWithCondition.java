public class UC6_WageWithCondition {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int maxWorkingDays = 20;
        int maxWorkingHours = 100;
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalWage = 0;

        while (totalWorkingDays < maxWorkingDays && totalWorkingHours < maxWorkingHours) {
            int empType = (int) Math.floor(Math.random() * 10) % 3;
            int empHrs = 0;
            switch (empType) {
                case 0: empHrs = 0; break;
                case 1: empHrs = 4; break;
                case 2: empHrs = 8; break;
            }
            totalWorkingHours += empHrs;
            totalWorkingDays++;
            totalWage += empHrs * wagePerHour;
        }
        System.out.println("Total Wage: $" + totalWage);
    }
}