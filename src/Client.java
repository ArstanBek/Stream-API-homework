import java.util.List;

public class Client {
    private int id;
    private String name;
    private int age;
    private List<Telephone> telephones;

    public Client() {
    }

    public Client(int id, String name, int age, List<Telephone> telephones) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.telephones = telephones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Telephone> getTelephones() {
        return telephones;
    }

    public void setTelephones(List<Telephone> telephones) {
        this.telephones = telephones;
    }
}
