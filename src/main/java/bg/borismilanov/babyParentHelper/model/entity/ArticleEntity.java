package bg.borismilanov.babyParentHelper.model.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "articles")
public class ArticleEntity extends BaseEntity {

    @Column(nullable = false)
    private String name;

    private String description;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    @Column(nullable = false)
    private String picturesUrl;

    @Column(nullable = false)
    private LocalDate publishDate;

    //one directional relation. Only
    @ManyToOne
    private UserEntity author;

    public ArticleEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPicturesUrl() {
        return picturesUrl;
    }

    public void setPicturesUrl(String picturesUrl) {
        this.picturesUrl = picturesUrl;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public UserEntity getAuthor() {
        return author;
    }

    public void setAuthor(UserEntity author) {
        this.author = author;
    }
}
