/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imbracaminte;

/**
 *
 * @author coman
 */
public class Ochelari extends Imbracaminte {
   String material_rama;
   String tip;
   String culoare_lentila;
   int marime;
   
   public Ochelari(){
       material_rama="nespecificat";
       tip="nespecificat";
       culoare_lentila="nespecificata";
       marime=0;
    }
   
    public Ochelari(  String material, String brand, String culoare, double pret, String gen,String material_rama, String tip, String culoare_lentila, int marime){
        super(material, brand, culoare, pret, gen);
        this.material_rama=material_rama;
        this.tip=tip;
        this.culoare_lentila=culoare_lentila;
        this.marime=marime;
    }
   
    public Ochelari(Ochelari Och){
        super(Och);
        this.material_rama = Och.material_rama;
        this.tip = Och.tip;
        this.culoare_lentila = Och.culoare_lentila;
        this.marime = Och.marime;
    }
   
   @Override
   public String toString(){
       return super.toString()+"\n Material rama: "+material_rama+"\n Tip: "+tip+"\n Culoare lentila: "+culoare_lentila+"\n Marime: "+marime;
    }

    public String getMaterial_rama() {
        return material_rama;
    }

    public void setMaterial_rama(String material_rama) {
        this.material_rama = material_rama;
    }
    
    public boolean verifConditieOchelari(String tipInput,String materialRamaInput,String colorInput){
       boolean tipCondition = tip.contains(tipInput) || tipInput.isEmpty();
       boolean materialRamaCondition = material_rama.contains(materialRamaInput) || materialRamaInput.isEmpty();
       boolean colorCondition = culoare.equals(colorInput) || colorInput.isEmpty();
       
        
           return tipCondition && materialRamaCondition && colorCondition;
    }
}

  /*@Override
    public void setGen(String gen) {
        this.gen = gen;
    }
   @Override
    public String getGen() {
        return gen;
    }*/
   
   


