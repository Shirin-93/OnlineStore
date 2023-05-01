package org.yearup;

public class Products
{
    private int id;
    private String name;
    private double price;


    public Products(int id, String name, double price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    //getter & setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //method;
    public void displayHomeScreen()
    {
        System.out.println("ID:" + this.id);
        System.out.println("Name:"+ this.name);
        System.out.println("Price"+ this.price);
    }
}
