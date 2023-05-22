package bg.borismilanov.babyParentHelper.model.dto;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;
import java.time.LocalDate;

public class AddFeedingTimeDTO {
    @NotBlank
    private LocalDate sleepDate;

    @PositiveOrZero
    private int firstFeed;

    @PositiveOrZero
    private int secondFeed;

    @PositiveOrZero
    private int thirdFeed;

    @PositiveOrZero
    private int fourthFeed;

    @PositiveOrZero
    private int fifthFeed;

    @PositiveOrZero
    private int sixthFeed;

    @PositiveOrZero
    private int seventhFeed;

    @PositiveOrZero
    private int eighthFeed;

    @PositiveOrZero
    private int countOfFeed;

    @PositiveOrZero
    private int durationOfFeed;

    public AddFeedingTimeDTO() {
    }

    public LocalDate getSleepDate() {
        return sleepDate;
    }

    public void setSleepDate(LocalDate sleepDate) {
        this.sleepDate = sleepDate;
    }

    public int getFirstFeed() {
        return firstFeed;
    }

    public void setFirstFeed(int firstFeed) {
        this.firstFeed = firstFeed;
    }

    public int getSecondFeed() {
        return secondFeed;
    }

    public void setSecondFeed(int secondFeed) {
        this.secondFeed = secondFeed;
    }

    public int getThirdFeed() {
        return thirdFeed;
    }

    public void setThirdFeed(int thirdFeed) {
        this.thirdFeed = thirdFeed;
    }

    public int getFourthFeed() {
        return fourthFeed;
    }

    public void setFourthFeed(int fourthFeed) {
        this.fourthFeed = fourthFeed;
    }

    public int getFifthFeed() {
        return fifthFeed;
    }

    public void setFifthFeed(int fifthFeed) {
        this.fifthFeed = fifthFeed;
    }

    public int getSixthFeed() {
        return sixthFeed;
    }

    public void setSixthFeed(int sixthFeed) {
        this.sixthFeed = sixthFeed;
    }

    public int getSeventhFeed() {
        return seventhFeed;
    }

    public void setSeventhFeed(int seventhFeed) {
        this.seventhFeed = seventhFeed;
    }

    public int getEighthFeed() {
        return eighthFeed;
    }

    public void setEighthFeed(int eighthFeed) {
        this.eighthFeed = eighthFeed;
    }

    public int getCountOfFeed() {
        return countOfFeed;
    }

    public void setCountOfFeed(int countOfFeed) {
        this.countOfFeed = countOfFeed;
    }

    public int getDurationOfFeed() {
        return durationOfFeed;
    }

    public void setDurationOfFeed(int durationOfFeed) {
        this.durationOfFeed = durationOfFeed;
    }
}
