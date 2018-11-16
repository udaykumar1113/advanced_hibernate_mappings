package com.uday.enumeration;

import com.uday.enumeration.entites.Account;
import com.uday.enumeration.entites.AccountType;
import com.uday.util.ConnectionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Date;

public class EnumerationUsage {
    public static void main(String args[]){

        SessionFactory sessionFactory= ConnectionFactory.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        Account account=new Account();
        account.setName("Harry");
        account.setLastAccessed(new Date());
        account.setAccountType(AccountType.CHECKING);
        session.save(account);
        transaction.commit();
        session.close();

        Session session1=sessionFactory.openSession();
        Account account1=session1.load(Account.class,1);
        System.out.println("The account type of Account Id 1 is: "+account1.getAccountType());
        session1.close();
    }
}
