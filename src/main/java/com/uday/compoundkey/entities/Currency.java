package com.uday.compoundkey.entities;

import com.uday.compoundkey.entities.ids.CurrencyId;

import javax.persistence.*;

@Entity
@Table(name="CURRENCY")
@IdClass(CurrencyId.class)
public class Currency {

    @Id
    @Column(name="NAME")
    private String name;

    @Id
    @Column(name="COUNTRY_NAME")
    private String countryName;

    private String symbol;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
