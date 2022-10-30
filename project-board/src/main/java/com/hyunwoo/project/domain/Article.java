package com.hyunwoo.project.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;


@Getter
@ToString
@Table(indexes = {
        @Index(columnList = "title"),
        @Index(columnList = "tashtag"),
        @Index(columnList = "createdAt"),
        @Index(columnList = "createdBy"),
})
@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter private String title; // 제목
    @Setter private String content; // 본문

    @Setter private String hashtag; // 해시태그

    @CreatedDate private LocalDateTime createAt; // 생성일시
    @CreatedBy private String createBy; // 생성자
    @LastModifiedDate private LocalDateTime modifiedAt; // 수정일시
    @LastModifiedBy private String modifiedBy; // 수정자
}
