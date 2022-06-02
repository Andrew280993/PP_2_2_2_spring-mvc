package web.DAO;

import org.springframework.stereotype.Component;
import web.pojo.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarsDAO {
    List<Car> cars;
    { cars=new ArrayList<>();
        cars.add(new Car(1,"Volkswagen", 3));
        cars.add(new Car(2,"BMW", 2));
        cars.add(new Car(3,"Audi", 4));
        cars.add(new Car(4,"Lada", 3));
        cars.add(new Car(5,"Lambogini", 3));
    }

    public List<Car> carsFilter(int count) {
        if (count >= 5 || count <= 0) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }

}
