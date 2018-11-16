package com.uday.compositejoincolumn.entites;

import javax.persistence.*;

@Entity
@Table(name="MARKET")
public class Market {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int marketId;

    @Column(name="MARKET_NAME")
    private String marketName;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "CURRENCY_NAME", referencedColumnName = "CURRENCY_NAME"),
            @JoinColumn(name = "COUNTRY_NAME", referencedColumnName = "COUNTRY_NAME")
    })
    private Currency currency;

    public int getMarketId() {
        return marketId;
    }

    public void setMarketId(int marketId) {
        this.marketId = marketId;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
