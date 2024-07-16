package me.sirius.WSP.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@EntityListeners(AuditingEntityListener.class) // 글엔티티에서 수정시 자동반영
@Table(name="article")
public class Article {

    //글 ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false, updatable = false)
    private Long id;

    //제목
    @Column(name="title", nullable=false) // 글 작성시 제목 필수
    private String title;

    //내용
    @Column(name="content", nullable=false) //글 작성시 내용 필수
    private String content;

    //글쓴날짜
    @CreatedDate // 글쓴날짜
    @Column(name = "w_date", updatable = false, nullable = false) //생성일은 무조건 생성 + 업데이트 불가
    private LocalDateTime w_date;

    //수정한 날짜
    @LastModifiedDate //수정한 날짜
    @Column(name = "u_date", nullable = false) // 변경가능
    private LocalDateTime u_date;

    //사용자 ID(FK)
    @ManyToOne // 사용자가 탈퇴해도 게시글은 남는다.
    @JoinColumn(name = "u_id", referencedColumnName = "id")
    private User user;

    // 글에 달린 댓글들 쉽게 조회하기 위해 양방향매핑
    @OneToMany(mappedBy = "article", cascade= CascadeType.REMOVE)
    private List<Comment> comments;

}
