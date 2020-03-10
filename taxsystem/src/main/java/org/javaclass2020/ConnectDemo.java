package org.javaclass2020;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConnectDemo
{
    public static void main(String[] args)
    {
        openConnection();
//        insertRows();
//        updateRows();
//        deleteCell();
//        runSelect2();
//        insertEmployees();
//        insertTaxBracket();
        runEmployee();
//        runTax();
    }

    static String url = "jdbc:mysql://157.245.65.64/javaclass2";
    //jdbc:{name of db}://{address of db server}:port/{name of db}
    static Connection connection;
    static String userName = "ozzy";
    static String password = "#Abcqr123";

    static String selectSQL = "select grade,salary from salarygrades4";
    static String selectEmployeeTable = "select * from employees4";
    static String selectTaxTable = "select * from taxbracket4";


    static String insertSQL = "insert into salarygrades4(grade,salary) values ('G6', 280000)";
    static String insertSQL7 = "insert into salarygrades4(grade,salary) values ('G7', 330000)";
    static String insertSQL8 = "insert into salarygrades4(grade,salary) values ('G8', 380000)";
    static String insertSQL9 = "insert into salarygrades4(grade,salary) values ('G9', 430000)";
    static String insertSQL10 = "insert into salarygrades4(grade,salary) values ('G10', 480000)";

    static String updateSQL6 = "update salarygrades4 set description = 'G6 salary level' where grade = 'G6'";
    static String updateSQL7 = "update salarygrades4 set description = 'G7 salary level' where grade = 'G7'";
    static String updateSQL8 = "update salarygrades4 set description = 'G8 salary level' where grade = 'G8'";
    static String updateSQL9 = "update salarygrades4 set description = 'G9 salary level' where grade = 'G9'";
    static String updateSQL10 = "update salarygrades4 set description = 'G10 salary level' where grade = 'G10'";

    static String deleteSQL6 = "delete from salarygrades4  where grade = 'G6'";
    static String deleteSQL7 = "delete from salarygrades4  where grade = 'G7'";

    static String insertEmployee1 = "insert into employees4(id,firstname,lastname,gender,age,address,phone,email) " +
            "values ('1.19.1','Abebi','Amoo','Female',25,'22 New Texas Street Abulegba Lagos','07056987415','prettyabebi@gmail.com')";
    static String insertEmployee2 = "insert into employees4(id,firstname,lastname, gender,age, address, phone,email) " +
            "values ('1.19.2','Janet','Dansu','Female',39,'13 Ranti-Faj Street Somolu Lagos','08088961547','dansujane@gmail.com')";
    static String insertEmployee3 = "insert into employees4(id,firstname,lastname, gender,age, address, phone,email) " +
            "values ('1.19.3','Abudu','Sulaiman','Male',33,'115 Bode Thomas Street Surulere Lagos','08146937851','suabudu@gmail.com')";
    static String insertEmployee4 = "insert into employees4(id,firstname,lastname, gender,age, address, phone,email) " +
            "values ('1.19.4','Ikumapayi','Silifat','Female',44,'23 Brown Street Ikorodu Lagos','09084259421','ikumsilfa@gmail.com')";
    static String insertEmployee5 = "insert into employees4(id,firstname,lastname, gender,age, address, phone,email) " +
            "values ('1.19.5','Fulani','Abosede','Female',38,'3 Shomolu Street Bariga Lagos','080223651478','fulaniabosede@gmail.com')";

    static String insertTaxBracket1 = "insert into taxbracket4(bracket,grade,taxpercent,description) values ('T1','G1', 1.25,'Grade 1 tax bracket')";
    static String insertTaxBracket2 = "insert into taxbracket4(bracket,grade,taxpercent,description) values ('T2','G2', 2.25,'Grade 2 tax bracket')";
    static String insertTaxBracket3 = "insert into taxbracket4(bracket,grade,taxpercent,description) values ('T3','G3', 3.25,'Grade 3 tax bracket')";
    static String insertTaxBracket4 = "insert into taxbracket4(bracket,grade,taxpercent,description) values ('T4','G4', 4.25,'Grade 4 tax bracket')";
    static String insertTaxBracket5 = "insert into taxbracket4(bracket,grade,taxpercent,description) values ('T5','G5', 5.25,'Grade 5 tax bracket')";
    static String insertTaxBracket6 = "insert into taxbracket4(bracket,grade,taxpercent,description) values ('T6','G6', 6.25,'Grade 6 tax bracket')";
    static String insertTaxBracket7 = "insert into taxbracket4(bracket,grade,taxpercent,description) values ('T7','G7', 7.25,'Grade 7 tax bracket')";
    static String insertTaxBracket8 = "insert into taxbracket4(bracket,grade,taxpercent,description) values ('T8','G8', 8.25,'Grade 8 tax bracket')";
    static String insertTaxBracket9 = "insert into taxbracket4(bracket,grade,taxpercent,description) values ('T9','G9', 9.25,'Grade 9 tax bracket')";
    static String insertTaxBracket10 = "insert into taxbracket4(bracket,grade,taxpercent,description) values ('T10','G10', 10.25,'Grade 10 tax bracket')";


    public static void openConnection()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, userName, password);
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }

    public static void runSelect()
    {
        try
        {
            Statement jdbcStatement = connection.createStatement();
            ResultSet rows = jdbcStatement.executeQuery(selectSQL);

//            while (rows.next())
//            {
//                String grade = rows.getString("grade");
//                double salary = rows.getDouble("salary");
//                System.out.println("The salary for grade "+grade+" is "+ salary);
//            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
    public static void insertRows()
    {
        try
        {
            Statement insertStatement = connection.createStatement();
            insertStatement.executeUpdate(insertSQL);
            insertStatement.executeUpdate(insertSQL7);
            insertStatement.executeUpdate(insertSQL8);
            insertStatement.executeUpdate(insertSQL9);
            insertStatement.executeUpdate(insertSQL10);


//            System.out.println("Rows affected: "+rowsAffected);
                runSelect();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
    public static void updateRows()
    {
        try
        {
            Statement updateStatement = connection.createStatement();
            updateStatement.executeUpdate(updateSQL6);
            updateStatement.executeUpdate(updateSQL7);
            updateStatement.executeUpdate(updateSQL8);
            updateStatement.executeUpdate(updateSQL9);
            updateStatement.executeUpdate(updateSQL10);


            runSelect();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public static void deleteCell()
    {
        try
        {

            Statement deleteStatement = connection.createStatement();
            deleteStatement.executeUpdate(deleteSQL6);
            deleteStatement.executeUpdate(deleteSQL7);
            runSelect();
            System.out.println("Row deleted successfully");
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
    public static void runSelect2()
    {
        List<SalaryGrade> grades = getGrades();
        for (SalaryGrade grade : grades)
        {
            System.out.println("salary for grade " + grade.getGrade()
                    + " is= " + grade.getSalary());
        }
    }


    public static List<SalaryGrade> getGrades()
    {
        List<SalaryGrade> grades = new ArrayList<SalaryGrade>();

        try
        {
            Statement jdbcStatement = connection.createStatement();
            ResultSet rows = jdbcStatement.executeQuery(selectSQL);

            while (rows.next())
            {
                String grade = rows.getString("grade");
                double salary = rows.getDouble("salary");
                //System.out.println("salary for grade " + grade + " is= " + salary);

                SalaryGrade salaryGrade = new SalaryGrade();
                salaryGrade.setGrade(grade);
                salaryGrade.setSalary(salary);

                grades.add(salaryGrade);
            }


        } catch (SQLException e)
        {
            e.printStackTrace();
        }

        return grades;

    }
    public static void insertEmployees()
    {
        try
        {
            Statement insert = connection.createStatement();
            insert.executeUpdate(insertEmployee1);
            insert.executeUpdate(insertEmployee2);
            insert.executeUpdate(insertEmployee3);
            insert.executeUpdate(insertEmployee4);
            insert.executeUpdate(insertEmployee5);


//            System.out.println("Rows affected: "+rowsAffected);
            runSelect();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public static void insertTaxBracket()
    {
        try
        {
            Statement insert = connection.createStatement();
            insert.executeUpdate(insertTaxBracket1);
            insert.executeUpdate(insertTaxBracket2);
            insert.executeUpdate(insertTaxBracket3);
            insert.executeUpdate(insertTaxBracket4);
            insert.executeUpdate(insertTaxBracket5);
            insert.executeUpdate(insertTaxBracket6);
            insert.executeUpdate(insertTaxBracket7);
            insert.executeUpdate(insertTaxBracket8);
            insert.executeUpdate(insertTaxBracket9);
            insert.executeUpdate(insertTaxBracket10);

//            System.out.println("Rows affected: "+rowsAffected);
            runSelect();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public static void runEmployee()
    {
        List<Employee> detailContain = getEmployeeDetails();
        for (Employee details : detailContain)
        {
            System.out.println("The employee "+ details.getFirstName()+ " "+ details.getLastName()+" with the id: "+details.getId()
            +" who is a "+details.getGender()+" of "+details.getAge()+" years of age, of "+details.getAddress()+" has this phone-number: "
            +details.getPhone()+" and email address: "+details.getAddress());
        }
    }


    public static List<Employee> getEmployeeDetails()
    {
        List<Employee> detailContain = new ArrayList<Employee>();

        try
        {
            Statement jdbcStatement = connection.createStatement();
            ResultSet rows = jdbcStatement.executeQuery(selectEmployeeTable);

            while (rows.next())
            {
                String id = rows.getString("id");
                String firstName = rows.getString("firstName");
                String lastName = rows.getString("lastName");
                String gender = rows.getString("gender");
                int age = rows.getInt("age");
                String address = rows.getString("address");
                String phone = rows.getString("phone");
                String email = rows.getString("email");

                //System.out.println("salary for grade " + grade + " is= " + salary);

                Employee employee = new Employee();
                employee.setId(id);
                employee.setFirstName(firstName);
                employee.setLastName(lastName);
                employee.setGender(gender);
                employee.setAge(age);
                employee.setAddress(address);
                employee.setPhone(phone);
                employee.setEmail(email);


                detailContain.add(employee);
            }


        } catch (SQLException e)
        {
            e.printStackTrace();
        }

        return detailContain;

    }


    public static void runTax()
    {
        List<TaxBracket> brack = getBracket();
        for (TaxBracket brackdet : brack)
        {
            System.out.println("The tax bracket "+brackdet.getBracket()+ " for salary grade "+brackdet.getGrade()+" is "+brackdet.getTaxPercent()
            + " with description: "+brackdet.getDescription());
        }
    }


    public static List<TaxBracket> getBracket()
    {
        List<TaxBracket> brack = new ArrayList<TaxBracket>();

        try
        {
            Statement jdbcStatement = connection.createStatement();
            ResultSet rows = jdbcStatement.executeQuery(selectTaxTable);

            while (rows.next())
            {

                String bracket = rows.getString("bracket");
                String grade = rows.getString("grade");
                double taxPercent = rows.getDouble("taxpercent");
                String description = rows.getString("description");


                //System.out.println("salary for grade " + grade + " is= " + salary);

                TaxBracket taxBracket = new TaxBracket();
                taxBracket.setBracket(bracket);
                taxBracket.setGrade(grade);
                taxBracket.setTaxPercent(taxPercent);
                taxBracket.setDescription(description);



                brack.add(taxBracket);
            }


        } catch (SQLException e)
        {
            e.printStackTrace();
        }

        return brack;

    }
}
