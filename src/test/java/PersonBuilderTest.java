import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Тестирование класса PersonBuilder")
class PersonBuilderTest {
    protected PersonBuilder personBuilder;

    @BeforeEach
    void setUp() {
        personBuilder = new PersonBuilder();
        System.out.println("Вызываюсь перед тестом");
    }

    @Test
    @DisplayName("Тестирование метода setAge с отрицательным возрастом")
    void setAgeMinus() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            personBuilder.setAge(-10);
        });
    }

    @Test
    @DisplayName("Тестирование метода setAge с положительным возрастом")
    void setAge() {
        Assertions.assertEquals(this.personBuilder, personBuilder.setAge(10));
    }

    @Test
    @DisplayName("Тестирование метода build на незаполненность полей")
    void buildException() {
        Assertions.assertThrows(IllegalStateException.class, () -> {
            personBuilder.build();
        });
    }
}
