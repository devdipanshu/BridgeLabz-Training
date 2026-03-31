import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class EmployeeSerialization{
    public static void main(String[] args){

        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        try{
            ArrayList<Employee> list = new ArrayList<Employee>();

            list.add(new Employee(101,"Amit","IT",50000));
            list.add(new Employee(102,"Rohit","HR",45000));
            list.add(new Employee(103,"Neha","Finance",60000));

            oos = new ObjectOutputStream(new FileOutputStream("employees.dat"));
            oos.writeObject(list);

            System.out.println("Employees saved successfully");

            oos.close();

            ois = new ObjectInputStream(new FileInputStream("employees.dat"));

            ArrayList<Employee> empList = (ArrayList<Employee>) ois.readObject();

            for(int i = 0;i < empList.size();i++){
                empList.get(i).display();
            }

        }catch(IOException e){
            System.out.println("IO Error occurred");
        }catch(ClassNotFoundException e){
            System.out.println("Class not found");
        }finally{
            try{
                if(oos != null){
                    oos.close();
                }
                if(ois != null){
                    ois.close();
                }
            }catch(IOException e){
                System.out.println("Error while closing streams");
            }
        }
    }
}

class Employee implements Serializable{

    int id;
    String name;
    String department;
    double salary;

    Employee(int id,String name,String department,double salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display(){
        System.out.println(id + " " + name + " " + department + " " + salary);
    }
}
