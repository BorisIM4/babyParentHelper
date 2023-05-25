package bg.borismilanov.babyParentHelper.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "general_statistics")
public class GeneralStatisticEntity extends BaseEntity {

    @Column
    private LocalDate statisticsDate;

    @Column
    private Long registeredUser;

    @Column
    private Long visitorsPerDay;

    @Column
    private Long uniqueVisitorsPerDay;

    public GeneralStatisticEntity() {
    }

    public LocalDate getStatisticsDate() {
        return statisticsDate;
    }

    public void setStatisticsDate(LocalDate statisticsDate) {
        this.statisticsDate = statisticsDate;
    }

    public Long getRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(Long registeredUser) {
        this.registeredUser = registeredUser;
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
