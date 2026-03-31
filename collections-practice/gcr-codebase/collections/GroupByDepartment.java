import java.util.*;

class Employee {

    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return name;
    }
}

public class GroupByDepartment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> list = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0;i < n;i++) {
            System.out.print("Enter employee name: ");
            String name = sc.nextLine();
            System.out.print("Enter department: ");
            String dept = sc.nextLine();
            list.add(new Employee(name, dept));
        }

        HashMap<String, ArrayList<Employee>> map = new HashMap<>();

        for(int i = 0;i < list.size();i++) {
            Employee e = list.get(i);
            if(!map.containsKey(e.department)) {
                map.put(e.department, new ArrayList<>());
            }
            map.get(e.department).add(e);
        }

        for(String dept : map.keySet()) {
            System.out.println(dept + ": " + map.get(dept));
        }
    }
}
