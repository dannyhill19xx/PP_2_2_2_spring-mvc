package web.Service;

import web.Models.Cars;

import java.util.List;

public class CarsServiceImpl implements CarsService {

    public List<Cars> carsCount(List<Cars> list, int number) {

        return (number == 0 || number > 5) ? list : list.subList(0, number);
    }
}
