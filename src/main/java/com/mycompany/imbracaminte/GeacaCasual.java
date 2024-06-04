/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imbracaminte;

/**
 *
 * @author coman
 */
public class GeacaCasual extends Imbracaminte {
  boolean gluga; 
  String incheiereGeaca;    
public GeacaCasual(){
     
}  

public GeacaCasual(String material, String brand, String culoare, double pret, String gen,boolean gluga, String incheiereGeaca){
   super( material,brand,culoare,pret,gen);
    this.gluga=gluga;
    this.incheiereGeaca=incheiereGeaca;
    }
public GeacaCasual(GeacaCasual GC){
super (GC);
this.gluga=GC.gluga;
this.incheiereGeaca=GC.incheiereGeaca;
}
@Override
public String toString(){
    return super.toString()+"\n Gluga: "+gluga+"\n incheiereGeaca: "+incheiereGeaca;
   }

    public boolean isGluga() {
        return gluga;
    }

    public void setGluga(boolean gluga) {
        this.gluga = gluga;
    }

    public boolean verifConditieGC(String gen8Input, String PretMin8Input, String PretMax8Input, String incheiereGeacaInput){
       boolean genCondition = gen.equals(gen8Input) || gen8Input.isEmpty();
       boolean minPriceCondition = interval8Pret((int) pret, PretMin8Input, PretMax8Input) || PretMin8Input.isEmpty();
       boolean incheiereGeacaCondition = incheiereGeaca.contains(incheiereGeacaInput) || incheiereGeacaInput.isEmpty();
        
           return genCondition && minPriceCondition && incheiereGeacaCondition;
   }
   private boolean interval8Pret(int value, String minValue, String maxValue) {
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
