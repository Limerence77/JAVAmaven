package test;

/**
 * @progarm: JAVAmaven
 * @package: test
 * @description:
 * @author: Mr.chen
 * @create: 2023-01-28 00:21:11
 **/
public class Employee {
    private Integer id;
    private  String name;
    private  Integer age;
    private Integer slary;

    public Employee() {
    }

    public Employee(Integer id, String name, Integer age, Integer slary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.slary = slary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", slary=" + slary +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSlary() {
        return slary;
    }

    public void setSlary(Integer slary) {
        this.slary = slary;
    }
}
