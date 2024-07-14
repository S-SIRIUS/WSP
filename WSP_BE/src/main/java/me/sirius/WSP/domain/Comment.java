package me.sirius.WSP.domain;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class) // 댓글 수정 자동반영
@Table(name="comment")
public class Comment {

    @EmbeddedId //복합키(글의 ID, 댓글의 ID): "약한개체"
    private CommentId id;

    // 댓글 내용
    @Column(name="content", nullable = false)
    private String content;


    // 댓글 쓴 날짜
    @CreatedDate
    @Column(name = "w_date", updatable = false, nullable = false) //생성일은 무조건 생성 + 업데이트 불가
    private LocalDateTime w_date;

    // 댓글 수정한 날짜
    @LastModifiedDate //수정한 날짜
    @Column(name = "u_date", nullable = false) // 변경가능
    private LocalDateTime u_date;

    // 글의 ID(FK)
    @ManyToOne
    @MapsId("a_id")
    @JoinColumn(name="a_id", referencedColumnName = "id")
    Article article;
}
