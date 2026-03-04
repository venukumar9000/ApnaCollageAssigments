package org.example.comparablecomparator;

public class Flight {
    private String depature;
    private String name;
    private float price;
    private String time;

    public Flight(String depature, String name, float price, String time) {
        this.depature = depature;
        this.name = name;
        this.price = price;
        this.time = time;
    }

    public Flight() {
    }

    public String getDepature() {
        return depature;
    }

    public void setDepature(String depature) {
        this.depature = depature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
