package com.jinsoft.tangdianxuanapp;

public class Food {

    private String description;
    private int price;
    private String title;
    private int thumbnail;


    public Food(String description, int price, String title, int thumbnail) {
        this.description = description;
        this.price = price;
        this.title = title;
        this.thumbnail = thumbnail;
    }

    public Food(){}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
