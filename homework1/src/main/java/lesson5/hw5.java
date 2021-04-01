package lesson5;

public class hw5 {
    public static void main(String[] args) {
        Employee[] empCorp = new Employee[5];
        empCorp[0] = new Employee("Samoylov Ivan", "Developer", "samivan@mailbox.com", "892312312",50000,41);
        empCorp[1] = new Employee("Sidorov Oleg", "Designer", "sidorov@mailbox.com", "892312314",50000,32);
        empCorp[2] = new Employee("Panasenkov Fiodr", "Tester", "panasenkov@mailbox.com", "892312315",30000,43);
        empCorp[3] = new Employee("Zhuk Mikhail", "Manager", "zhuk@mailbox.com", "892312316",50000,30);
        empCorp[4] = new Employee("Troev Konstantin", "Engineer", "troev@mailbox.com", "892312317",33000,21);
        for (Employee employee : empCorp)
            if (employee.getAge()>40)
                System.out.println(employee);

    }
}
class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return(name+ "\n-"
                +position+ "\n-"
                +email+ "\n-"
                +phone+ "\n-"
                +salary+ "\n-"
                +age);
}}
