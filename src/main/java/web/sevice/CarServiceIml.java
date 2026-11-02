package web.sevice;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceIml implements CarService {

    private final List<Car> cars = List.of(
            new Car("BMW", "VIN001", "А111АА"),
            new Car("Audi", "VIN002", "А222АА"),
            new Car("Toyota", "VIN003", "А333АА"),
            new Car("Kia", "VIN004", "А444АА"),
            new Car("Mercedes", "VIN005", "А555АА")
    );


    @Override
    public List<Car> getCarsListValue(Integer count) {
        if (count == null || count >= cars.size() || count <= 0) {
            return cars;
        } 
        return cars.subList(0,count);
    }
}
