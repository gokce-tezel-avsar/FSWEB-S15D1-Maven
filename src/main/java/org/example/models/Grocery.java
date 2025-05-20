package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Grocery {
    public static ArrayList<String> groceryList = new ArrayList<>();

    public void startGrocery(){

    }

    public static boolean addItems(String input){
        return groceryList.add(input);
    }

    public static boolean removeItems(String input){
        return groceryList.remove(input);
    }
    public static boolean checkItemIsInList(String product){
      return groceryList.contains(product);
    }
    public static void printSorted(){
       Collections.sort(groceryList);
        System.out.println(groceryList);
    }

}
