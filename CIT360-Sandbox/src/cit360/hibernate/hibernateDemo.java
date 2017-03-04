/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.hibernate;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Philip
 */
public class hibernateDemo {

    public static void main(String[] args) {
        // disable copious amount of hibernate logging
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.SEVERE);

        Scanner input = new Scanner(System.in);

        String sodaMenu = "\n"
            + "\n---------------------------------------"
            + "\n Soda Menu                            |"
            + "\n---------------------------------------"
            + "\n1 - List Sodas"
            + "\n2 - Describe a soda (requires sodaID)"
            + "\n3 - Add a soda"
            + "\n4 - Update a soda (requires sodaID)"
            + "\n5 - Delete a soda (requires sodaID)"
            + "\nE - Exit"
            + "\n---------------------------------------"
            + "\n"
            + "\nEnter an action: ";

        boolean done = false;
        char choice;
        String sodaId = null;

        while(!done) {

            System.out.print(sodaMenu);
            choice = input.nextLine().charAt(0);

            switch(choice) {
                case '1': // list sodas
                    listSodas();
                    break;
                case '2': // describe soda
                    System.out.print("\nEnter an ID to describe: ");
                    sodaId = input.nextLine();
                    describeSoda(Integer.parseInt(sodaId));
                    break;
                case '3': // add soda
                    System.out.print("\nEnter a name: ");
                    String name = input.nextLine();
                    System.out.print("Enter a flavor: ");
                    String flavor = input.nextLine();
                    System.out.print("Enter a color: ");
                    String color = input.nextLine();
                    Integer newId = addSoda(name, flavor, color);
                    System.out.print("\n" + name + " was added as ID " + newId.toString());
                    break;
                case '4': // update soda
                    System.out.print("\nEnter an ID to update: ");
                    sodaId = input.nextLine();
                    System.out.print("Enter a field to update: ");
                    String field = input.nextLine();
                    System.out.print("Enter a new value: ");
                    String value = input.nextLine();
                    updateSoda(Integer.parseInt(sodaId), field.toLowerCase(), value);
                    break;
                case '5': // delete
                    System.out.print("\nEnter an ID to delete: ");
                    sodaId = input.nextLine();
                    deleteSoda(Integer.parseInt(sodaId));
                    break;
                case 'e': // exit menu
                    done = true;
                    break;
                default:
                    System.out.print("\nInvalid selection: Try again");
                    break;
            }
        }

        HibernateUtil.getSessionFactory().close();
   }

   /* Method to  READ all the employees */
    public static void listSodas() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            List sodas = session.createQuery("FROM Soda").list();
            System.out.println("SodaId\tSodaName");
            System.out.println("------------------------------");
            for (Iterator iterator = sodas.iterator(); iterator.hasNext();) {
                Soda soda = (Soda) iterator.next();
                System.out.println(soda.getSodaId() + "\t" + soda.getName());
            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    private static Soda getSoda(Integer SodaId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Soda soda = null;

        try {
            tx = session.beginTransaction();
            soda = (Soda)session.get(Soda.class, SodaId);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        return soda;
    }

    private static void describeSoda(Integer SodaId) {

        Soda soda = getSoda(SodaId);

        System.out.println("ID: " + soda.getSodaId());
        System.out.println("Name: " + soda.getName());
        System.out.println("Flavor: " + soda.getFlavor());
        System.out.println("Color: " + soda.getColor());
    }

    private static Integer addSoda(String name, String flavor, String color){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Integer sodaId = null;

        try {
            tx = session.beginTransaction();
            Soda soda = new Soda(name, flavor, color);
            sodaId = (Integer) session.save(soda);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        return sodaId;
    }

    private static void updateSoda(Integer SodaId, String field, String value) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Soda soda = getSoda(SodaId);

        switch(field) {
            case "name" :
                soda.setName(value);
                break;
            case "flavor" :
                soda.setFlavor(value);
                break;
            case "color" :
                soda.setColor(value);
                break;
        }

        try {
            tx = session.beginTransaction();
            session.update(soda);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    private static void deleteSoda(Integer SodaId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Soda soda = getSoda(SodaId);

        try{
            tx = session.beginTransaction();
            session.delete(soda);
            tx.commit();
        }catch (HibernateException e) {
             if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
             session.close();
        }
   }
}
