import java.util.ArrayList;

/**
 * Created by fatos on 18/02/2017.
 */
public class MyTestClass {
    private String name;
    private String surname;
    private Integer age;
    public String continent;
    private ArrayList<String> planets;

    public MyTestClass(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    private String myHelper01(){
        return "help1";
    }

    private int myHelper02() throws NumberFormatException{
        return 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public ArrayList<String> getPlanets() {
        return planets;
    }

    public void setPlanets(ArrayList<String> planets) {
        this.planets = planets;
    }
}
