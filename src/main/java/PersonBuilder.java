public class PersonBuilder {

    protected String name;
    protected String surname;
    protected Integer age;
    protected String city;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(Integer age) {
        if (age < 0) {
            throw new IllegalArgumentException("Введите корректный возраст (не может быть отрицательным)");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        if (name == null || surname == null) {
            throw new IllegalStateException("Имя и фамилия обязательны к заполнению!");
        }
        Person person = new Person(name, surname);
        person.setAge(this.age);
        person.setCity(city);
        return person;
    }
}
