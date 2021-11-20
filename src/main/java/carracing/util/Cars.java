package carracing.util;

import java.util.List;

public class Cars {

    private final List<Car> carList;

    public Cars(List<Car> carList) {
        this.carList = carList;
    }

    public Car get(int index) {
        return this.carList.get(index);
    }

    public List<Car> getCars() {
        return this.carList;
    }

    public Winners getWinner(RaceResult raceResult) {
        return new Winners(this.carList, raceResult);
    }

}
