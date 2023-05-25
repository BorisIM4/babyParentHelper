package bg.borismilanov.babyParentHelper.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "general_statistics")
public class GeneralStatisticEntity extends BaseEntity {

    @Column(nullable = false)
    private LocalDate generalStatsDay;

    @Column
    private Long registeredUserPerDay;

    @Column
    private Long visitorsPerDay;

    @Column
    private Long uniqueVisitorsPerDay;

    public GeneralStatisticEntity() {
    }

    public LocalDate getGeneralStatsDay() {
        return generalStatsDay;
    }

    public void setGeneralStatsDay(LocalDate generalStatsDay) {
        this.generalStatsDay = generalStatsDay;
    }

    public Long getRegisteredUserPerDay() {
        return registeredUserPerDay;
    }

    public void setRegisteredUserPerDay(Long registeredUserPerDay) {
        this.registeredUserPerDay = registeredUserPerDay;
    }

    public Long getVisitorsPerDay() {
        return visitorsPerDay;
    }

    public void setVisitorsPerDay(Long visitorsPerDay) {
        this.visitorsPerDay = visitorsPerDay;
    }

    public Long getUniqueVisitorsPerDay() {
        return uniqueVisitorsPerDay;
    }

    public void setUniqueVisitorsPerDay(Long uniqueVisitorsPerDay) {
        this.uniqueVisitorsPerDay = uniqueVisitorsPerDay;
    }
}
