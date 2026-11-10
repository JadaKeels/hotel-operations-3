public class Employee {

    import java.time.LocalDateTime;

    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double punchInTime;

    public Employee(String employeeId,
                    String name,
                    String department,
                    double payRate) {

        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = 0;
    }

    public void punchIn(double time) {
        punchInTime = time;
        System.out.println(name + " punched in at " + time);
    }

    public void punchOut(double time) {

        double hours = time - punchInTime;
        hoursWorked += hours;

        System.out.println(name + " punched out at " + time);
        System.out.println("Hours worked this shift: " + hours);
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getTotalPay() {
        return hoursWorked * payRate;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }
}
