/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imbracaminte;

/**
 *
 * @author coman
 */
public class Ceas extends Imbracaminte {
    String material_curea;
    String functionalitate_practica;
    //String material_rama;
   // String tip;

    public Ceas(){
           material_curea="nespecificat";
           functionalitate_practica="nespecificata";
    }

    public Ceas( String material, String brand, String culoare, double pret, String gen,String material_rama, String tip,String material_curea,  String functionalitate_practica){
        super(material, brand, culoare, pret, gen) ;
       // this.material_rama=material_rama;
        //this.tip=tip;
        this.material_curea=material_curea;
        this.functionalitate_practica=functionalitate_practica;
    }

    public Ceas(Ceas C){
        super(C);  
        this.material_curea = C.material_curea;
        this.functionalitate_practica = C.functionalitate_practica;
        //this.material_rama=C.material_rama;
       // this.tip=C.tip;
    }
    @Override
    public String toString(){
         return super.toString()+"\n Material curea: "+material_curea+"\n Functionalitate practica: "+functionalitate_practica;//+"\n Material rama: "+material_rama+"\n Tip: "+tip;
    }  

    public String getMaterial_curea() {
        return material_curea;
    }

    public void setMaterial_curea(String material_curea) {
        this.material_curea = material_curea;
    }
    
    public boolean verifConditieCeas(String brandInput, String minPriceInput, String maxPriceInput, String materialCureaInput){
       boolean brandCondition = brand.equals(brandInput) || brandInput.isEmpty();
       boolean minPriceCondition = interval3Pret((int) pret, minPriceInput, maxPriceInput) || minPriceInput.isEmpty();
       boolean materialCureaCondition = String.valueOf(material_curea).equals(materialCureaInput) || materialCureaInput.isEmpty();
        
           return brandCondition && minPriceCondition && materialCureaCondition;
   }
   private boolean interval3Pret(int value, String minValue, String maxValue) {
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
    
