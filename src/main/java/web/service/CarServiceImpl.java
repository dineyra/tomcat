package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarsDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private final CarsDao carsDao;

    public CarServiceImpl(CarsDao carsDao) {
        this.carsDao = carsDao;
    }

    @Override
    public List<Car> getCars(int n) {
        if (n >= 5 || n == 0) {
            n = carsDao.getCars().size();
        }
        return carsDao.getCars().subList(0, n);
    }
}
