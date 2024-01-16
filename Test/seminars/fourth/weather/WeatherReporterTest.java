package seminars.fourth.weather;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class WeatherReporterTest {

    @Test
    void weatherTest(){
        WeatherService weatherService = mock(WeatherService.class);
        when(weatherService.getCurrentTemperature()).thenReturn(25);

        WeatherReporter weatherReporter = new WeatherReporter(weatherService);
        String res = weatherReporter.generateReport();

        Assertions.assertEquals("Текущая температура: " + 25 + " градусов.", res);
    }

}