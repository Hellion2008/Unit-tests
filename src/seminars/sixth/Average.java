package seminars.sixth;

import java.util.List;

public class Average<T extends Number> {
    public String compareAverages(List<T> first, List<T> second){
        final String firstString = "Первый список имеет большее среднее значение";
        final String secondString = "Второй список имеет большее среднее значение";
        final String equalString = "Средние значения равны";

        double firstAverageValue = findAverageValue(first);
        double secondAverageValue = findAverageValue(second);

        if (firstAverageValue != secondAverageValue){
            if (firstAverageValue > secondAverageValue)
                return firstString;
            else
                return secondString;
        }
        return equalString;
    }


    public double findAverageValue(List<T> list){
        double sum = 0;
        for (T value: list){
            sum += value.doubleValue();
        }
        return sum / list.size();
    }


}
