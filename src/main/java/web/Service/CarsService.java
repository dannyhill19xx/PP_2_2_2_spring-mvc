package web.Service;

import web.Models.Cars;

import java.util.List;

public interface CarsService {
    public List<Cars> carsCount(List<Cars> list, int number);
}
