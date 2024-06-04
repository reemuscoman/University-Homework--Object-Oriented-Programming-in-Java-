/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imbracaminte;

/**
 *
 * @author coman
 */
public class PantaloniSport extends PantaloniCasual {
    String tipSport;

    public PantaloniSport(String imitatie_de_piele, String adidas, String rosu, double par, String masculin, int par1, String material_sintetic_pt_mers_pe_teren_accide, String alergat_) {
        tipSport = "nespecificat";
    }
    public PantaloniSport(String material, String brand, String culoare, double pret, String gen, int nrBuzunare, String stil, boolean prohab,String tipSport) {
        super(material, brand, culoare, pret, gen,nrBuzunare,stil,prohab);
        this.tipSport = tipSport;
    }

    public PantaloniSport(PantaloniSport Ps) {   
        super( Ps); 
        this.tipSport = Ps.tipSport;
    }
    @Override
    public String toString() {
        return super.toString() + "\n tipsport: " + tipSport+"\n";
    }
    
    public boolean verifConditiePantS(String brandInput,String materialInput,String colorInput){
       boolean brandCondition = brand.equals(brandInput) || brandInput.isEmpty();
       boolean materialCondition = material.equals(materialInput) || materialInput.isEmpty();
       boolean colorCondition = culoare.equals(colorInput) || colorInput.isEmpty();
       
        
           return brandCondition && materialCondition && colorCondition;
   }
}
