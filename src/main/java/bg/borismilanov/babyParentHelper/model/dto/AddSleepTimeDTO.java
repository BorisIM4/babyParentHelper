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


}
