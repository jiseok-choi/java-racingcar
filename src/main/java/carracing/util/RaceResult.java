package carracing.util;

/*
 * CarRacing
 *
 * Version 1.0.0
 *
 * 2021-11-12
 *
 * author jiseok-choi
 *
 * 주행 결과 클래스
 *
 */
public class RaceResult {
    public int roundCount;
    public int totalRaceCount;
    public int maximumDistance;

    public RaceResult() {
    }

    public void findMaximumDistance(Cars cars) {
        for (Car car : cars.getCars()) {
            this.maximumDistance = Math.max(this.maximumDistance, car.getDrivingHistory());
        }
    }
}
