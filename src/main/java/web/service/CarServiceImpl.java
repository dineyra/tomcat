package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    List<Car> listCar = new ArrayList<>();
    {
        listCar.add(new Car("Mers", "black", 2000));
        listCar.add(new Car("Audi", "yellow", 2010));
        listCar.add(new Car("Bmw", "blue", 2005));
        listCar.add(new Car("Lexus", "white", 2001));
        listCar.add(new Car("Kia", "grey", 2008));
    }

    @Override
    public List<Car> getCars(int n) {
        List<Car> newListCar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            newListCar.add(listCar.get(i));
        }
        return newListCar;
    }
}
