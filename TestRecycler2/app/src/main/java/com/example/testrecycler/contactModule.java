package com.example.testrecycler;

public class contactModule {
    int img;
    String name , number;

    public contactModule(int img , String name, String number){
        this.img=img;
        this.name = name;
        this.number= number;
    }

    public contactModule(String Cname, String Cnumber){
        this.name=Cname;
        this.number=Cnumber;
    }
}
