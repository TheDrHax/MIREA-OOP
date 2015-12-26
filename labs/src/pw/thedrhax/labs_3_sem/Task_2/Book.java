package pw.thedrhax.labs_3_sem.Task_2;

import pw.thedrhax.labs_3_sem.Task_1_2.Author;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    public Book (String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        setPrice(price);
        setQtyInStock(qtyInStock);
    }
    public Book (String name, Author author, double price) {
        this(name, author, price, 0);
    }

    public String getName() {return name;}
    public Author getAuthor() {return author;}
    public double getPrice() {return price;}
    public int getQtyInStock() {return qtyInStock;}

    public void setPrice(double price) {this.price = price;}
    public void setQtyInStock(int qtyInStock) {this.qtyInStock = qtyInStock;}

    @Override
    public String toString() {
        return getName() + " // " + author;
    }
}
