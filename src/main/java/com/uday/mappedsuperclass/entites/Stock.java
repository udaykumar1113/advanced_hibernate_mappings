package com.uday.mappedsuperclass.entites;

import javax.persistence.*;

@Entity
@Table(name="STOCK")
public class Stock extends Investment{

    @Column(name = "STOCK_ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stockId;

    private float stockPrice;

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public float getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(float stockPrice) {
        this.stockPrice = stockPrice;
    }
}
