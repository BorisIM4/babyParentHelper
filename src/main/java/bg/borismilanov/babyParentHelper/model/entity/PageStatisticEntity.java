package bg.borismilanov.babyParentHelper.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "page_statistics")
public class PageStatisticEntity extends BaseEntity {

    @Column(nullable = false)
    private LocalDate pageStatsDay;

    private Long indexPageStatsPerDay;

    private Long registerPageStatsPeeDay;

    private Long loginPageStatsPerDay;

    private Long kidsPageStatsPerDay;

    private Long feedingPageStatsPerDay;

    private Long sleepPageStatsPerDay;

    private Long medicalPageStatsPerDay;

    private Long articlePageStatsPerDay;

    private Long helpPageStatsPerDay;

    public PageStatisticEntity() {
    }

    public LocalDate getPageStatsDay() {
        return pageStatsDay;
    }

    public void setPageStatsDay(LocalDate pageStatsDay) {
        this.pageStatsDay = pageStatsDay;
    }

    public Long getIndexPageStatsPerDay() {
        return indexPageStatsPerDay;
    }

    public void setIndexPageStatsPerDay(Long indexPageStatsPerDay) {
        this.indexPageStatsPerDay = indexPageStatsPerDay;
    }

    public Long getRegisterPageStatsPeeDay() {
        return registerPageStatsPeeDay;
    }

    public void setRegisterPageStatsPeeDay(Long registerPageStatsPeeDay) {
        this.registerPageStatsPeeDay = registerPageStatsPeeDay;
    }

    public Long getLoginPageStatsPerDay() {
        return loginPageStatsPerDay;
    }

    public void setLoginPageStatsPerDay(Long loginPageStatsPerDay) {
        this.loginPageStatsPerDay = loginPageStatsPerDay;
    }

    public Long getKidsPageStatsPerDay() {
        return kidsPageStatsPerDay;
    }

    public void setKidsPageStatsPerDay(Long kidsPageStatsPerDay) {
        this.kidsPageStatsPerDay = kidsPageStatsPerDay;
    }

    public Long getFeedingPageStatsPerDay() {
        return feedingPageStatsPerDay;
    }

    public void setFeedingPageStatsPerDay(Long feedingPageStatsPerDay) {
        this.feedingPageStatsPerDay = feedingPageStatsPerDay;
    }

    public Long getSleepPageStatsPerDay() {
        return sleepPageStatsPerDay;
    }

    public void setSleepPageStatsPerDay(Long sleepPageStatsPerDay) {
        this.sleepPageStatsPerDay = sleepPageStatsPerDay;
    }

    public Long getMedicalPageStatsPerDay() {
        return medicalPageStatsPerDay;
    }

    public void setMedicalPageStatsPerDay(Long medicalPageStatsPerDay) {
        this.medicalPageStatsPerDay = medicalPageStatsPerDay;
    }

    public Long getArticlePageStatsPerDay() {
        return articlePageStatsPerDay;
    }

    public void setArticlePageStatsPerDay(Long articlePageStatsPerDay) {
        this.articlePageStatsPerDay = articlePageStatsPerDay;
    }

    public Long getHelpPageStatsPerDay() {
        return helpPageStatsPerDay;
    }

    public void setHelpPageStatsPerDay(Long helpPageStatsPerDay) {
        this.helpPageStatsPerDay = helpPageStatsPerDay;
    }
}
