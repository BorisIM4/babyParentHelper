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
}
