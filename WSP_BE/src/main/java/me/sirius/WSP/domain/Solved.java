package me.sirius.WSP.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="solved_problem")
// 사용자가 푼 문제 테이블
public class Solved {

    // 푼문제 id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable = false, updatable = false)
    private int id;

    // FK(사용자 Id)
    @ManyToOne
    @JoinColumn(name="u_id", referencedColumnName = "id")
    User user;

    // FK(문제 Id)
    @ManyToOne
    @JoinColumn(name="p_id", referencedColumnName = "id")
    Problem problem;

    // 문제를 푼날짜
    @Column(name="s_date", updatable = false)
    private LocalDateTime s_date;

}