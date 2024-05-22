import java.util.ArrayList;

public class Management {
    ArrayList<Information> students = new ArrayList<Information>();
    private Information loginAcc;

    public Information getLoginAcc() {
        return loginAcc;
    }

    public Management() {
        Information student1 = new Information("001", "Nguyen Van A", 20, 6.5);
        Information student2 = new Information("002", "Tran Thi B", 21, 9.5);
        Information student3 = new Information("003", "Pham Van C", 22, 7.5);
        Information student4 = new Information("004", "Do Thi D", 23, 8.5);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
    }

    public Information authentication(String id) {
        for (Information student : students) {
            if (student.getId().equals(id)) {
                loginAcc = student;
                return student;
            }
        }
        return null;
    }

    public void InfoList(Information student) {
        System.out.println(student);
    }

    public void compareGPA(double gpa) {
        double gpaDefault = students.get(0).gpa;
        for (Information student : students) {
            if (gpaDefault < student.gpa) {
                gpaDefault = student.gpa;
            }
        }
        System.out.println("Highest GPA of Student List: " + gpaDefault);

        for (Information student : students) {
            if (gpaDefault > student.gpa) {
                gpaDefault = student.gpa;
            }
        }
        System.out.println("Lowest GPA of Student List: " + gpaDefault);
    }

    public void compareAge(int age) {
        int ageDefault = students.get(0).age;
        for (Information student : students) {
            if (ageDefault < student.age) {
                ageDefault = student.age;
            }
        }
        System.out.println("Oldest Student: " + ageDefault);

        for (Information student : students) {
            if (ageDefault > student.age) {
                ageDefault = student.age;
            }
        }
        System.out.println("Youngest Student: " + ageDefault);
    }
}

