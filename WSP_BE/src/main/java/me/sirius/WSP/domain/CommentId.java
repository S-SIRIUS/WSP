package me.sirius.WSP.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Getter
//CommentId(복합키 객체)
class CommentId implements Serializable {
    @Column(name="a_id")
    private int a_id;

    @Column(name="id", nullable=false, updatable = false)
    private int id;
}