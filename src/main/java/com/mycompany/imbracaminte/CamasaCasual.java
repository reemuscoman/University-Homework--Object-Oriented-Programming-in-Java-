/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imbracaminte;

/**
 *
 * @author coman
 */
public class CamasaCasual extends Imbracaminte{
    int marime;
    String guler;
    
//constructorul implicit inițializează atributele la valorile implicite
    public CamasaCasual() {
        marime = 0;
        guler="nespecificat";
    }
//constructor cu parametrii
    public CamasaCasual(String material, String brand, String culoare, double pret,String gen,int marime,String guler) {
        super(material, brand, culoare, pret, gen);
        this.marime=marime;
        this.guler=guler;
    }
    public CamasaCasual(CamasaCasual CC){   //constr de copiere
        super(CC);
        this.marime=CC.marime;
        this.guler=CC.guler;
    }
     //metoda toString() returneaza reprezentarea String a obiectului
     @Override
     public String toString(){
         return super.toString()+"\n marime: "+marime+"\n guler: "+guler;
     }
    
     public boolean verifConditieCC(String brandInput,  String sizeInput , String collarInput){

       boolean brandCondition = brand.equals(brandInput)  ||brandInput.isEmpty();
        boolean sizeCondition = String.valueOf(marime).equals(sizeInput) || sizeInput.isEmpty();
       boolean collarCondition=guler.startsWith(collarInput)  || collarInput.isEmpty();

           return brandCondition  && sizeCondition && collarCondition;
   }
    

    
}
