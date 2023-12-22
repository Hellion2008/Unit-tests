package seminars.second.hw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatRuntimeException;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    void setup() {
        car = new Car("Toyota", "Camry", 2017);
        motorcycle = new Motorcycle("Yomaha", "R1M", 2020);
    }

    @Test
    void carIsVehicle(){
        assertTrue(car instanceof Vehicle);

    }

    @Test
    void carHasFourWheels(){
        assertEquals(4, car.getNumWheels());
    }

    @Test
    void motorcycleHasTwoWheels(){
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    void carHasSixtySpeed(){
        car.testDrive();

        assertEquals(60, car.getSpeed());
    }

    @Test
    void motorcycleHasSixtySpeed(){
        motorcycle.testDrive();

        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    void carHasZeroSpeed() {
        car.testDrive();
        car.park();

        assertEquals(0, car.getSpeed());
    }

    @Test
    void motorcycleHasZeroSpeed() {
        motorcycle.testDrive();
        motorcycle.park();

        assertEquals(0, motorcycle.getSpeed());
    }

}