/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imbracaminte;

/**
 *
 * @author coman
 */
public class PantofCasual extends Imbracaminte{
    int marime;
    String tipTalpa;
    

    public PantofCasual() {
        marime = 0;
        tipTalpa="nespecificat";
    }

    public PantofCasual(String material, String brand, String culoare, double pret,String gen,int marime,String tipTalpa) {
        super(material, brand, culoare, pret, gen);
        this.tipTalpa=tipTalpa;
        this.marime= marime;
    }
    public PantofCasual(PantofCasual P){   //constr de copiere
        super(P);
        this.marime=P.marime;
        this.tipTalpa=P.tipTalpa;
    }
     @Override
     public String toString(){
         return super.toString()+"\n marime: "+marime+"\n tipTalpa: "+tipTalpa;
     }

    public int getMarime() {
        return marime;
    }

    public void setMarime(int marime) {
        this.marime = marime;
    }
  
   public boolean verifConditiePC(String brandInput, String minPriceInput, String maxPriceInput, String sizeInput){
       boolean brandCondition = brand.equals(brandInput) || brandInput.isEmpty();
       boolean minPriceCondition = intervalPret((int) pret, minPriceInput, maxPriceInput) || minPriceInput.isEmpty();
       boolean sizeCondition = String.valueOf(marime).equals(sizeInput) || sizeInput.isEmpty();
        
           return brandCondition && minPriceCondition && sizeCondition;
   }
   private boolean intervalPret(int value, String minValue, String maxValue) {
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
