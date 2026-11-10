public static void main(String[] args) {
    Employee emp =
            new Employee(
                    "E101",
                    "Jada Keels",
                    "IT",
                    25.00);

    emp.punchIn();

    try {
        Thread.sleep(2000);
    } catch (Exception e) {
        e.printStackTrace();
    }

    emp.punchOut();

    System.out.println("Hours: " +
            emp.getHoursWorked());

    System.out.println("Pay: $" +
            emp.getTotalPay());
}
