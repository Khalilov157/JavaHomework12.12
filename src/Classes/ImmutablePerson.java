package Classes;

final public class ImmutablePerson {
    private String name;
    private String surname;
    private int age;

    public ImmutablePerson(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}
