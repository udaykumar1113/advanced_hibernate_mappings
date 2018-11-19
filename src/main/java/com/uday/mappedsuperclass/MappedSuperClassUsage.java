package com.uday.mappedsuperclass;

import com.uday.mappedsuperclass.entites.Bond;
import com.uday.mappedsuperclass.entites.Stock;
import com.uday.util.ConnectionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Date;

public class MappedSuperClassUsage {
    public static void main(String args[]){

        SessionFactory sessionFactory= ConnectionFactory.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        Stock stock=new Stock();
        stock.setStockPrice(100.00f);
        stock.setIssuer("ROBINHOOD");
        stock.setName("GENERAL ELECTRIC");
        stock.setPurchaseDate(new Date());

        Bond bond=new Bond();
        bond.setIssuer("COBINHOOD");
        bond.setBondPrice(1500.00f);
        bond.setName("PC RICHARD SONS");
        bond.setPurchaseDate(new Date());

        session.save(stock);
        session.save(bond);

        transaction.commit();
        session.close();

    }
}

