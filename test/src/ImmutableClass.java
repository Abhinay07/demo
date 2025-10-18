final class Employee {
    private final int id;
    private final String name;
    private final Age age;

    Employee(int id, String name, Age age) {
        this.id = id;
        this.name = name;
        this.age = clonedAge(age);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Age getAge() {
        return clonedAge(this.age);
    }

    public Age clonedAge(Age age){  // create a deepcopy of Age, so that it will create a New Age object while creating
        Age clonedAge = new Age();
        clonedAge.setMonth(age.getMonth());
        return clonedAge;
    }
}

class Age {
    String month;

    public void setMonth(String month) {
        this.month = month;
    }

    public String getMonth() {
        return month;
    }
}

public class ImmutableClass {
    public static void main(String[] args) {
        Age age = new Age();
        age.setMonth("32");
       /* EmployeeTest employee = new EmployeeTest(1, "Abhi", age);
        System.out.println(employee.getAge().getMonth());
        age.setMonth("35");
        System.out.println(employee.getAge().getMonth());*/

    }
}
