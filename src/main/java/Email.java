public class Email {

    private String firstname;
    private String lastname;
    private String department;
    private String company;
    private String password;
    private int mailCapacity;
    private String email;
    PasswordGenerator passwordGenerator = new PasswordGenerator();

    public Email(String firstname, String lastname, String department, String company, int mailCapacity) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.department = department;
        this.company = company;
        this.mailCapacity = mailCapacity;
        this.email = generateEmail();
        this.password = passwordGenerator.generate();
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMailCapacity(int mailCapacity) {
        this.mailCapacity = mailCapacity;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        String name = firstname + " " + lastname;
        return name;
    }

    public int getMailCapacity() {
        return mailCapacity;
    }
    public String generateEmail() {
        String email = firstname + "." + lastname + "@" + department + "." + company + ".com";
        return email;
    }
}
