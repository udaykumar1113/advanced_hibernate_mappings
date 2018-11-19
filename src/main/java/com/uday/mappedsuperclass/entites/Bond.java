package com.uday.mappedsuperclass.entites;

import javax.persistence.*;

@Entity
@Table(name="BOND")
public class Bond extends Investment{

    @Column(name = "BOND_ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bondId;

    private float bondPrice;

    public int getBondId() {
        return bondId;
    }

    public void setBondId(int bondId) {
        this.bondId = bondId;
    }

    public float getBondPrice() {
        return bondPrice;
    }

    public void setBondPrice(float bondPrice) {
        this.bondPrice = bondPrice;
    }
}
