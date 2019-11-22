package com.nix;

public class Director {

    public void constructExpulsion(Builder builder) {
        builder.setBody(new Body("This is expulsion document"));
        builder.setFooter(new Footer());
        builder.setHeader(new Header());
    }

    public void constructMilitary(Builder builder){
        builder.setHeader(new Header());
        builder.setFooter(new Footer());
        builder.setBody(new Body("You are going to military"));
    }
}
