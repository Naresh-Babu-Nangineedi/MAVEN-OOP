package com.epam.OOP;

public class JellyBeans extends Sweets{
    //inheritance
    String name;
    String type;
    int cost;
    int weight;
    JellyBeans(String name,String type,int cost,int weigth){
        super(name,type,cost,weigth);
    }
}