package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    public List<Car> cars;
    {   cars = new ArrayList<>();
        cars.add(new Car("BMW", "Black", 1999));
        cars.add(new Car("Audi", "Red", 2000));
        cars.add(new Car("Mercedes", "White", 1998));
        cars.add(new Car("Ford", "Silver", 2005));
        cars.add(new Car("Honda", "Grey", 1995));
    }

    @Override
    public List<Car> getSomeCars(int num) {
        return cars.stream().limit(num).collect(Collectors.toList());
    }


}
