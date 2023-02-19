public class CarsAssemble {

    // speed * 221 / 100 * 90

    public double productionRatePerHour(int speed) {
        switch (speed) {
            case 1, 2, 3, 4 -> {
                return (double) speed * 221;
            }
            case 5, 6, 7, 8 -> {
                return (double) speed * 221 / 100 * 90;
            }
            case 9 -> {
                return (double) speed * 221 / 100 * 80;
            }
            case 10 -> {
                return (double) speed * 221 / 100 * 77;
            }
            default -> {
                return 0.0;
            }
        }
    }


    public int workingItemsPerMinute(int speed) {
        return (int)productionRatePerHour(speed) / 60;
    }
}
