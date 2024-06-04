/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imbracaminte;

/**
 *
 * @author coman
 */
public class GeacaSport extends GeacaCasual {
int rezistentaApa;
String tipSport;
  public GeacaSport(){
     
    }
  public GeacaSport(String material, String brand, String culoare, double pret,String gen, boolean gluga,String incheiereGeaca,int rezistentaApa,String tipSport){
      super(material, brand, culoare,pret,gen,gluga,incheiereGeaca );
      this.rezistentaApa=rezistentaApa;
      this.tipSport=tipSport;
  }
  public GeacaSport(GeacaSport GS){
      super(GS);
      this.rezistentaApa=GS.rezistentaApa;
      this.tipSport=GS.tipSport;
  }
  @Override
public String toString(){
    return super.toString()+"\n RezistentaApa: "+rezistentaApa+"\n Tip de sport: "+tipSport;
   }

    public int getRezistentaApa() {
        return rezistentaApa;
    }

    public void setRezistentaApa(int rezistentaApa) {
        this.rezistentaApa = rezistentaApa;
    }
     
    public boolean conditieGS(String Material, String Culoare, String TipSport){    
        boolean verificaMaterial=material.equals(Material) || Material.isEmpty();     
        boolean verificaCuloare=culoare.equals(Culoare) || Culoare.isEmpty();     
        boolean verificaTipSport=tipSport.contains(TipSport) || TipSport.isEmpty();      
        return verificaMaterial && verificaCuloare && verificaTipSport;  }


}
