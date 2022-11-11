import org.junit.jupiter.api.*;

public class JUnit5Examples {
    @BeforeAll
    static void setUp(){
        System.out.println("### SetUP");
    }
    @AfterAll
    static void setfdfdgfd(){
        System.out.println("DOWN");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("### @Test");
    }
    @AfterEach
    void after (){
        System.out.println("sdsada");
    }

    @Test
    void firstTest (){
        System.out.println("###  @Test firstTest() !");

    }
    @Test
    void secondTest (){
        System.out.println("###  @Test secondTest() !");

    }
}
