package HW_2_1;
public class Employee {
    String FIO;
    String position;
    String email;
    String phone;
    int age;

    public Employee(String FIO, String position, String email, String phone, int age) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public void employeeInfo() {
        employeeContact();
        employeeDescription();
    }
    private void employeeContact() {
        System.out.println("Phone emplyee: " + this.phone);
        System.out.println("Phone emplyee: " + this.email);
    }

    private void employeeDescription() {
        System.out.println("FIO employee: " + this.FIO);
        System.out.println("Position employee: " + this.position);
    }
}
