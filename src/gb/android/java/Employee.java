package gb.android.java;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String cellphone;
    private int salary;
    private int age;

public Employee(String nameC, String positionC, String emailC, String cellphoneC, int salaryC, int ageC){
    this.name = nameC;
    this.position = positionC;
    this.email = emailC;
    this.cellphone = cellphoneC;
    this.salary = salaryC;
    this.age = ageC;

}

    public int getAge() {
        return age;
    }

    public void printInfo(){
        System.out.printf("Имя: %s, должность: %s, почта: %s, телефон: %s, зарплата: %d, возраст: %d, \n", name, position, email, cellphone, salary, age);
}

}
