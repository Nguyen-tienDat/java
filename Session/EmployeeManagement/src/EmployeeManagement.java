import java.io.*;
import  java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManagement {
    private List<Employee> employeeList;
    private String fileName = "C:\\Users\\admin\\java\\Employee.dat";

    public EmployeeManagement() {
        employeeList = new ArrayList<>();

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName));
            employeeList = (List<Employee>) objectInputStream.readObject();

        }catch (FileNotFoundException e){
            System.out.println("No data founded!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void saveEmployee(){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(employeeList);
            objectOutputStream.flush();
            fileOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
       saveEmployee();
    }
       public Employee findByID(int eplID){
            return employeeList.stream().filter(e->e.getEplID() == eplID).findFirst().orElse(null);
        }

        public void updateEmployee(int eplID, String eplName, int eplAge, double eplSalary){
            Employee employee = findByID(eplID);
            if(employee != null){
                employee.setEplName(eplName);
                employee.setEplAge(eplAge);
                employee.setEplSalary(eplSalary);

                saveEmployee();
            }
        }

        public void deleteEmployee(int eplID){
            employeeList = employeeList.stream().filter(e -> e.getEplID() != eplID).toList();
            saveEmployee();
        }
        public List<Employee> findByName(String eplName){
            return employeeList.stream().filter(e -> e.getEplName().equalsIgnoreCase(eplName)).toList();
        }

        public List<Employee> showAllEmployee(){
            return  new ArrayList<>(employeeList);
        }

        public void saveFile(){
            try{
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName));
                employeeList = (List<Employee>) objectInputStream.readObject();

            } catch (FileNotFoundException e){
                System.out.println("No data founded!");
            } catch (IOException e ){
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

    }

