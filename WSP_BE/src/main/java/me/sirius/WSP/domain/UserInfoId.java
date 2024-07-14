package me.sirius.WSP.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class UserInfoId implements Serializable {
    @Column(name="id")
    private int id;

    @Column(name="u_id")
    private int u_id;
}