package com.dayday.cook.beans;

public class Item{
        public int cataloId;
        public String name;
        public String imageUrl;

    @Override
    public String toString() {
        return "Item{" +
                "cataloId=" + cataloId +
                ", name='" + name + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}