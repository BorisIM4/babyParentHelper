package bg.borismilanov.babyParentHelper.model.entity;

import jdk.jfr.Timespan;
import jdk.jfr.Timestamp;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "sleep_time")
public class SleepEntity extends BaseEntity{

    @DateTimeFormat(pattern = "dd.MM.yyyy")
    @NotBlank
    private LocalDate sleepDay;

    @Timestamp
    private LocalTime firstSleepStart;

    @Timestamp
    private LocalTime firstSleepEnd;

    @Timestamp
    private LocalTime secondSleepStart;

    @Timestamp
    private LocalTime secondSleepEnd;

    @Timestamp
    private LocalTime thirdSleepStart;

    @Timestamp
    private LocalTime thirdSleepEnd;

    @Timestamp
    private LocalTime fourthSleepStart;

    @Timestamp
    private LocalTime fourthSleepEnd;

    @Timestamp
    private LocalTime fifthSleepStart;

    @Timestamp
    private LocalTime fifthSleepEnd;

    @Timestamp
    private LocalTime sixthSleepStart;

    @Timestamp
    private LocalTime sixthSleepEnd;

    @Timestamp
    private LocalTime seventhSleepStart;

    @Timestamp
    private LocalTime seventhSleepEnd;

    @Timestamp
    private LocalTime eighthSleepEnd;

    private int countOfSleeps;

    private int
}
