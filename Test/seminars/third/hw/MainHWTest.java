package seminars.third.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {

    private MainHW mainHW;

    @BeforeEach
    void setUp() {
        mainHW = new MainHW();
    }

    @Test
    void evenNumber() {
        boolean isEven = mainHW.evenOddNumber(4);
        assertTrue(isEven);
    }

    @Test
    void oddNumber() {
        boolean isOdd = mainHW.evenOddNumber(5);
        assertFalse(isOdd);
    }

    @ParameterizedTest
    @ValueSource(ints = {50, 75})
    void numberInInterval(int n){
        boolean res = mainHW.numberInInterval(n);
        assertTrue(res);
    }

    @ParameterizedTest
    @ValueSource(ints = {25, 100})
    void numberNotInInterval(int n){
        boolean res = mainHW.numberInInterval(n);
        assertFalse(res);
    }
}