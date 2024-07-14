package me.sirius.WSP.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name="user_info")
public class UserInfo {

    @EmbeddedId
    private UserInfoId id;

    // FK(사용자 계정의 ID)
    @OneToOne
    @JoinColumn(name="u_id", referencedColumnName = "id")
    User user;

    // 가지고 있는 총점수
    @Column(name="total_points")
    private int total_points;

    // 랭킹
    @Column(name="rank")
    private int rank;

    // 프로필 메시지
    @Column(name="introduction")
    private String introduction;
}

