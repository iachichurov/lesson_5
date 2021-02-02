package gb.android.java;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("John","BigBoss","bb@mail.com","0000000", 60000, 98);
        employees[1] = new Employee("John Junior", "Boss", "b@mail.com","1111111",50000, 45);
        employees[2] = new Employee("Mike","Engineer","e@mail.com","2222222", 40000, 32);
        employees[3] = new Employee("Julie","Secretary","s@mail.com","3333333", 30000, 18);
        employees[4] = new Employee("Newbie","Junior Developer", "jd@mail.com","4444444", 1, 41);

        for (Employee item :
                employees) {if(item.getAge() > 40) item.printInfo();
        }

        }

}
