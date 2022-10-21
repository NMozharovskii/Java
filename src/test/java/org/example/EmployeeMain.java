package org.example;

import java.util.Objects;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Scanner sin = new Scanner(System.in);
        Employee employees[] = new Employee[100];
        int i = 0;
        int choice = 0;
        while (choice != 7) {
            System.out.println(
                    """
                            1 - Add new user
                            2 - Find by id
                            3 - Find by name
                            4 - Find by birthday
                            5 - Edit user
                            6 - Salaries sum
                            7 - List of users
                            8 - Exit
                            """
            );
            System.out.println("What you wanna do?:");
            choice = in.nextInt();

//            Menu 1
            if (choice == 1) {
                System.out.println("Enter name:");
                String name = in.nextLine();
                name = in.nextLine();
                System.out.println("Enter last name:");
                String LastName = in.nextLine();
                System.out.println("Enter Birth year:");
                String BirthYear = in.nextLine();
                System.out.println("Enter birth place:");
                String BirthPlace = in.nextLine();
                System.out.println("Enter salary:");
                int salary = in.nextInt();
                System.out.println("Enter marital status:");
                String FamStat = in.nextLine();
                FamStat = in.nextLine();

                employees[i] = new Employee(i, name, LastName, BirthYear, BirthPlace, salary, FamStat);
                i++;
//
            }

//            Menu 2
            else if (choice == 2) {
                System.out.println("Enter id");
                int id_num = in.nextInt();
                if (id_num >= 100) {
                    System.out.println("Enter id less than 100");
                    continue;
                }
                employees[id_num].getEmployee();
            }

//            Menu 3
            else if (choice == 3) {
                System.out.println("Enter name:");
                in.nextLine();
                String find_name = in.nextLine();
                for (int j = 0; j < i; j++) {
                    if (Objects.equals(employees[j].getName(), find_name))
                        employees[j].getEmployee();
                }
            }

//            Menu 4
            else if (choice ==4) {
                System.out.println("Enter birth year:");
                in.nextLine();
                String find_year = in.nextLine();
                for (int j = 0; j < i; j++)
                {
                    if (Objects.equals(employees[j].getBirthYear(), find_year))
                        employees[j].getEmployee();
                }
            } //End of choice 4

//            Menu 5
            else if (choice == 5){
                System.out.println("Enter the user's id you wanna change");
                int emp_id = in.nextInt();
                System.out.println(
                        """
                        1 - Edit name
                        2 - Edit last name
                        3 - Edit birth year
                        4 - Edit salary
                        5 - Edit  marital status
                         """
                );
                int change_choice = in.nextInt();
                switch (change_choice) {
                    case 1 -> {
                        System.out.println("Enter new name:");
                        String name_change = in.nextLine();
                        name_change = in.nextLine();
                        employees[emp_id].setName(name_change);
                    }
                    case 2 -> {
                        System.out.println("Enter new last name:");
                        String LstName_change = in.nextLine();
                        LstName_change = in.nextLine();
                        employees[emp_id].setLastName(LstName_change);

                    }
                    case 3 -> {
                        System.out.println("Enter new birth year:");
                        String BirthYear_change = in.nextLine();
                        BirthYear_change = in.nextLine();
                        employees[emp_id].setBirthYear(BirthYear_change);
                    }
                    case 4 -> {
                        System.out.println("Enter new salary");
                        int salary_change = in.nextInt();
                        salary_change = in.nextInt();
                        employees[emp_id].setSalary(salary_change);
                    }
                    case 5 -> {
                        System.out.println("Enter new marital status");
                        String marital_change = in.nextLine();
                        marital_change = in.nextLine();
                        employees[emp_id].setFamStat(marital_change);
                    }
                } // Switch end
            } // End of choice 5

            else if (choice == 6) {
                int SumSal = 0;
                for (int j = 0; j < i; j++) {
                    SumSal += employees[j].getSalary();
                }
                System.out.println(SumSal);
            }

            else if (choice == 7) {
                System.out.println("ID " + "|" + " User's name");
                for (int j = 0; j < i; j++) {
                    System.out.println(j + " | " + employees[j].getName() + " " + employees[j].getLastName());
                }
            }

            else if (choice == 8) {
                break;
            }

        } //End of main choice
    } //End of main void
} //End of class

