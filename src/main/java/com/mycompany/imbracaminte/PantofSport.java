/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imbracaminte;

/**
 *
 * @author coman
 */
public class PantofSport extends PantofCasual {
    String activitate;
    
    public PantofSport() {
        activitate="nespecificat";
    }

    public PantofSport(String material, String brand, String culoare, double pret,String gen,int marime,String tipTalpa,String activitate) {
        super(material, brand, culoare, pret,gen,marime,tipTalpa);
        this.activitate=activitate;
    }
    public PantofSport(PantofSport P){   //constr de copiere
        super(P);
        this.activitate=P.activitate;
    }
    @Override
    public String toString(){
        return super.toString()+"\n activitate: "+activitate;
        
    }
    
    public boolean verifConditiePS(String brandInput, String minPriceInput, String maxPriceInput, String sizeInput, String activityInput){
       boolean brandCondition = brand.equals(brandInput) || brandInput.isEmpty();
       boolean minPriceCondition = interval2Pret((int) pret, minPriceInput, maxPriceInput) || minPriceInput.isEmpty();
       boolean sizeCondition = String.valueOf(marime).equals(sizeInput) || sizeInput.isEmpty();
       boolean activityCondition=activitate.startsWith(activityInput) || activityInput.isEmpty();
        
           return brandCondition && minPriceCondition && sizeCondition && activityCondition;
   }
   private boolean interval2Pret(int value, String minValue, String maxValue) {
        try {
            if (!minValue.isEmpty() && Integer.parseInt(minValue) > value) {
                return false;
            }
            if (!maxValue.isEmpty() && Integer.parseInt(maxValue) < value) {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
    

