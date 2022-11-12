public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setCity("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);

        Person petya = new PersonBuilder()
                .setName("Пётр")
                .setSurname("Иванов")
                .setAge(21)
                .build();
        petya.happyBirthday();
        Person daughter = petya.newChildBuilder()
                .setName("Даша")
                .build();
        daughter.happyBirthday();
        System.out.println("У " + petya + " есть дочь, " + daughter);

        Person vasya = new PersonBuilder()
                .setName("Василий")
                .setSurname("Шариков")
                .setCity("Коломна")
                .build();
        System.out.println(vasya);
    }
}
