package bg.borismilanov.babyParentHelper.model.dto;

import bg.borismilanov.babyParentHelper.model.entity.UserEntity;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

public class AddArticleDTO {
    @NotBlank
    private String name;

    private String description;

    @Column(columnDefinition = "TEXT")
    @NotBlank
    private String content;

    @NotBlank
    private String picturesUrl;

    @NotBlank
    @DateTimeFormat
    private LocalDateTime publishDate;

    @ManyToOne
    private UserEntity author;

    public AddArticleDTO() {
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

    public LocalDateTime getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDateTime publishDate) {
        this.publishDate = publishDate;
    }

    public UserEntity getAuthor() {
        return author;
    }

    public void setAuthor(UserEntity author) {
        this.author = author;
    }
}
