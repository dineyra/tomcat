package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class CarsDaoImpl implements CarsDao {
    List<Car> listCar = new ArrayList<>();

    {
        listCar.add(new Car("Mers", "black", 2000));
        listCar.add(new Car("Audi", "yellow", 2010));
        listCar.add(new Car("Bmw", "blue", 2005));
        listCar.add(new Car("Lexus", "white", 2001));
        listCar.add(new Car("Kia", "grey", 2008));
    }

    public List<Car> getCars() {
        return Collections.unmodifiableList(listCar);
    }
}
