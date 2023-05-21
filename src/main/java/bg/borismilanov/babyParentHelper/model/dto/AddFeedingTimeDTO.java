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
}
