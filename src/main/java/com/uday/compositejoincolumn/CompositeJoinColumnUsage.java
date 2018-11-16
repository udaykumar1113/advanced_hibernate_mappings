package com.uday.compositejoincolumn;

import com.uday.compositejoincolumn.entites.Currency;
import com.uday.compositejoincolumn.entites.Market;
import com.uday.util.ConnectionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CompositeJoinColumnUsage {

    public static void main(String args[]){

        SessionFactory sessionFactory= ConnectionFactory.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        Currency currency=new Currency();
        currency.setCountryName("USA");
        currency.setName("DOLLAR");
        currency.setSymbol("$");

        Market market=new Market();
        market.setMarketName("NYSE");
        market.setCurrency(currency);

        session.save(market);
        transaction.commit();

        session.close();
    }
}
