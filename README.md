# bird-watcher 

Just a short practice on streams.

```java
public BirdWatcher(int[] birdsPerDay) {  
    this.birdsPerDay = birdsPerDay.clone();  
}
// safe copy

public int[] getLastWeek() {  
    return birdsPerDay.clone(); // Defensive Copying  
}

public int getToday() {  
    return birdsPerDay.length == 0 ? 0 : birdsPerDay[birdsPerDay.length - 1];
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
```