package seminars.sixth;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class Main {

    private Average<Integer> integerAverage;

    @BeforeEach
    void setUp(){
        integerAverage = new Average<>();
    }

    @Test
    void emptyListForAverageValueTest(){
        List<Integer> list = null;

        assertThatThrownBy(()->integerAverage.findAverageValue(list))
                .isInstanceOf(NullPointerException.class);
    }

    @Test
    void correctValueTest(){
        List<Integer> list = List.of(1,2,3,4);
        double res = integerAverage.findAverageValue(list);

        Assertions.assertEquals(2.5, res);
    }

    @Test
    void compareEqualAverageValuesTest(){
        List<Integer> list1 = List.of(1,2,3,4);
        List<Integer> list2 = List.of(1,2,3,4);
        String result = integerAverage.compareAverages(list1,list2);

        Assertions.assertEquals("Средние значения равны", result);

    }

    @Test
    void compareDifferentAverageValuesTest(){
        List<Integer> list1 = List.of(1,2,3,14);
        List<Integer> list2 = List.of(1,2,3,4);
        String result = integerAverage.compareAverages(list1,list2);

        Assertions.assertEquals("Первый список имеет большее среднее значение", result);

    }

}
