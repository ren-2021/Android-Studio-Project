package com.example.del.techclass.Data;

/**
 * Created by Del on 1/14/2017.
 */

public class MyClass {

    String name;
    String sidename;
    int image;

    public int getImage() {
        return image;
    }

    public String getParagraph(){
        return sidename;
    }

    public String getName() {
        return name;
    }

    public MyClass(String name, String sidename, int image){
        this.name = name;
        this.image = image;
        this.sidename = sidename;
    }
}
