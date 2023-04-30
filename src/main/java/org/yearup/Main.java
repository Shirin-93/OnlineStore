package org.yearup;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        HashMap<String, OnlineStoreApp> store = loaditems();
        //loop through all items;
        for(OnlineStoreApp item: store.values())
        {
            System.out.println(item.getName());
        }
    }
    public static HashMap<String, OnlineStoreApp>loaditems()
    {
        //creating the array (container)
        HashMap<String, OnlineStoreApp>store = new HashMap<>();
        // load the array;
        //FileInputStream;
        Scanner fileScanner =null;
        try
        {
            FileInputStream stream = new FileInputStream("OnlineStoreData/inventory.csv");
            BufferedInputStream products = new BufferedInputStream(stream);
            fileScanner = new Scanner(stream);
            fileScanner.nextLine();
            while(fileScanner.hasNext())
            {
                String line = fileScanner.nextLine();
                String inventory = new String(new StringBuffer);
                System.out.println(inventory);
            }

        }
        catch (FileNotFoundException e)
        {
            System.out.println("There was an error loading the file");
        }
        finally {
            // close the stream
            if (fileScanner != null) {
                fileScanner.close();
            }
        }
            return store;
    }
    public static void finditem(ArrayList<OnlineStoreApp> store, String name)
    {

    }
}
