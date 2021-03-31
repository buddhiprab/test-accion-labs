public class Employee {
  String name;
  int id;
  int severity;
  int[] subordinateIds;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int[] getSubordinateIds() {
    return subordinateIds;
  }

  public int getSeverity() {
    return severity;
  }

  public void setSeverity(int severity) {
    this.severity = severity;
  }

  public void setSubordinateIds(int[] subordinateIds) {
    this.subordinateIds = subordinateIds;
  }
}