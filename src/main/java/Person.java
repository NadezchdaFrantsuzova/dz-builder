import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected Integer age;
    protected String city;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean hasAge() {
        return age != null;
    }

    public boolean hasAddress() {
        return city != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return (age != null && age > 0) ? OptionalInt.of(age) : OptionalInt.empty();
    }

    public String getCity() {
        return city;
    }

    public Integer happyBirthday() {
        if (age != null) {
            age++;
        }
        return age;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(surname)
                .setAge(0)
                .setCity(city);
    }

    @Override
    public String toString() {
        return "Person {" +
                "name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", age = '" + age + '\'' +
                ", city = " + city +
                '}';
    }
}
