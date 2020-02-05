package com.epam.OOP;
public class Chocolates extends Sweets{
    //inheritance
    String name;
    String type;
    int cost;
    int weight;
    Chocolates(String name,String type,int cost,int weight){
        super(name,type,cost,weight);
    }
}