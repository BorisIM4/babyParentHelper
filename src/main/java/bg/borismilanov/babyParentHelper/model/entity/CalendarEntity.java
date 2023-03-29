package bg.borismilanov.babyParentHelper.model.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "date")
public class CalendarEntity extends BaseEntity {

    @DateTimeFormat(pattern = "dd.MM.yyyy")
    @NotBlank
    private LocalDate sleepDay;

    @ManyToMany(mappedBy = "day")
    private List<KidsEntity> kid;
}
