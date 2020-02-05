package com.epam.OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
     
     // List of objects of the sweet class 
        List<Sweets> gift = new ArrayList<>();
        //Runtime polymorphism
        gift.add(new Chocolates("Ferrero Rocher","100%", 4,15));
        gift.add(new Chocolates("Patachi","100%", 2,10));
        gift.add(new Candy("Snickers","50%", 7,10));
        gift.add(new Candy("Twix","10%", 5,20));
        gift.add(new JellyBeans("Green Apple","45%",4,3));
        gift.add(new Candy("Coconut","60%",2,5));
        gift.add(new Candy("Lemon Lime","92%",5,7));
        gift.add(new Candy("PineApple","72%",5,3));
        List<Sweets> chocolate=new ArrayList<>();
        for(int i=0;i<gift.size();i++){
            if(gift.get(i) instanceof Chocolates){
                chocolate.add(gift.get(i));
            }
        }
        //sorting based on the weights of Chocolates
        System.out.println("Chocolates sorted by their weights");
        Collections.sort(chocolate,new Sortbyweigth());
        for(int i=0;i<chocolate.size();i++){
            chocolate.get(i);
			System.out.println(chocolate.get(i).name+" choco% is "+chocolate.get(i).type+" cost is "+chocolate.get(i).cost+" weight of chocolate is "+Sweets.weigth+"gms");
        }
        //sorting based on the cost of chocolates
        System.out.println();
        System.out.println("Chocolates sorted by their cost");
        Collections.sort(chocolate,new Sortbycost());
        for(int i=0;i<chocolate.size();i++){
        	System.out.println(chocolate.get(i).name+" choco% is "+chocolate.get(i).type+" cost is "+chocolate.get(i).cost+" weight of chocolate is "+chocolate.get(i).weight+"gms");
        }
        //sorting based on the type of content
        System.out.println();
        Collections.sort(chocolate,new Sortbytype());
        System.out.println("Chocolates sorted by their content %");
        for(int i=0;i<chocolate.size();i++){
        	System.out.println(chocolate.get(i).name+" choco% is "+chocolate.get(i).type+" cost is "+chocolate.get(i).cost+" weigth of chocolate is "+chocolate.get(i).weight+"gms");
        }
        // calculating the total weight
        int net_weight=0;
        for(int i=0;i<gift.size();i++){
            net_weight+=gift.get(i).weight;
        }
        System.out.println();
        System.out.println("Total weight of gift "+net_weight+"gm");
        //Calculating total no of candy
        int count_candies=0;
        for(int i=0;i<gift.size();i++){
            if(gift.get(i) instanceof Candy){
                count_candies++;
            }
        }
        System.out.println();
        System.out.println("No of Candies is "+count_candies);
        //candies between range of the cost in between 2 to 5
        System.out.println("");
        System.out.println("candies between range of the cost in between 2 to 5\n");
        for(int i=0;i<gift.size();i++){
            if(gift.get(i) instanceof Candy){
                if(gift.get(i).cost<=5 && gift.get(i).cost>=2) {
                	gift.get(i);
					System.out.println(gift.get(i).name+" Sugar% is "+gift.get(i).type+" cost is "+gift.get(i).cost+" weight of Candy is "+Sweets.weigth+"gms");
                }
            }
        }
      //candies between range of the cost in between 2 to 5
        System.out.println("");
        System.out.println("candies between range of the weigth in between 2 to 9\n");
        for(int i=0;i<gift.size();i++){
            if(gift.get(i) instanceof Candy){
                if(gift.get(i).weight <=5 && gift.get(i).weight>=2) {
                	System.out.println(gift.get(i).name+" Sugar% is "+gift.get(i).type+" cost is "+gift.get(i).cost+" weight of Candy is "+gift.get(i).weight+"gms");
                }
            }
        }
        
    }
}