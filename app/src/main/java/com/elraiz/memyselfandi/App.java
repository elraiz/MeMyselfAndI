package com.elraiz.memyselfandi;

//NIM : 10117163
//Nama : Muhamad El Raiz
//Kelas : IF5

//15 Mei 2020 pembuatan class app untuk menampung format friend list pada acitivity daily

public class App {

    int image;
    String name;

    public App(int image, String name) {
        this.image = image;
        this.name = name;
    }


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
