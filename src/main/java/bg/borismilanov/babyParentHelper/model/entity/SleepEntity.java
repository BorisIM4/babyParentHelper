package bg.borismilanov.babyParentHelper.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "sleep_time")
public class SleepEntity extends BaseEntity{

    @Column(nullable = false)
    private LocalDate sleepDate;

    private int firstSleep;

    private int secondSleep;

    private int thirdSleep;

    private int fourthSleep;

    private int fifthSleep;

    private int sixthSleep;

    private int seventhSleep;

    private int eighthSleep;

    private int countOfSleeps;

    private int durationOfSleep;

    public SleepEntity() {
    }

    public int getFirstSleep() {
        return firstSleep;
    }

    public void setFirstSleep(int firstSleep) {
        this.firstSleep = firstSleep;
    }

    public int getSecondSleep() {
        return secondSleep;
    }

    public void setSecondSleep(int secondSleep) {
        this.secondSleep = secondSleep;
    }

    public int getThirdSleep() {
        return thirdSleep;
    }

    public void setThirdSleep(int thirdSleep) {
        this.thirdSleep = thirdSleep;
    }

    public int getFourthSleep() {
        return fourthSleep;
    }

    public void setFourthSleep(int fourthSleep) {
        this.fourthSleep = fourthSleep;
    }

    public int getFifthSleep() {
        return fifthSleep;
    }

    public void setFifthSleep(int fifthSleep) {
        this.fifthSleep = fifthSleep;
    }

    public int getSixthSleep() {
        return sixthSleep;
    }

    public void setSixthSleep(int sixthSleep) {
        this.sixthSleep = sixthSleep;
    }

    public int getSeventhSleep() {
        return seventhSleep;
    }

    public void setSeventhSleep(int seventhSleep) {
        this.seventhSleep = seventhSleep;
    }

    public int getEighthSleep() {
        return eighthSleep;
    }

    public void setEighthSleep(int eighthSleep) {
        this.eighthSleep = eighthSleep;
    }

    public int getCountOfSleeps() {
        return countOfSleeps;
    }

    public void setCountOfSleeps(int countOfSleeps) {
        this.countOfSleeps = countOfSleeps;
    }

    public int getDurationOfSleep() {
        return durationOfSleep;
    }

    public void setDurationOfSleep(int durationOfSleep) {
        this.durationOfSleep = durationOfSleep;
    }

    public LocalDate getSleepDate() {
        return sleepDate;
    }

    public void setSleepDate(LocalDate sleepDate) {
        this.sleepDate = sleepDate;
    }
}
