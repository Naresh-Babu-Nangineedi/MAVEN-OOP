package com.epam.OOP;

public class Candy extends Sweets{
    //inheritance
    String name;
    String type;
    int cost;
    int weight;
    Candy(String name,String type,int cost,int weigth){
        super(name,type,cost,weigth);
    }
}
