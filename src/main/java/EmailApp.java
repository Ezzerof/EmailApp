import java.util.Scanner;

public class EmailApp {

    Scanner scanner = new Scanner(System.in);

    public void startApp() {
        System.out.println("Welcome");
        System.out.print("Please enter employee's firstname: ");
        String fName = scanner.next().toLowerCase();
        System.out.print("Please enter employee's lastname: ");
        String sName = scanner.next().toLowerCase();
        System.out.print("Please enter employee's department: ");
        String department = scanner.next().toLowerCase();
        System.out.print("Please enter employee's company: ");
        String company = scanner.next().toLowerCase();
        System.out.print("Please enter employee's mail capacity: ");
        int mailCap = scanner.nextInt();
        System.out.println();

        Email emp1 = new Email(fName, sName, department, company, mailCap);

        getInf(emp1);

        emp1.setEmail("vasile@jopa.com");
        emp1.setMailCapacity(12);
        emp1.setPassword("aaa12");

        getInf(emp1);
    }

    public void getInf(Email emp1) {
        System.out.println("Employee's name: " + emp1.getName());
        System.out.println("Employee's email: " + emp1.getEmail());
        System.out.println("Employee's mail capacity: " + emp1.getMailCapacity());
        System.out.println("================================================");
    }

    public static void main(String[] args) {
        EmailApp e = new EmailApp();
        e.startApp();
    }


}
