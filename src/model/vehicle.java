package model;

public class vehicle {
    String name;
    Integer cc;
    Integer price;

    public vehicle(String name, Integer cc, Integer price) {
        this.name = name;
        this.cc = cc;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCc() {
        return cc;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
