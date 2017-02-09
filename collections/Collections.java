/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

import java.util.*;

/**
 *
 * @author Philip
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        makeSalad();            // List example
        searchScriptures();     // Map example
        collectFruits();        // Set example
        crazyCountdown();       // Tree example
    }

    public static void makeSalad() {

        System.out.println("\nList Example - ArrayList");
        printLineSeperator();

        ArrayList<String> salad = new ArrayList();

        // populate our list
        salad.add("Lettuce");
        salad.add("Bacon");
        salad.add("spinach");
        salad.add("Tomatoes");
        salad.add("Ranch");
        // these go after the dressing
        salad.add("Croutons");

        System.out.println("Our salad consists of: " + salad);

        // these need to be before the dressing
        salad.add(salad.indexOf("Ranch") - 1, "Peas");

        // we don't really want tomatoes
        salad.remove("Tomatoes");
        // no do we want the third item (spnach) in our list
        salad.remove(2);

        // after the dressing
        salad.add("Sunflower Seeds");

        // before the dresssing
        salad.add(salad.indexOf("Ranch") - 1, "Cheese");
        salad.add(salad.indexOf("Ranch") - 1, "Beets");

        // replace Beets with Kidney Beans
        salad.set(salad.indexOf("Beets"), "Kidney Beans");

        System.out.println("Our salad consists of: " + salad);

        // do we have these ingredients?
        System.out.println("Does our salad have Tomatoes? " + ((salad.contains("Tomatoes")) ? "Yes" : "No"));
        System.out.println("Does our salad have Peas? " + ((salad.contains("Peas")) ? "Yes" : "No"));

        // clear the collection
        salad.clear();

        System.out.println("Our salad consists of: " + salad );
        System.out.println("Guess we're having burgers.");
    }

    public static void searchScriptures() {

        System.out.println("\nMap Example - HashMap");
        printLineSeperator();

        HashMap<String, String> books = new HashMap();

        // populate our map
        books.put("Nephi", "The Book of Mormon");
        books.put("Daniel", "The Old Testament");
        books.put("Mathew", "The New Testament");
        books.put("Baruch", "The Old Testament");
        books.put("Moses", "The Old Testament");

        System.out.println("Books of Scriptures " + books);

        // find out which book Moses is in
        System.out.println("The book of Moses is in " + books.get("Moses"));

        // Moses needs to be fixed. It's is in The Pearl of Great Price
        books.put("Moses", "The Pearl of Great Price");

        System.out.println("The book of Moses is in " + books.get("Moses"));

        // Baruch isn't part of the KJV bible
        books.remove("Baruch");

        System.out.println("Books of Scriptures " + books);

        // do we have certain books?
        System.out.println("Do we have a book from The Old Testament? " + ((books.containsValue("The Old Testament")) ? "Yes" : "No"));
        System.out.println("Do we have a book from The Doctrine and Covenants? " + ((books.containsValue("The Doctrine and Covenants")) ? "Yes" : "No"));

        System.out.println("Do we have words from Nephi? " + ((books.containsKey("Nephi")) ? "Yes" : "No"));
        System.out.println("Do we have words from Alma? " + ((books.containsKey("Alma")) ? "Yes" : "No"));
    }

    public static void collectFruits() {

        System.out.println("\nSet Example - HashSet");
        printLineSeperator();

        HashSet<String> fruits = new HashSet();

        // populate our set
        fruits.add("Apple");
        fruits.add("Pear");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Lime");

        System.out.println("The Fruit Bowl has " + fruits.size() + " fruits: " + fruits);

        // HashSets can't have duplicates, but we'll try anyway
        fruits.add("Lime");
        fruits.add("Pear");

        System.out.println("The Fruit Bowl has " + fruits.size() + " fruits: " + fruits);

        // don't need these in our bowl
        fruits.remove("Lime");

        System.out.println("The fruit bowl has " + fruits.size() + " fruits: " + fruits);

        // do we have these fruits?
        System.out.println("Does our fruit bowl have Apples? " + ((fruits.contains("Apple")) ? "Yes" : "No"));
        System.out.println("Does our fruie bowl have Limes? " + ((fruits.contains("Lime")) ? "Yes" : "No"));

    }

    private static void crazyCountdown() {

        System.out.println("\nTree Example - TreeSet");
        printLineSeperator();

        TreeSet<Integer> countdown = new TreeSet<Integer>();

        // populate our tree
        countdown.add(1);
        countdown.add(15);
        countdown.add(9);
        countdown.add(20);
        countdown.add(18);
        countdown.add(15);  // duplicates don't work
        countdown.add(5);
        countdown.add(3);
        countdown.add(11);
        countdown.add(3);   // duplicates don't work

        // we don't need 18
        countdown.remove(18);

        // print our coundown (or really our countup)
        for (int num : countdown) {
            System.out.println("T minus " + num + " and counting");
        }
    }

    private static void printLineSeperator() {
        for(int i = 1; i <= 50; i++) {
            System.out.print("-");
        }
        System.out.println("");
    }
}
