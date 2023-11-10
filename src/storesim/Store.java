package storesim;

import java.util.ArrayList;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    this.name = name;
    this.itemList = new ArrayList<Item>();
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings; 
  } 
  public void sellItem(int index){
    System.out.println("-----------------------------------------------------");
    if (itemList.size() > index) {
      earnings = itemList.get(index).getCost() + this.earnings;
      System.out.println(this.name + " has sold " + itemList.get(index).getName() + " for " + itemList.get(index).getCost());
    }
    else {
      System.out.println("Sorry, " + this.name + " doesn't sell that item!");
    } 
  }
  public void sellItem(String name){
    System.out.println("-----------------------------------------------------");
    boolean itemInList = false; 
      for(int i = 0; i < itemList.size(); i++){
          if (name.equals(itemList.get(i).getName())){
              earnings = itemList.get(i).getCost() + this.earnings;
              itemInList = true;
              System.out.println(this.name + " has sold " + itemList.get(i).getName() + " for " + itemList.get(i).getCost());
          } 
      }
      if (itemInList == false){
        System.out.println("Sorry, " + this.name + " doesn't sell that item!");
      }
  }
  public void sellItem(Item i){
      System.out.println("-----------------------------------------------------");
      if (itemList.contains(i) ){
          earnings = i.getCost() + this.earnings;
          System.out.println(this.name + " has sold " + i.getName() + " for " + i.getCost());      
      }
      else {
        System.out.println("Sorry, " + this.name + " doesn't sell that item!");
      } 
   }
  public void addItem(Item i){
    itemList.add(i);
  }
  public void filterType(String type){
      System.out.println("-----------------------------------------------------");
      System.out.println(type + " items: ");
      for(int i = 0; i < itemList.size(); i++){
          if(type.equals(itemList.get(i).getType())){
              System.out.println(itemList.get(i).getName());
          }
      }
  } 
  public void filterCheap(double maxCost){
      System.out.println("-----------------------------------------------------");     
      System.out.println("Items below " + maxCost + ": ");
      for(int i = 0; i < itemList.size(); i++){
          if(itemList.get(i).getCost() < maxCost){
              System.out.println(itemList.get(i).getName());
          }
      } 
  } 
  public void filterExpensive(double minCost){
      System.out.println("-----------------------------------------------------");
      System.out.println("Items greater than " + minCost + ": ");
      for(int i = 0; i < itemList.size(); i++){
          if(itemList.get(i).getCost() >= minCost){
              System.out.println(itemList.get(i).getName());
          }
      } 
  } 
  public static void printStats(){
      System.out.println("-----------------------------------------------------");
      for(int i = 0; i < storeList.size(); i++){
          System.out.println(storeList.get(i).getName() + " has earned " + storeList.get(i).getEarnings()); 
      }
    }
  } 
