public class EmployeeAttendance {
    public static void main(String[] args) {
        double isPresent = Math.floor(Math.random() * 10) % 2;
        if (isPresent == 1)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is absent");
    }
}