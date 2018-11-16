package com.uday.compoundkey;

import com.uday.compoundkey.entities.Currency;
import com.uday.compoundkey.entities.ids.CurrencyId;
import com.uday.util.ConnectionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CompoundPrimaryKeyUsage {
    public static void main(String args[]){

        SessionFactory sessionFactory= ConnectionFactory.getSessionFactory();
        Session session_1=sessionFactory.openSession();
        Transaction transaction=session_1.beginTransaction();

        Currency currency=new Currency();
        currency.setCountryName("USA");
        currency.setName("DOLLAR");
        currency.setSymbol("$");
        session_1.save(currency);
        transaction.commit();
        session_1.close();

        Session session_2=sessionFactory.openSession();
        Currency currency_1=(Currency) session_2.get(Currency.class,new CurrencyId("DOLLAR","USA"));

        System.out.println("The retrived currency symbol is: "+currency_1.getSymbol());
        session_2.close();
    }
}
