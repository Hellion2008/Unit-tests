package seminars.third.coverage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class SomeServiceTest {
   // 3.1.
    private SomeService someService;

    @BeforeEach
    void setUp(){
        someService = new SomeService();
    }

    @Test
    void fizzTest() {
        String res = someService.fizzBuzz(3);
        assertThat(res).isEqualTo("Fizz");
    }

    @Test
    void buzzTest() {
        String res = someService.fizzBuzz(5);
        assertThat(res).isEqualTo("Buzz");
    }

    @Test
    void fizzBuzzTest() {
        String res = someService.fizzBuzz(15);
        assertThat(res).isEqualTo("FizzBuzz");
    }

    @Test
    void first6() {
        int[] arr = new int[] {6, 5,51};
        boolean res = someService.firstLast6(arr);
        Assertions.assertTrue(res);
    }

    @Test
    void last6() {
        int[] arr = new int[] {5,51, 6};
        boolean res = someService.firstLast6(arr);
        Assertions.assertTrue(res);
    }

    @ParameterizedTest
    @CsvSource({"50, 1000", "100, 0", "0, 2000"})
    void correctDiscountCaclulating (int i, int res){
        assertThat(someService.calculatingDiscount(2000, i)).isEqualTo(res);
    }


}