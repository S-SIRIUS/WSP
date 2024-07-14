package me.sirius.WSP.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="problem")
public class Problem {

    //문제 ID
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", updatable = false)
    private int id;

    // 문제의 점수
    @Column(name="points")
    private int points;
}
