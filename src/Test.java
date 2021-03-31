import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
  static Map<Integer, Employee> employeeMap = new HashMap<>();

  public static void main(String[] args) {
    List<Employee> employeeList = getEmployeeList();

    for(Employee e : employeeList) {
      employeeMap.put(e.getId(), e);
    }

    System.out.println(calculateSeverity(employeeMap.get(1001)));
  }

  static int calculateSeverity(Employee e) {
    int subSeverity = 0;
    for(int id : e.getSubordinateIds()){
      if(employeeMap.get(id) !=null ){
        subSeverity += calculateSeverity(employeeMap.get(id));
      } else {
        return 0;
      }
    }
    return e.getSeverity() + subSeverity;
  }


  private static List<Employee> getEmployeeList() {
    Employee e1 = new Employee();
    e1.setName("Jerry");
    e1.setId(1001);
    e1.setSeverity(7);
    e1.setSubordinateIds(new int[]{1002,1003});

    Employee e2 = new Employee();
    e2.setName("Justin");
    e2.setId(1002);
    e2.setSeverity(3);
    e2.setSubordinateIds(new int[]{1005,1006,1007});

    Employee e3 = new Employee();
    e3.setName("Jared");
    e3.setId(1003);
    e3.setSeverity(4);
    e3.setSubordinateIds(new int[]{});

    Employee e4 = new Employee();
    e4.setName("x");
    e4.setId(1005);
    e4.setSeverity(2);
    e4.setSubordinateIds(new int[]{});

    Employee e5 = new Employee();
    e5.setName("y");
    e5.setId(1006);
    e5.setSeverity(1);
    e5.setSubordinateIds(new int[]{});

    Employee e6 = new Employee();
    e6.setName("z");
    e6.setId(1007);
    e6.setSeverity(1);
    e6.setSubordinateIds(new int[]{});

    List<Employee> employeeList = new ArrayList<>();
    employeeList.add(e1);
    employeeList.add(e2);
    employeeList.add(e3);
    employeeList.add(e4);
    employeeList.add(e5);
    employeeList.add(e6);

    return employeeList;
  }
}