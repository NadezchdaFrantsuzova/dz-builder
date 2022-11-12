import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.OptionalInt;

@DisplayName("Тестируем класс Person")
class PersonTest {
    protected Person person;

    @BeforeEach
    void setUp() {
        person = new Person("Петр", "Петров");
        System.out.println("Вызываюсь перед тестом");
    }

    @Test
    @DisplayName("Тестирование метода hasAddress с адресом")
    void hasAddressHasAddress() {
        person.setCity("Москва");
        Assertions.assertNotNull(person.hasAddress());
    }

    @Test
    @DisplayName("Тестирование метода hasAddress без адреса")
    void hasAddressFreeAddress() {
        Assertions.assertNotNull(person.hasAddress());
    }

    @Test
    @DisplayName("Тестирование метода hasAge с количеством лет")
    void hasAgeHasAge() {
        person.setAge(48);
        Assertions.assertNotNull(person.hasAge());
    }

    @Test
    @DisplayName("Тестирование метода hasAge без количества лет")
    void hasAgeFreeAge() {
        Assertions.assertNotNull(person.hasAge());
    }

    @Test
    @DisplayName("Тестирование метода getName()")
    void getName() {
        Assertions.assertEquals("Петр", person.getName());
    }

    @Test
    @DisplayName("Тестирование метода getSurname")
    void getSurname() {
        Assertions.assertEquals("Петров", person.getSurname());
    }

    @Test
    @DisplayName("Тестирование метода getAge с количеством лет")
    void getAgeHasAge() {
        person.setAge(48);
        Assertions.assertEquals(OptionalInt.of(48), person.getAge());
    }

    @Test
    @DisplayName("Тестирование метода getAge без количества лет")
    void getAgeFreeAge() {
        Assertions.assertEquals(OptionalInt.empty(), person.getAge());
    }

    @Test
    @DisplayName("Тестирование метода getCity без города")
    void getCity() {
        Assertions.assertNull(person.getCity());
    }

    @Test
    @DisplayName("Тестирование метода happyBirthday")
    void happyBirthday() {
        person.setAge(48);
        Assertions.assertEquals(49, person.happyBirthday());
    }

    @Test
    @DisplayName("Тестирование метода happyBirthday без данных о возрасте" +
            "или с новорожденным")
    void happyBirthdayFreeAge() {
        Assertions.assertNull(person.happyBirthday());
    }
}
