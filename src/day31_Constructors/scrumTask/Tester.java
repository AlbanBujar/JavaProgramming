package day31_Constructors.scrumTask;

public class Tester {

   public String name;
   public int employeeID;
   public String JobTitle;
   public double salary;

    public Tester(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        JobTitle = jobTitle;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", JobTitle='" + JobTitle + '\'' +
                ", salary= $" + salary +
                '}';


    }

    public  void smokeTesting(){
        System.out.println(name+" is smoke testing");
    }

    public void creatingTesting(){
        System.out.println(name+" is creating ticket");
    }
}



/*
create a class called Tester
        Attributes:
              name, employeeID, JobTitle, Slaray

        Add A constructor that can set all the fileds

        Actions:
               smokeTesting(), creatingTicke(). dailyStandUp(), toString()
 */