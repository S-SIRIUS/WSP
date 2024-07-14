package me.sirius.WSP.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Data //getter & setter
//CommentId(복합키 객체)
class CommentId implements Serializable {
    @Column(name="a_id")
    private int a_id;

    @Column(name="id")
    private int id;
}