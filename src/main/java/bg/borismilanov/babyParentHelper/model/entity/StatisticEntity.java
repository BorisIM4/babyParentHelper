package bg.borismilanov.babyParentHelper.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "statistics")
public class StatisticEntity extends BaseEntity {

    @Column
    private Long registeredUser;

    @Column
    private Long visitorsPerDay;

    @Column
    private Long uniqueVisitorsPerDay;
}
