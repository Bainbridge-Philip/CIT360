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

        System.out.println("ArrayList");
        printLineSeperator();

        ArrayList<String> salad = new ArrayList();
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

        System.out.println("Does our salad have Tomatoes? " + ((salad.contains("Tomatoes")) ? "Yes" : "No"));
        System.out.println("Does our salad have Peas? " + ((salad.contains("Peas")) ? "Yes" : "No"));

        salad.clear();

        System.out.println("Our salad consists of: " + salad );
        System.out.println("Guess we're having burgers.");
    }

    public static void searchScriptures() {

        System.out.println("HashMap");
        printLineSeperator();

        HashMap<String, String> books = new HashMap();

        books.put("Nephi", "The Book of Mormon");
        books.put("Daniel", "The Old Testament");
        books.put("Mathew", "The New Testament");
        books.put("Baruch", "The Old Testament");
        books.put("Moses", "The Old Testament");

        System.out.println("Books of Scriptures " + books);

        System.out.println("The book of Moses is in " + books.get("Moses"));

        books.put("Moses", "The Pearl of Great Price");

        System.out.println("The book of Moses is in " + books.get("Moses"));

        books.remove("Baruch");

        System.out.println("Books of Scriptures " + books);

        System.out.println("Do we have a book from The Old Testament? " + ((books.containsValue("The Old Testament")) ? "Yes" : "No"));
        System.out.println("Do we have a book from The Doctrine and Covenants? " + ((books.containsValue("The Doctrine and Covenants")) ? "Yes" : "No"));

        System.out.println("Do we have words from Nephi? " + ((books.containsKey("Nephi")) ? "Yes" : "No"));
        System.out.println("Do we have words from Alma? " + ((books.containsKey("Alma")) ? "Yes" : "No"));
    }

    public static void collectFruits() {

        HashSet<String> fruits = new HashSet();

        fruits.add("Apple");
        fruits.add("Pear");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Lime");

        System.out.println("The Fruit Bowl has " + fruits.size() + " fruits: " + fruits);

        fruits.add("Lime");
        fruits.add("Pear");

        System.out.println("The Fruit Bowl has " + fruits.size() + " fruits: " + fruits);

        fruits.remove("Lime");

        System.out.println("The fruit bowl has " + fruits.size() + " fruits: " + fruits);

        System.out.println("Does our fruit bowl have Apples? " + ((fruits.contains("Apple")) ? "Yes" : "No"));
        System.out.println("Does our fruie bowl have Limes? " + ((fruits.contains("Lime")) ? "Yes" : "No"));

    }

    private static void crazyCountdown() {

        TreeSet<Integer> countdown = new TreeSet<Integer>();

        countdown.add(1);
        countdown.add(15);
        countdown.add(9);
        countdown.add(20);
        countdown.add(18);
        countdown.add(15);
        countdown.add(5);
        countdown.add(3);
        countdown.add(11);
        countdown.add(3);

        countdown.remove(18);

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
