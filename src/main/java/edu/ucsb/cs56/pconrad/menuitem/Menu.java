package edu.ucsb.cs56.pconrad.menuitem;
import java.util.ArrayList;

import java.util.Comparator;

public class Menu {

    private ArrayList<MenuItem> menuitems;
    public static String nl = System.lineSeparator();
    
    public Menu() {
        // stub
    }

    public void add(MenuItem mi) {
        // stub
    }

    /**
     * Return pointer to a given menu item
     * @param name MenuItem being looked up
     * @return reference to MenuItem or null if not found
     */
    public MenuItem lookup(String name) {
        return null; // stub
    }

    /**
     * Return a string consisting of each menu item
     * in the list, in the current order, separated
     * by the System.lineSeparator() character 
     * @return resulting string.  Empty list should return ""
     */
    public String csv() {
        String result = "";
        // stub
        return result;
    }

    public void sortByName() {
        // stub
    }

    public void sortByCategoryThenName() {
        // stub
    }

    /** 
     * Put items in categories first, where the categories are in 
     * lexicographic order.  Then sort in order of descending price,
     * with most expensive items first, and least expensive items last.
     * Break ties of items within a category that have the same price
     * by putting them in lexicographic order.
     */
    public void sortByCategoryThenPriceDescendingThenByName() {
        // stub
    }
}
