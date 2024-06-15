import java.io.Serializable;
import java.util.Scanner;

public class Employee implements Serializable {
    private int eplID, eplAge;
    private String eplName;
    private double eplSalary;

    //constructor

    public Employee(int eplID, String eplName, double eplSalary, int eplAge) {
        this.eplID = eplID;
        this.eplName = eplName;
        this.eplSalary = eplSalary;
        this.eplAge = eplAge;
    }

    public int getEplID() {
        return eplID;
    }

    public void setEplID(int eplID) {
        this.eplID = eplID;
    }

    public String getEplName() {
        return eplName;
    }

    public void setEplName(String eplName) {
        this.eplName = eplName;
    }

    public double  getEplSalary() {
        return eplSalary;
    }

    public void setEplSalary(double eplSalary) {
        this.eplSalary = eplSalary;
    }

    public int getEplAge() {
        return eplAge;
    }

    public void setEplAge(int eplAge) {
        this.eplAge = eplAge;
    }

    public String toString(){
        return "Employee: {ID = "+eplID+" | Name = "+eplName+" | Age = "+eplAge+" | Salary = "+eplSalary+"}";
    }
}
