package bg.borismilanov.babyParentHelper.model.dto;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;
import java.time.LocalDate;

public class AddSleepTimeDTO {
    @NotBlank
    private LocalDate sleepDate;

    @PositiveOrZero
    private int firstSleep;

    @PositiveOrZero
    private int secondSleep;

    @PositiveOrZero
    private int thirdSleep;

    @PositiveOrZero
    private int fourthSleep;

    @PositiveOrZero
    private int fifthSleep;

    @PositiveOrZero
    private int sixthSleep;

    @PositiveOrZero
    private int seventhSleep;

    @PositiveOrZero
    private int eighthSleep;

    @PositiveOrZero
    private int countOfSleeps;

    @PositiveOrZero
    private int durationOfSleep;

    public AddSleepTimeDTO() {
    }

    public LocalDate getSleepDate() {
        return sleepDate;
    }

    public void setSleepDate(LocalDate sleepDate) {
        this.sleepDate = sleepDate;
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
}
