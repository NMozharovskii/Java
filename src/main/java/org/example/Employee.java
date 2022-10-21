package org.example;
/* Создайте программу, которая хранит информацию максимум о 100 сотрудниках.
Программа должна хранить информацию о сотрудниках в классе с именем Employee.
Информация о сотруднике включает идентификатор, имя, фамилию, год рождения, место рождения, зарплату, семейное положение.
 Программа должна обеспечивать следующие функции:
1- Ввести любое количество сотрудников. Нельзя допускать двух сотрудников с одинаковым идентификатором.
2- Искать сотрудника по id и печатать его информацию.
3- Искать сотрудника по имени или году рождения. Программа должна иметь возможность находить всех сотрудников с одинаковым именем или датой рождения.
4- Изменить любую информацию о сотруднике.
5- Расчетать общую сумму денег, которые сотрудники получают в качестве заработной платы. Напишите тесты для проверки корректности вашей программы (так же, как и в первом примере).
 */

public class Employee {
    int id;
    String name;
    String LastName;
    String BirthYear;
    String BirthPlace;
    int salary;
    String FamStat;

    public Employee(int id, String name, String LastName, String BirthYear, String BirthPlace, int salary, String FamStat )
            throws Exception {
        if (id > 100)
            throw new Exception("You can't add more than 100 users");
        this.id = id;
        this.name = name;
        this.LastName = LastName;
        this.BirthYear = BirthYear;
        this.BirthPlace = BirthPlace;
        this.salary = salary;
        this.FamStat = FamStat;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return LastName;
    }

    public String getBirthYear() {
        return BirthYear;
    }

    public String getBirthPlace() {
        return BirthPlace;
    }

    public int getSalary() {
        return salary;
    }

    public String getFamStat() {
        return FamStat;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setBirthYear(String BirthYear) {
        this.BirthYear = BirthYear;
    }

    public void setBirthPlace(String birthPlace) {
        BirthPlace = birthPlace;
    }

    public int setSalary(int salary) {
        this.salary = salary;
        return salary;
    }

    public void setFamStat(String famStat) {
        FamStat = famStat;
    }

    public void getEmployee() {
        System.out.println("Id: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Last name: " + this.LastName);
        System.out.println("Birth year: " +  this.BirthYear);
        System.out.println("Birth place: " + this.BirthPlace);
        System.out.println("salary: " + this.salary);
        System.out.println("FamStat: " + this.FamStat);
    }

}

