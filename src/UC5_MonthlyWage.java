public class UC5_MonthlyWage {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int fullDayHour = 8;
        int workingDays = 20;
        int monthlyWage = wagePerHour * fullDayHour * workingDays;
        System.out.println("Monthly Wage: $" + monthlyWage);
    }
}