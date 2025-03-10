import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

public BirdWatcher(int[] birdsPerDay) {
    this.birdsPerDay = birdsPerDay.clone();
}

public int[] getLastWeek() {
    return birdsPerDay.clone(); // Defensive Copying
}

public int getToday() {
    return birdsPerDay.length == 0 ? 0 : birdsPerDay[birdsPerDay.length - 1];
}

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] = getToday() + 1;
//        throw new UnsupportedOperationException("Please implement the BirdWatcher.incrementTodaysCount() method");
    }

public boolean hasDayWithoutBirds() {
    return Arrays.stream(birdsPerDay).anyMatch(e -> e == 0);
}

public int getCountForFirstDays(int numberOfDays) {
    return Arrays.stream(birdsPerDay).limit(numberOfDays).sum();
}

    public int getBusyDays() {
        // busy = 5 or more
        return (int) Arrays.stream(birdsPerDay).filter(e -> e >= 5).count();
    }

//    public static void main(String[] args) {
////        int[] lastWeek = {1,2,3,4,5,6,7};
//        int[] lastWeek = {};
//        BirdWatcher birdWatcher = new BirdWatcher(lastWeek);
//        System.out.println(birdWatcher.getToday());
//    }
}
