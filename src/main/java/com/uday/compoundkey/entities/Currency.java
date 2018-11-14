package com.uday.compoundkey.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CURRENCY")
public class Currency {

    private String name;
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
