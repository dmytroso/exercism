import java.lang.reflect.Array;
import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay.length > 0 ? birdsPerDay[birdsPerDay.length - 1] : 0;
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        boolean containsZero = Arrays.stream(birdsPerDay).anyMatch(x -> x == 0);
        return containsZero;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int numberOfBirds = 0;

        for (int i = 0; i < numberOfDays && i < birdsPerDay.length; i++) {
            numberOfBirds += birdsPerDay[i];
        }
        return numberOfBirds;
    }


    public int getBusyDays() {
        int busyDays = 0;

        for (int days : birdsPerDay) {
            if (days >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }
}
