package com.company;
import java.time.LocalTime;
import java.time.Duration;

public interface Visitable {
    LocalTime getOpeningTime();
    LocalTime getClosingTime();
    default LocalTime setDefaultOpeningTime() {
        return LocalTime.of(9,30);
    }

    default LocalTime setDefaultClosingTime() {
        return LocalTime.of(20,00);
    }

    static Duration getVisitingDuration(Location object) {
        return Duration.between(object.getOpeningTime(), object.getClosingTime());
    }
}
