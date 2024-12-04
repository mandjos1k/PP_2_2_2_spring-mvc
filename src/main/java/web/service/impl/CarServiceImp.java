package web.service.impl;

import org.springframework.stereotype.Service;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {

    Long id = (long) 0;
    List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car(++id, "Tesla", "Model s", 30000));
        cars.add(new Car(++id, "Mercedes-benz", "124", 40000));
        cars.add(new Car(++id, "BWM", "M5", 28999));
        cars.add(new Car(++id, "Lada", "Vesta", 15000));
        cars.add(new Car(++id, "Volkswagen", "Golf", 24000));
    }

    @Override
    public List<Car> listCarCount(int count) {
        if (count >= 5) return cars;
        return cars.stream().limit(count).collect(Collectors.toList());
    }

}
