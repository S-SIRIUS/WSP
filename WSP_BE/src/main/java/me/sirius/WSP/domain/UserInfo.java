package me.sirius.WSP.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Table(name="user_info")
public class UserInfo {

    // Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false, updatable = false)
    private Long id;

    // 가지고 있는 총점수
    @Column(name="total_points")
    private int total_points;

    // 랭킹
    @Column(name="ranking")
    private int ranking;

    // 프로필 메시지
    @Column(name="introduction")
    private String introduction;
}

