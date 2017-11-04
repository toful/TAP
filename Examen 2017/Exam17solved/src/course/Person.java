package course;

/**
 * Created by pedro on 27/09/15.
 */
public class Person implements java.io.Serializable{
    private String code;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public String getCode() {
        return code;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String code, String name, int age) {

        this.code = code;
        this.name = name;
        this.age = age;
    }
}
