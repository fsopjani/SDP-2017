package worksheet02;

/**
 * Created by fatos on 18/02/2017.
 */
public class MySecondClass {
    private String name;
    private String place;
    private int age;

    public MySecondClass(String name, String place, int age) {
        this.name = name;
        this.place = place;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MySecondClass{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", age=" + age +
                '}';
    }
}
