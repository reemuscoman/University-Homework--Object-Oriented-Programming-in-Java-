/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imbracaminte;


import java.util.Vector;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Serializable;



/**
 *
 * @author coman
 */
public class ImbrTest extends Imbracaminte  {
    public static void main(String[] args) {
        //INSTANTE
        //PANTOFI
        PantofCasual pantof1=new PantofCasual("piele intoarsa","Nike","alb",1199.99,"masculin",41,"material sintetic");
        System.out.println(pantof1+"\n");
        PantofCasual pantof2=new PantofCasual("piele sintetica","Puma","alb,rosu",249.99,"feminin",37,"material sintetic");
        System.out.println(pantof2+"\n");
        PantofCasual pantof3=new PantofCasual("piele","Pull&Bear","crem",179.99,"feminin",37,"material sintetic");
        System.out.println(pantof3+"\n");
        PantofSport pantof4=new PantofSport("imitatie de piele","Adidas","rosu",599.99,"masculin",41,"material sintetic pt. mers pe teren accidentat","alergat");
        System.out.println(pantof4+"\n");
        PantofSport pantof5=new PantofSport("piele sintetica","Jordan","albastru,alb,negru",899.99,"masculin",43,"sala de sport, teren profesional","baschet");
        System.out.println (pantof5+"\n");
        PantofSport pantof6=new PantofSport("piele sintetica","Adidas","negru",1199.99,"masculin",43,"cu crampon pentru teren de iarba","fotbal");
        System.out.println(pantof6+"\n");
        //CEAS
        Ceas C1 = new Ceas("Piele","Casio","Navy Blue",500,"Barbati","Titan","Clasic","Piele","Rezistent la apa");
        System.out.println(C1+"\n");
        //OCHELARI
        Ochelari O1= new Ochelari("Metal","Lensa","Auriu",500,"Barbati","Metal","De soare","Negru",50);
        System.out.println(O1+"\n");
        //CAMASI
        CamasaCasual camasa1=new CamasaCasual("blug","H&M","albastra",99.99,"feminin",101,"mic");
        System.out.println(camasa1+"\n");
        //String material, String brand, String culoare, double pret,String gen,int marime,String guler,String activitate,String protectie_uv
        CamasaSport camasa2=new CamasaSport("anti uv","Under Armour","neagra",200,"feminin",101,"fara guler","alergat in soare",45);
        System.out.println(camasa2+"\n");
        CamasaCasual camasa3=new CamasaCasual("matase","Pepco","gri",74.99,"masculin",121,"mare");
        System.out.println(camasa3+"\n");
        CamasaSport camasa4=new CamasaSport("anti uv","Nike","rosie",219.99,"feminin",111,"mic","alergat in soare",42);
        System.out.println(camasa4+"\n");
        CamasaCasual camasa5=new CamasaCasual("bumbac","Careffour","verde",109.99,"masculin",131,"mic");
        System.out.println(camasa5+"\n");
        CamasaSport camasa6=new CamasaSport("anti uv","Adidas","turcoaz",249.99,"masculin",151,"mare","alergat in soare",50);
        System.out.println(camasa6+"\n");
        //GECI
        GeacaSport geacaSport1 = new GeacaSport("Poliamida" ,"Nike"  ,"Rosu" ,300.0 ,"masculin",true,"nasturi" ,99 ,"Ski");
        GeacaSport geacaSport2 = new GeacaSport("Poliester" ,"Balenciaga", "Galben" ,399.99 ,"masculin",true,"fermoar",90,"Patinaj");
        GeacaSport geacaSport3 = new GeacaSport("Poliester" ,"Adidas", "Albastru", 119.99 ,"feminin",true,"fermoar", 80, "Snowboard");
        System.out.println(geacaSport1+"\n");
        System.out.println(geacaSport2+"\n");
        System.out.println(geacaSport3+"\n");
        GeacaCasual geacaCasual1 = new GeacaCasual("Bumbac" ,"Zara" ,"Negru", 80.0 ,"masculin" ,true, "Fermoar");
        GeacaCasual geacaCasual2 = new GeacaCasual("Fas" ,"Friday" ,"Bleumarin",149.99,"masculin ",false,"Dubla cu fermoar");
        GeacaCasual geacaCasual3 = new GeacaCasual("Poliester" ,"H&M", "Verde", 70.0, "feminin", false, "Butoane");
        System.out.println(geacaCasual1+"\n");
        System.out.println(geacaCasual2+"\n");
        System.out.println(geacaCasual3+"\n");
        //PANTALONI
        PantaloniCasual pantalon1 = new PantaloniCasual("material1", "Nike", "verde", 19.99, "Masculin", 2, "casual",true);
        System.out.println(pantalon1 + "\n");
        PantaloniCasual pantalon2 = new PantaloniCasual("CANEPA", "Puma", "galben", 24.99, "Feminin", 1, "casual",false);
        System.out.println(pantalon2 + "\n");
        PantaloniCasual pantalon3 = new PantaloniCasual("ALPACA", "Fila", "mov", 179.99, "Feminin", 3, "material6",true);
        System.out.println(pantalon3 + "\n");
        PantaloniSport pantalon4 = new PantaloniSport("ACRIL", "adidas", "maro", 249.99, "Masculin", 4, "sport",false,"sky\n");
        System.out.println(pantalon4 + "\n");
        PantaloniSport pantalon5 = new PantaloniSport("MODAL ", "Nike", "rosu", 49.99, "Feminin", 1, "sport",false,"tenis");
        System.out.println(pantalon5+ "\n");
        PantaloniSport pantalon6= new PantaloniSport("bumbac ", "Nike", "albastru", 459.99, "Masculin", 2, "sportm",true,"tenis");
        System.out.println(pantalon6+ "\n");
        
        
        
        //VECTOR
        /*PantofCasual[] vectPc={pantof1,pantof2,pantof3};
        for(int i=0;i<vectPc.length;i++){
            System.out.println(vectPc[i]);
        }*/
        
        Vector<PantofCasual> pc =  new Vector<>();
        pc.add(new PantofCasual("piele intoarsa","Nike","alb",1199.99,"masculin",41,"material sintetic \n \n"));
        pc.add(new PantofCasual("piele sintetica","Puma","alb,rosu",249.99,"feminin",37,"material sintetic\n \n"));
        pc.add(new PantofCasual("piele intoarsa","Vans","negru,alb",279.99,"feminin",37,"material sintetic\n \n"));
        pc.add(new PantofCasual("piele","Reebook","crem",179.99,"masculin",42,"material sintetic\n \n"));        
        pc.add(new PantofCasual("piele sintetica","Pull&Bear","alb",139.99,"feminin",38,"material sintetic\n \n"));
        pc.add(new PantofCasual("piele sintetica","New Balance","albastru,alb",329.99,"masculin",42,"material sintetic\n \n"));       
        pc.add(new PantofCasual("piele, piele sintetica","Adidas","negru,alb",679.99,"masculin",37,"material sintetic\n \n"));        
        pc.add(new PantofCasual("piele","Converse","negru, alb",389.99,"feminin",37,"material sintetic\n \n"));
        pc.add(new PantofCasual("piele","Alexander McQueen","alb,negru",1999.99,"masculin",41,"material sintetic\n \n"));
        pc.add(new PantofCasual("piele intoarsa","Nike","crem",359.99,"masculin",42,"material sintetic\n "));        
        System.out.println("Vector Pantofi Casual: \n"+pc);
        
        Vector<PantofSport> ps =  new Vector<>();
        ps.add(new PantofSport("imitatie de piele","Adidas","rosu",599.99,"masculin",41,"material sintetic pt. mers pe teren accidentat","alergat\n \n"));
        ps.add(new PantofSport("piele,piele sintetica","Adidas","negru",1499.99,"masculin",43,"cu crampon pentru teren de iarba","fotbal\n \n"));
        ps.add(new PantofSport("piele sintetica","Jordan","negru",1199.99,"masculin",43,"material sintetic pt. teren de sport","baschet\n \n"));
        ps.add(new PantofSport("piele sintetica","Nike","negru",879.99,"masculin",44,"cu crampon pentru teren de iarba","fotbal\n \n"));
        ps.add(new PantofSport("piele sintetica","Adidas","roz",339.99,"feminin",37,"material sintetic","alergat\n \n"));
        ps.add(new PantofSport("material textil","Adidas","negru",299.99,"masculin",43,"material sintetic pt. mers pe teren accidentat","alergat, drumetie\n \n"));
        ps.add(new PantofSport("piele sintetica, piele","Jordan","galben",899.99,"masculin",43,"material sintetic pt. teren de sport","baschet\n \n"));
        ps.add(new PantofSport("piele sintetica","Nike","negru, alb",259.99,"masculin",41,"material sintetic pt. teren de sport","alergat\n \n"));
        ps.add(new PantofSport("piele sintetica","Adidas","negru",1799.99,"masculin",44,"cu crampon pentru teren de iarba","fotbal\n \n"));
        ps.add(new PantofSport("piele sintetica","Pro Touch","negru",99.99,"masculin",43,"cu crampon pentru teren de iarba","fotbal\n "));
        System.out.println("Vector Pantofi Sport: \n"+ps); 
        
        Vector<Ceas> c =  new Vector<>();
        c.add(new Ceas("Piele","Casio","Navy Blue",500,"Barbati","Aluminiu","Clasic","aluminiu","Rezistent la apa \n \n"));
        c.add(new Ceas("Plastic","CK","Albastru",50,"Barbati","Metal","Sport","metal","Rezistent la apa\n \n"));
        c.add(new Ceas("Metal","LV","Negru",300,"Barbati","Titan","Clasic","piele","Rezistent la apa\n \n"));
        c.add(new Ceas("Lemn","Tommy","Rosu",10,"Barbati","Metal","Sport","piele","Rezistent la apa\n \n"));
        c.add(new Ceas("Cauciuc","Rolex","Alb",5000,"Barbati","Titan","Clasic","piele","Rezistent la apa\n \n"));
        c.add(new Ceas("Plastic","CK","Roz",100000,"Barbati","Titan","Clasic","piele","Rezistent la apa\n \n"));
        c.add(new Ceas("Piele","Tommy","Navy Blue",56800,"Sport","Titan","Clasic","piele","Rezistent la apa\n \n"));
        c.add(new Ceas("Metal","Casio","Negru",50021,"Barbati","Titan","Clasic","piele","Rezistent la apa\n \n"));
        c.add(new Ceas("Piele","LV","Gri",580,"Barbati","Metal","Clasic","piele","Rezistent la apa \n"));
        System.out.println("Vector Ceas: \n" +c);
      
         Vector<Ochelari> o =  new Vector<>();
         o.add(new Ochelari("Metal","Lensa","auriu",500,"Barbati","aluminiu","De soare","Negru",50));
         o.add(new Ochelari("Plastic","LV","negru",50,"Barbati","metal","De vedere","Gri",45));
         o.add(new Ochelari("Otel","CK","alb",20,"Barbati","metal","De soare","Alb",54));
         o.add(new Ochelari("Aluminiu","Puma","gri",970,"Barbati","titan","De vedere","Negru",56));
         o.add(new Ochelari("Bronz","Nike","auriu",65,"Barbati","metal","De soare","Negru",40));
         o.add(new Ochelari("Metal","Adidas","rosu",645,"Barbati","titan","De vedere","Alb",46));
         o.add(new Ochelari("Aluminiu","Lensa","verde",345,"Barbati","metal","De soare","Gri",39));
         o.add(new Ochelari("Metal","CK","roz",120,"Barbati","metal","De vedere","Negru",50));
         o.add(new Ochelari("Otel","LV","auriu",500,"Barbati","metal","De soare","Alb",56));
         
        System.out.println("Vector Ochelari: \n" );
        for (Ochelari ochelari : o) {  System.out.println(ochelari + "\n");}
        
        Vector<CamasaCasual> CC =  new Vector<>();
        CC.add(new CamasaCasual("blug","H&M","albastra",99.99,"feminin",108,"mic \n \n"));
        CC.add(new CamasaCasual("bumbac","Pull&Bear","rosu",129.99,"masculin",110,"mare \n \n"));
        CC.add(new CamasaCasual("matase","Nike","mov",179.99,"feminin",107,"mic \n \n"));
        CC.add(new CamasaCasual("matase","Under Armour","verde",169.99,"feminin",111,"mic \n \n"));
        CC.add(new CamasaCasual("blug","Adidas","albastra",199.99,"feminin",120,"mic \n \n"));
        CC.add(new CamasaCasual("blug","Intersport","mov",209.99,"feminin",101,"mare \n \n"));
        CC.add(new CamasaCasual("bumbac","H&M","albastra",99.99,"masculin",101,"mic \n \n"));
        CC.add(new CamasaCasual("matase","LeeCooper","verde",89.99,"feminin",100,"mare \n \n"));
        CC.add(new CamasaCasual("bumbac","H&M","rosu",79.99,"masculin",103,"mic \n \n"));
        CC.add(new CamasaCasual("blug","H&M","mov",149.99,"masculin",115,"mare \n"));
        System.out.println("Vector Camasa Casual: \n"+CC);
        
        Vector<CamasaSport> CS =  new Vector<>();
        CS.add(new CamasaSport("anti uv","Nike","rosie",109.99,"feminin",104,"fara guler","mers pe durate lungi in soare",40));
        CS.add(new CamasaSport("anti uv","Adidas","rosie",99.99,"masculin",121,"mare","alergat in soare",42));
        CS.add(new CamasaSport("anti uv","Under Armour","rosie",219.99,"feminin",99,"mic","mers pe durate lungi in soare",47));
        CS.add(new CamasaSport("anti uv","H&M","rosie",119.99,"masculin",103,"mic","alergat in soare",42));
        CS.add(new CamasaSport("anti uv","Pepco","rosie",149.99,"feminin",107,"fara guler","mers pe durate lungi in soare",55));
        CS.add(new CamasaSport("anti uv","Pull&Bear","rosie",109.99,"masculin",125,"fara guler","alergat in soare",38));
        CS.add(new CamasaSport("anti uv","Intersport","rosie",179.99,"feminin",100,"mare","mers pe durate scurte in soare",60));
        CS.add(new CamasaSport("anti uv","Nike","rosie",159.99,"feminin",136,"micr","alergat in soare",42));
        CS.add(new CamasaSport("anti uv","Adidas","rosie",159.99,"masculin",109,"fara guler","mers pe durate scurte in soare",49));
        CS.add(new CamasaSport("anti uv","Underarmour","rosie",129.99,"masculin",100,"mic","mers pe durate lungi in soare",40));
        System.out.println("Vector Camasa Sport: \n");
        for (CamasaSport camasasport : CS) {  System.out.println(camasasport + "\n");}
        
        Vector<GeacaSport> gs =  new Vector<>();
        gs.add(new GeacaSport("Poliamida" ,"Nike"  ,"Rosu" ,300.0 ,"masculin" ,true,"fermoar",99 ,"Ski\n \n"));
        gs.add(new GeacaSport("Poliester" ,"Balenciaga", "Galben" ,399.99 ,"masculin",true,"fermoar",90,"Patinaj\n \n"));
        gs.add(new GeacaSport("Poliester" ,"Adidas", "Albastru", 119.99 ,"feminin",true,"fermoar", 80, "Snowboard\n \n"));
        gs.add(new GeacaSport("Poliester","SOFTSHELL","Negru",400.99,"masculin",true,"fermoar",99,"Formula 1\n \n"));        
        gs.add(new GeacaSport("Nailon","STRIX","Galbena",196.00,"feminin",true,"fermoar",94,"Jogging\n \n"));
        gs.add(new GeacaSport("Poliester","Geographical Norway","Gri",99.99,"masculin",true,"fermoar",99,"Patinaj\n \n"));       
        gs.add(new GeacaSport("Poliamida","Alpinus","Verde",500.47,"masculin",true,"fermoar",99,"Ski\n \n"));        
        gs.add(new GeacaSport("Material izolant"," Fleece Polar","Rosu",124.99,"masculin",true,"fermoar",60,"Patinaj\n \n"));
        gs.add(new GeacaSport("Nailon","Geographical Norway","Negru",700.99,"feminin",true,"fermoar",95,"Alpinism\n \n"));
        gs.add(new GeacaSport("Poliester","Columbia","Verde miliatr",400.99,"masculin",true,"fermoar",99,"Snowboard\n "));        
        System.out.println("Vector Geaca Sport: \n"+gs+"\n");
        
        Vector<GeacaCasual> gc =  new Vector<>();
        gc.add(new GeacaCasual("Bumbac" ,"Zara" ,"Negru", 80.00 ,"masculin" ,true, "Fermoar\n \n"));
        gc.add(new GeacaCasual("Poliamida" ,"Friday" ,"Bleumarin",149.99,"masculin ",false,"Dubla cu fermoar\n \n"));
        gc.add(new GeacaCasual("Poliester" ,"H&M", "Verde", 70.00, "feminin", false, "Butoane\n \n"));
        gc.add(new GeacaCasual("Poliester" ," DStreet" ,"Negru", 440.00 ,"masculin" ,true, "Fermoar\n \n"));
        gc.add(new GeacaCasual("Polieste" ,"Dewberry" ,"Bleumarin", 290.90 ,"masculin" ,false, "Fermoar si butoane\n \n"));
        gc.add(new GeacaCasual("Polieste" ,"Bigotti" ,"Grena", 180.00 ,"feminin" ,true, "Fermoar\n \n"));
        gc.add(new GeacaCasual("Poliamida" ,"Zara" ,"Roz", 99.99 ,"feminin" ,true, "Dubla cu fermoar\n \n"));
        gc.add(new GeacaCasual("Poliester" ,"BE GOOD MIRACLE " ,"Albastru", 249.00 ,"masculin" ,true, "Fermoar\n \n"));
        gc.add(new GeacaCasual("Blana Ecologica" ,"Uramag" ,"Gri", 167.00 ,"feminin" ,false, "Butoane\n \n"));
        gc.add(new GeacaCasual("Bumbac" ,"Slimfit" ,"Albastru", 74.14 ,"masculin" ,false, "Fermoar\n "));
        System.out.println("Vector Geaca Casual: \n"+gc+"\n");
        
        Vector<PantaloniCasual> P = new Vector<>();
        P.add(new PantaloniCasual("material1", "Nike", "verde", 19.99, "masculin", 2, "casual",true));
        P.add(new PantaloniCasual("canepa", "Puma", "galben", 24.99, "feminin", 1, "casual",false));       
        P.add(new PantaloniCasual("alpaca", "Fila", "mov", 179.99, "feminin", 7, "bomber",true));       
        P.add(new PantaloniCasual("matase ", "adidas", "maro", 28.99, "masculin", 7, "casual slim",true));        
        P.add(new PantaloniCasual("bumbac", "Nike", "rosu", 34.99, "masculin", 4, "bomber slim",false));       
        P.add(new PantaloniCasual("canepa", "Puma", "galben", 15.99, "feminin", 9, "casual",false));
        P.add(new PantaloniCasual("in ", "Nike", "rosu", 149.99, "masculin", 1, "bomber slim",true));
        P.add(new PantaloniCasual("bumbac", "Rebook", "verde", 249.99, "masculin", 8, "casual slim",false));
        P.add(new PantaloniCasual("lana", "Nike", "rosu", 49.99, "meminin", 6, "casual ",true));
        P.add(new PantaloniCasual("bumbac", "Nike", "maro", 14.99, "masculin", 7, "casual slim",false));
        //System.out.println("Vector Pantaloni Casual: \n" + P);
        for (PantaloniCasual pantaloni : P) {  System.out.println(pantaloni + "\n");}

  
        Vector<PantaloniSport> Ps =  new Vector<>();
        Ps.add(new PantaloniSport("MODAL ", "Nike", "gri", 32.99, "Masculin", 1, "sport",false,"tenis \n \n"));
        Ps.add(new PantaloniSport("Bumbac ", "adidas", "rosu", 78.99, "Feminin", 2, "sport",true,"tenis \n \n"));
        Ps.add(new PantaloniSport("Bumbac", "Puma", "alb", 89.99, "Masculin", 3, "sport",false,"batminton \n \n"));
        Ps.add(new PantaloniSport("Polister", "Vans", "albastru", 100.99, "Feminin", 4, "sport",false,"formula 1 \n \n"));
        Ps.add(new PantaloniSport("MODAL ", "New Balance", "negru", 145.99, "Masculin", 3, "sport",true,"basball \n \n"));
        Ps.add(new PantaloniSport("polister ", "Converse", "galben", 140.99, "Feminin", 2, "sport",false,"handbal \n \n"));
        Ps.add(new PantaloniSport("MODAL ", "Nike", "rosu", 199.99, "Masculin", 2, " sport",true,"tenis \n \n"));
        Ps.add(new PantaloniSport("polister ", "Adidas", "rosu", 14.99, "Feminin", 2, "sport",false,"tenis \n \n"));
        Ps.add(new PantaloniSport("MODAL ", "Nike", "verde", 47.99, "Feminin", 2, "sport",true,"fotbal \n \n"));
        Ps.add(new PantaloniSport("Bumbac ", "Vers", "albastru", 99.99, "Masculin", 4, "sport ",false,"sky \n \n"));
        System.out.println("Vector Pantaloni Sport: \n"+Ps+"\n");   
        
        //CONDITIILE 
        System.out.println("CONDITIILE");
        
        System.out.println("Pantofi Casual cu pretul in intervalul 100-500 Lei: ");
        for(PantofCasual ptfC :pc){
            if(ptfC.getPret()>100 && ptfC.getPret()<500){
                 System.out.println(ptfC);
            }
        }
        
        System.out.println("Pantofi Sport brand Adidas si Jordan cu marimea mai mare de 40: ");
        for(PantofSport ptfS : ps){
            if(ptfS.getBrand().startsWith("Jordan")|| ptfS.getBrand().startsWith ("Adidas")&&ptfS.getMarime()>40){
                 System.out.println(ptfS);
            }
        }
  
        System.out.println("Geaci sportive cu materialul 'Poliester' si rezistenta la apa mai mare de 90%:");
        for (GeacaSport geacaSport : gs) {
            if (geacaSport.getMaterial().startsWith("Poliester") && geacaSport.getRezistentaApa() > 90) {
                System.out.println(geacaSport);
            }
        }
        System.out.println("Geaci casual cu culoarea neagra si cu gluga:");
        for (GeacaCasual geacaCasual : gc) {
            if (geacaCasual.isGluga() && geacaCasual.getCuloare().startsWith("Negru")) {
                System.out.println(geacaCasual);
            }
        }
        System.out.println("Pantaloni sport cu materialul 'Bumbac' si genul masculin:");
        for (PantaloniSport Pantalonisport : Ps) {
            if (Pantalonisport.getMaterial().startsWith("Bumbac") && Pantalonisport.getGen().startsWith("Masculin")) {
                System.out.println(Pantalonisport);
                
            }
        }
        System.out.println("Pantaloni casual cu culoarea rosie si cu prohab:");
        for (PantaloniCasual PantalonCasual : P) {
            if (PantalonCasual.isProhab() && PantalonCasual.getCuloare().startsWith("rosu")) {
                System.out.println("\n"+PantalonCasual);
                
            }
        }
        System.out.println();
        
        System.out.println("Ceas din nergu, curea din piele");
        for(Ceas cs:c){
            if(cs.getMaterial_curea().startsWith("Piele") && cs.getCuloare().startsWith("Negru")){
                System.out.println(cs);
            }       
        }
        System.out.println();
        
        System.out.println("Ochelari din metal pentru barbati");
        for(Ochelari oc:o){
            if(oc.getMaterial().startsWith("Metal") && oc.getGen().startsWith("Barbati")){
                System.out.println("\n"+oc);
            }       
        }
        System.out.println("Camasa casual cu pretul in iontervalul 200-400 lei");
        for(CamasaCasual cmsCas :CC){
            if(cmsCas.getPret()>200 && cmsCas.getPret()<400){
                 System.out.println("\n"+cmsCas);
            }
        }
        System.out.println("Camasa sport cu materialul 'anti uv' si cu o rezistenta la raze uv mai mare de 40 de grade Celsius");
        for(CamasaSport cmsSprt :CS){
        if(cmsSprt.getMaterial().startsWith("anti uv") && cmsSprt.getProtectie_uv()>40){
            System.out.println("\n"+cmsSprt);
        }
    }
        
        System.out.println("\nINTERFATA GRAFICA: \n");
        //INTERFATA GRAFICA
        
        // Creare frame (fereastra)
   JFrame frame = new JFrame("IMBRACAMINTE ");
   frame.setSize(1550, 900);
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
   // Obținere dimensiunea ecranului
   Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

   // Calculare poziția centrală
   int centerX = (int) ((screenSize.getWidth() - frame.getWidth()) / 2);
   int centerY = (int) ((screenSize.getHeight() - frame.getHeight()) / 2);

   // Setare poziție
   frame.setLocation(centerX, centerY);
   // Creare panel (panou)
   JPanel panel = new JPanel();
   
   // Creare etichete și câmpuri de introducere
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        JLabel title1Label = new JLabel("Pantof Casual: ");
        title1Label.setBounds(10, 0, 100, 10);
        panel.add(title1Label);

        JLabel brandLabel = new JLabel("Brand:");
        brandLabel.setBounds(10, 30, 80, 25);
        panel.add(brandLabel);

        JTextField brandField = new JTextField(20);
        brandField.setBounds(100, 30, 150, 25);
        panel.add(brandField);

        JLabel minPriceLabel = new JLabel("Preț Minim:");
        minPriceLabel.setBounds(10, 60, 80, 25);
        panel.add(minPriceLabel);

        JTextField minPriceField = new JTextField(20);
        minPriceField.setBounds(100, 60, 150, 25);
        panel.add(minPriceField);

        JLabel maxPriceLabel = new JLabel("Preț Maxim:");
        maxPriceLabel.setBounds(10, 90, 80, 25);
        panel.add(maxPriceLabel);

        JTextField maxPriceField = new JTextField(20);
        maxPriceField.setBounds(100, 90, 150, 25);
        panel.add(maxPriceField);

        JLabel sizeLabel = new JLabel("Mărime:");
        sizeLabel.setBounds(10, 120, 80, 25);
        panel.add(sizeLabel);

        JTextField sizeField = new JTextField(20);
        sizeField.setBounds(100, 120, 150, 25);
        panel.add(sizeField);
        
        JPanel panel2 = new JPanel();//////////////////////////////////////////////////////////////////////////////
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        JLabel title2Label = new JLabel("Pantof Sport: ");
        title2Label.setBounds(40, 70, 150, 50);
        panel2.add(title2Label);
        
        JLabel brand2Label = new JLabel("Brand:");
        brand2Label.setBounds(40, 70, 80, 50);
        panel2.add(brand2Label);
        
        JTextField brand2Field = new JTextField(20);
        brand2Field.setBounds(100, 58, 150, 50);
        panel2.add(brand2Field);
        
        JLabel minPrice2Label = new JLabel("Preț Minim:");
        minPrice2Label.setBounds(10, 60, 80, 25);
        panel2.add(minPrice2Label);

        JTextField minPrice2Field = new JTextField(20);
        minPrice2Field.setBounds(100, 60, 150, 25);
        panel2.add(minPrice2Field);

        JLabel maxPrice2Label = new JLabel("Preț Maxim:");
        maxPrice2Label.setBounds(10, 90, 80, 25);
        panel2.add(maxPrice2Label);

        JTextField maxPrice2Field = new JTextField(20);
        maxPrice2Field.setBounds(100, 90, 150, 25);
        panel2.add(maxPrice2Field);

        JLabel size2Label = new JLabel("Mărime:");
        size2Label.setBounds(10, 120, 80, 25);
        panel2.add(size2Label);

        JTextField size2Field = new JTextField(20);
        size2Field.setBounds(100, 120, 150, 25);
        panel2.add(size2Field);
        
        JLabel activityLabel = new JLabel("Activitate:");
        activityLabel.setBounds(10, 120, 80, 25);
        panel2.add(activityLabel);
        
        JTextField activityField = new JTextField(20);
        activityField.setBounds(100, 120, 150, 25);
        panel2.add(activityField);
        
        JPanel panel3 = new JPanel();///////////////////////////////////////////////////////////////////////////////////////
        panel3.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        JLabel title3Label = new JLabel("Pantaloni Casual: ");
        title3Label.setBounds(40, 70, 150, 50);
        panel3.add(title3Label);
        
        JLabel brand3Label = new JLabel("Brand:");
        brand3Label.setBounds(40, 70, 80, 50);
        panel3.add(brand3Label);
        
        JTextField brand3Field = new JTextField(20);
        brand3Field.setBounds(100, 58, 150, 50);
        panel3.add(brand3Field);
        
        JLabel gen3Label = new JLabel("Gen:");
        gen3Label.setBounds(40, 70, 80, 50);
        panel3.add(gen3Label);
        
        JTextField gen3Field = new JTextField(20);
        gen3Field.setBounds(100, 58, 150, 50);
        panel3.add(gen3Field);
        
        JLabel color3Label = new JLabel("Culoare:");
        color3Label.setBounds(40, 70, 80, 50);
        panel3.add(color3Label);
        
        JTextField color3Field = new JTextField(20);
        color3Field.setBounds(100, 58, 150, 50);
        panel3.add(color3Field);
        
        JPanel panel4 = new JPanel();///////////////////////////////////////////////////////////////////////////////////////
        panel4.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        JLabel title4Label = new JLabel("Pantaloni Sport: ");
        title4Label.setBounds(40, 70, 150, 50);
        panel4.add(title4Label);
        
        JLabel brand4Label = new JLabel("Brand:");
        brand4Label.setBounds(40, 70, 80, 50);
        panel4.add(brand4Label);
        
        JTextField brand4Field = new JTextField(20);
        brand4Field.setBounds(100, 58, 150, 50);
        panel4.add(brand4Field);
        
        JLabel material4Label = new JLabel("Material:");
        material4Label.setBounds(40, 70, 80, 50);
        panel4.add(material4Label);
        
        JTextField material4Field = new JTextField(20);
        material4Field.setBounds(100, 58, 150, 50);
        panel4.add(material4Field);
        
        JLabel color4Label = new JLabel("Culoare:");
        color4Label.setBounds(40, 70, 80, 50);
        panel4.add(color4Label);
        
        JTextField color4Field = new JTextField(20);
        color4Field.setBounds(100, 58, 150, 50);
        panel4.add(color4Field);
        
        JPanel panel5 = new JPanel();///////////////////////////////////////////////////////////////////////////////////////
        panel5.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        JLabel title5Label = new JLabel("Ceasuri: ");
        title5Label.setBounds(40, 70, 150, 50);
        panel5.add(title5Label);
        
        JLabel brand5Label = new JLabel("Brand:");
        brand5Label.setBounds(40, 70, 80, 50);
        panel5.add(brand5Label);
        
        JTextField brand5Field = new JTextField(20);
        brand5Field.setBounds(100, 58, 150, 50);
        panel5.add(brand5Field);
        
        JLabel materialCureaLabel = new JLabel("Material curea:");
        materialCureaLabel.setBounds(40, 70, 80, 50);
        panel5.add(materialCureaLabel);
        
        JTextField materialCureaField = new JTextField(20);
        materialCureaField.setBounds(100, 58, 150, 50);
        panel5.add(materialCureaField);
        
        JLabel minPrice5Label = new JLabel("Preț Minim:");
        minPrice5Label.setBounds(10, 60, 80, 25);
        panel5.add(minPrice5Label);

        JTextField minPrice5Field = new JTextField(20);
        minPrice5Field.setBounds(100, 60, 150, 25);
        panel5.add(minPrice5Field);

        JLabel maxPrice5Label = new JLabel("Preț Maxim:");
        maxPrice5Label.setBounds(10, 90, 80, 25);
        panel5.add(maxPrice5Label);

        JTextField maxPrice5Field = new JTextField(20);
        maxPrice5Field.setBounds(100, 90, 150, 25);
        panel5.add(maxPrice5Field);
        
        JPanel panel6 = new JPanel();///////////////////////////////////////////////////////////////////////////////////////
        panel6.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        JLabel title6Label = new JLabel("Ochelari: ");
        title6Label.setBounds(40, 70, 150, 50);
        panel6.add(title6Label);
        
        JLabel tipLabel = new JLabel("Tip ochelari:");
        tipLabel.setBounds(40, 70, 80, 50);
        panel6.add(tipLabel);
        
        JTextField tipField = new JTextField(20);
        tipField.setBounds(100, 58, 150, 50);
        panel6.add(tipField);
        
        JLabel materialRamaLabel = new JLabel("Material ramă:");
        materialRamaLabel.setBounds(40, 70, 80, 50);
        panel6.add(materialRamaLabel);
        
        JTextField materialRamaField = new JTextField(20);
        materialRamaField.setBounds(100, 58, 150, 50);
        panel6.add(materialRamaField);
        
        JLabel color6Label = new JLabel("Culoare:");
        color6Label.setBounds(10, 60, 80, 25);
        panel6.add(color6Label);

        JTextField color6Field = new JTextField(20);
        color6Field.setBounds(100, 60, 150, 25);
        panel6.add(color6Field);
        
        JPanel panel7 = new JPanel();///////////////////////////////////////////////////////////////////////////////////////
        panel7.setLayout(new FlowLayout(FlowLayout.LEFT));
        
       JLabel title7Label = new JLabel("GeacaSport:");
       title7Label.setBounds(10,0,100,10);
       panel7.add(title7Label);
      
       JLabel materialLabel = new JLabel("Material:");
       materialLabel.setBounds(10, 30, 80, 25);
       panel7.add(materialLabel);
      
       JTextField materialField = new JTextField(20);
       materialField.setBounds(100, 30, 150, 25);
       panel7.add(materialField);
      
       JLabel culoare7Label = new JLabel("Culoare:");
       culoare7Label.setBounds( 10, 60, 80, 25);
       panel7.add(culoare7Label);
      
       JTextField culoare7Field = new JTextField(20);
       culoare7Field.setBounds( 100, 60, 150, 25);
       panel7.add(culoare7Field);
      
       JLabel tipSportLabel = new JLabel("TipSport:");
       tipSportLabel.setBounds(10, 90, 80, 25);
       panel7.add(tipSportLabel);
      
       JTextField  tipSportField = new JTextField(20);
       tipSportField.setBounds(100, 90, 150, 25);
       panel7.add(tipSportField);
      
       JPanel panel8 = new JPanel();///////////////////////////////////////////////////////////////////////////////////////
       panel8.setLayout(new FlowLayout(FlowLayout.LEFT));
       
       JLabel title8Label = new JLabel("GeacaCasual:");
      title8Label.setBounds(40, 70, 150, 50);
      panel8.add(title8Label);
      
      JLabel PretMin8Label = new JLabel("Pret Minim:");
      PretMin8Label.setBounds(10, 60, 80, 25);
      panel8.add(PretMin8Label);
 
      JTextField PretMin8Field = new JTextField(20);
      PretMin8Field.setBounds(100, 60, 150, 25);
      panel8.add(PretMin8Field);
 
      JLabel PretMax8Label = new JLabel("Pret Maxim:");
      PretMax8Label.setBounds(10, 90, 80, 25);
      panel8.add(PretMax8Label);
 
      JTextField PretMax8Field = new JTextField(20);
      PretMax8Field.setBounds(100, 90, 150, 25);
      panel8.add(PretMax8Field);
      
      JLabel gen8Label = new JLabel("Gen:");
      gen8Label.setBounds(10, 120, 80, 25);
      panel8.add(gen8Label);
 
      JTextField gen8Field = new JTextField(20);
      gen8Field.setBounds(100, 120, 150, 25);
      panel8.add(gen8Field);
      
      JLabel incheiereGeacaLabel = new JLabel(" Incheiere Geaca:");
      incheiereGeacaLabel.setBounds(10, 120, 80, 25);
      panel8.add( incheiereGeacaLabel);
      
      JTextField incheiereGeacaField = new JTextField(20);
      incheiereGeacaField.setBounds(100, 120, 150, 25);
      panel8.add(incheiereGeacaField);
      
      JPanel panel9 = new JPanel();///////////////////////////////////////////////////////////////////////////////////////
      panel9.setLayout(new FlowLayout(FlowLayout.LEFT));
      
      JLabel title19Label = new JLabel("Camasa Casual: ");
        title19Label.setBounds(10, 0, 100, 10);
        panel9.add(title19Label);

        JLabel brand9Label = new JLabel("Brand:");
        brand9Label.setBounds(10, 30, 80, 25);
        panel9.add(brand9Label);

        JTextField brand9Field = new JTextField(20);
        brand9Field.setBounds(100, 30, 150, 25);
        panel9.add(brand9Field);

        JLabel gulerLabel = new JLabel("Guler:");
        gulerLabel.setBounds(10, 60, 80, 25);
        panel9.add(gulerLabel);

        JTextField gulerField = new JTextField(20);
        gulerField.setBounds(100, 60, 150, 25);
        panel9.add(gulerField);
        
        JLabel size9Label = new JLabel("Mărime:");
        sizeLabel.setBounds(10, 120, 80, 25);
        panel9.add(size9Label);

        JTextField size9Field = new JTextField(20);
        sizeField.setBounds(100, 120, 150, 25);
        panel9.add(size9Field);
        
        JPanel panel10 = new JPanel();///////////////////////////////////////////////////////////////////////////////////////
        panel10.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel title110Label = new JLabel("Camasa Sport: ");
        title110Label.setBounds(10, 0, 100, 10);
        panel10.add(title110Label);

        JLabel brand10Label = new JLabel("Brand:");
        brand10Label.setBounds(10, 30, 80, 25);
        panel10.add(brand10Label);

        JTextField brand10Field = new JTextField(20);
        brand10Field.setBounds(100, 30, 150, 25);
        panel10.add(brand10Field);

        JLabel minPrice10Label = new JLabel("Preț Minim:");
        minPrice10Label.setBounds(10, 60, 80, 25);
        panel10.add(minPrice10Label);

        JTextField minPrice10Field = new JTextField(20);
        minPrice10Field.setBounds(100, 60, 150, 25);
        panel10.add(minPrice10Field);

        JLabel maxPrice10Label = new JLabel("Preț Maxim:");
        maxPrice10Label.setBounds(10, 90, 80, 25);
        panel10.add(maxPrice10Label);

        JTextField maxPrice10Field = new JTextField(20);
        maxPrice10Field.setBounds(100, 90, 150, 25);
        panel10.add(maxPrice10Field);

        JLabel color10Label = new JLabel("Culoare:");
        color10Label.setBounds(10, 120, 80, 25);
        panel10.add(color10Label);

        JTextField color10Field = new JTextField(20);
        color10Field.setBounds(100, 120, 150, 25);
        panel10.add(color10Field);
        
        

        
        
 
   // BUTOANE
   JButton buttonPC = new JButton("Caută și Afișează");
   JButton buttonPS = new JButton("Caută și Afișează");
   JButton buttonPantC = new JButton("Caută și Afișează");
   JButton buttonPantS = new JButton("Caută și Afișează");
   JButton buttonCeas = new JButton("Caută și Afișează");
   JButton buttonOchelari = new JButton("Caută și Afișează");
   JButton buttonGS = new JButton("Cauta si Afiseaza");
   JButton buttonGC = new JButton("Cauta si Afiseaza");
   JButton buttonCC = new JButton("Caută și Afișează");
   JButton buttonCS = new JButton("Caută și Afișează");
    
   
   
  buttonPC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Preia valorile introduse de utilizator
                String brandInput = brandField.getText();
                String minPriceInput = minPriceField.getText();
                String maxPriceInput = maxPriceField.getText();
                String sizeInput = sizeField.getText();
                

                // Iterare prin lista și afișare a instanțelor care respectă condițiile
                for (PantofCasual ptfC : pc) {
                    if (ptfC.verifConditiePC(brandInput, minPriceInput, maxPriceInput, sizeInput)) {
                        System.out.println( ptfC);
                    }
                }
            }
        });
  
  buttonPS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent r) {
                // Preia valorile introduse de utilizator
                String brandInput = brand2Field.getText();
                String minPriceInput = minPrice2Field.getText();
                String maxPriceInput = maxPrice2Field.getText();
                String sizeInput = size2Field.getText();
                String activityInput=activityField.getText();
                

                // Iterare prin lista și afișare a instanțelor care respectă condițiile
                for (PantofSport ptfS : ps) {
                    if (ptfS.verifConditiePS(brandInput, minPriceInput, maxPriceInput, sizeInput, activityInput)) {
                        System.out.println( ptfS);
                    }
                }
            }
        });
  
  buttonPantC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent t) {
                // Preia valorile introduse de utilizator
                String brandInput = brand3Field.getText();
                String genInput = gen3Field.getText();
                String colorInput=color3Field.getText();
                

                // Iterare prin lista și afișare a instanțelor care respectă condițiile
                for (PantaloniCasual ptC : P) {
                    if (ptC.verifConditiePantC(brandInput,genInput,colorInput)) {
                        System.out.println( ptC+"\n");
                    }
                }
            }
        });
  
  buttonPantS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent y) {
                // Preia valorile introduse de utilizator
                String brandInput = brand4Field.getText();
                String materialInput = material4Field.getText();
                String colorInput=color4Field.getText();
                

                // Iterare prin lista și afișare a instanțelor care respectă condițiile
                for (PantaloniSport ptS : Ps) {
                    if (ptS.verifConditiePantS(brandInput,materialInput,colorInput)) {
                        System.out.println( ptS+"\n");
                    }
                }
            }
        });
  
  buttonCeas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent u) {
                // Preia valorile introduse de utilizator
                String brandInput = brand5Field.getText();
                String minPriceInput = minPrice5Field.getText();
                String maxPriceInput = maxPrice5Field.getText();
                String materialCureaInput = materialCureaField.getText();
                

                // Iterare prin lista și afișare a instanțelor care respectă condițiile
                for (Ceas ceas : c) {
                    if (ceas.verifConditieCeas(brandInput, minPriceInput, maxPriceInput, materialCureaInput)) {
                        System.out.println( ceas);
                    }
                }
            }
        });
  
  buttonOchelari.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent i) {
                // Preia valorile introduse de utilizator
                String tipInput = tipField.getText();
                String materialRamaInput = materialRamaField.getText();
                String colorInput=color6Field.getText();
                

                // Iterare prin lista și afișare a instanțelor care respectă condițiile
                for (Ochelari och : o) {
                    if (och.verifConditieOchelari(tipInput,materialRamaInput,colorInput)) {
                        System.out.println( och+"\n");
                    }
                }
            }
        });
  
  buttonGS.addActionListener((ActionEvent e) -> {
         // Preia valorile introduse de utilizator
         String Material = materialField.getText();
         String Culoare = culoare7Field.getText();
         String TipSport = tipSportField.getText();
         
         // Iterare prin lista și afișare a instanțelor care respectă condițiile
         for (GeacaSport geacaSport : gs) {
             if (geacaSport.conditieGS(Material, Culoare, TipSport)) {
                 System.out.println(geacaSport);
             }
         }
        });
  
  buttonGC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Preia valorile introduse de utilizator
                String gen8Input = gen8Field.getText();
                String PretMinInput = PretMin8Field.getText();
                String PretMaxInput = PretMax8Field.getText();
                String incheiereGeacaInput = incheiereGeacaField.getText();
                

                // Iterare prin lista și afișare a instanțelor care respectă condițiile
                for (GeacaCasual gcC : gc) {
                    if (gcC.verifConditieGC( gen8Input,PretMinInput,PretMaxInput,incheiereGeacaInput)) {
                        System.out.println( gcC);
                    }
                }
            }
        });
 
  
  buttonCC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Preia valorile introduse de utilizator
                String brandInput = brand9Field.getText();
                String sizeInput = size9Field.getText();
                String gulerInput = gulerField.getText();
                

                // Iterare prin lista și afișare a instanțelor care respectă condițiile
                for (CamasaCasual ptCC : CC) {
                    if (ptCC.verifConditieCC( brandInput, sizeInput , gulerInput)) {
                        System.out.println( ptCC);
                    }
                }
            }
        });
  
  buttonCS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Preia valorile introduse de utilizator
                String brandInput = brand10Field.getText();
                String minPriceInput = minPrice10Field.getText();
                String maxPriceInput = maxPrice10Field.getText();
                String colorInput = color10Field.getText();
                

                // Iterare prin lista și afișare a instanțelor care respectă condițiile
                for (CamasaSport cmsS : CS) {
                    if (cmsS.verifConditieCS(brandInput, minPriceInput, maxPriceInput, colorInput)) {
                        System.out.println( cmsS+"\n");
                    }
                }
            }
        });
  
  




        
        // Adăugare buton la panou
        panel.add(buttonPC);
        buttonPC.setBounds(10, 150, 150, 25);
        panel2.add(buttonPS);
        buttonPS.setBounds(30, 180, 150, 25);
        panel3.add(buttonPantC);
        buttonPantC.setBounds(30, 180, 150, 25);
        panel4.add(buttonPantS);
        buttonPantS.setBounds(30, 180, 150, 25);
        panel5.add(buttonCeas);
        buttonCeas.setBounds(30, 180, 150, 25);
        panel6.add(buttonOchelari);
        buttonOchelari.setBounds(30, 180, 150, 25);
        panel7.add(buttonGS);
        buttonGS.setBounds(30, 180, 150, 25);
        panel8.add(buttonGC);
        buttonGC.setBounds(30, 180, 150, 25);
        panel9.add(buttonCC);
        buttonCC.setBounds(10, 150, 150, 25);
        panel10.add(buttonCS);
        buttonCS.setBounds(10, 150, 150, 25);
        

        // Adăugare panou la frame
        frame.setLayout(new GridLayout(2, 2)); // Creează un layout cu 2 rânduri și 1 coloană
        frame.add(panel);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(panel5);
        frame.add(panel6);
        frame.add(panel7);
        frame.add(panel8);
        frame.add(panel9);
        frame.add(panel10);
        

        // Setare frame să fie vizibil
        frame.setVisible(true);
        
        //TEXTAREA
        JTextArea textArea = new JTextArea("Aici poți scrie sau afișa text.");
        JScrollPane scrollPane = new JScrollPane(textArea);
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BorderLayout());
        rightPanel.add(scrollPane);
        frame.add(rightPanel, BorderLayout.EAST);
        rightPanel.add(new JScrollPane(textArea), BorderLayout.CENTER);
        
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        
        textArea.setPreferredSize(new Dimension(600, 10000)); // Ajustează dimensiunile după preferințele tale
        
        
        
        //JTextArea textArea = new JTextArea();
        textArea.setEditable(true);
        //JScrollPane scrollPane = new JScrollPane(textArea);
        //frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Redirecționează ieșirea standard către un PrintStream personalizat
          PrintStream printStream = new PrintStream(new CustomOutputStream(textArea));
        System.setOut(printStream);
        // Restul codului tău aici...

        frame.setVisible(true);
        
        
        
       frame.revalidate();
       frame.repaint();
       
       
       

       
        //FISIERE
        String numeFisier = "PantofCasual.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(numeFisier))) {
            // Iterează prin lista de persoane și scrie informațiile în fișier
            for (PantofCasual pantof_fisier : pc) {
                writer.write(pantof_fisier.toString());
                writer.newLine();
            }

           
        } catch (IOException e) {
            System.err.println("Eroare la scrierea în fisier: " + e.getMessage());
        }
    
    
    String numeFisier2 = "PantofSport.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(numeFisier2))) {
            // Iterează prin lista de persoane și scrie informațiile în fișier
            for (PantofSport pantof_fisier2 : ps) {
                writer.write(pantof_fisier2.toString());
                writer.newLine();
            }

            
        } catch (IOException e) {
            System.err.println("Eroare la scrierea în fisier: " + e.getMessage());
        }
        
        
        String numeFisier3 = "PantaloniCasual.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(numeFisier3))) {

            for (PantaloniCasual pantaloni_fisier3 : P) {
                writer.write(pantaloni_fisier3.toString());
                writer.newLine();
            }

            
        } catch (IOException e) {
            System.err.println("Eroare la scrierea în fisier: " + e.getMessage());
        }


    String numeFisier4 = "PantaloniSport.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(numeFisier4))) {
            // Iterează prin lista de persoane și scrie informațiile în fișier
            for (PantaloniSport pantaloni_fisier4 : Ps) {
                writer.write(pantaloni_fisier4.toString());
                writer.newLine();
            }

            
        } catch (IOException e) {
            System.err.println("Eroare la scrierea în fisier: " + e.getMessage());
        }
        
        String numeFisier5 = "GeacaSport.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(numeFisier5))) {
           for (GeacaSport geacaSport : gs) {
                writer.write(geacaSport.toString());
                writer.newLine();
            }
 
            
        } catch (IOException e) {
            System.err.println("Eroare la scrierea în fisier: " + e.getMessage());
        }
 
 
            String numeFisier6 = "GeacaCasual.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(numeFisier6))) {
           for (GeacaCasual geacaCasual : gc) {
                writer.write(geacaCasual.toString());
                writer.newLine();
            }
 
            
        } catch (IOException e) {
            System.err.println("Eroare la scrierea în fisier: " + e.getMessage());
        }
        
        String numeFisier7 = "CamasaCasual.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(numeFisier7))) {
            // Iterează prin lista de persoane și scrie informațiile în fișier
            for (CamasaCasual camasa_fisier : CC) {
                writer.write(camasa_fisier.toString());
                writer.newLine();
            }

            
        } catch (IOException e) {
            System.err.println("Eroare la scrierea în fisier: " + e.getMessage());
        }


    String numeFisier8 = "CamasaSport.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(numeFisier8))) {
            // Iterează prin lista de persoane și scrie informațiile în fișier
            for (CamasaSport camasa_fisier2 : CS) {
                writer.write(camasa_fisier2.toString());
                writer.newLine();
            }

            
        } catch (IOException e) {
            System.err.println("Eroare la scrierea în fisier: " + e.getMessage());
        }
        
        String numeFisier9 = "Ceas.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(numeFisier9))) {
            // Iterează prin lista de persoane și scrie informațiile în fișier
            for (Ceas ceasfisier : c) {
                writer.write(ceasfisier.toString());
                writer.newLine();
            }

            
        } catch (IOException e) {
            System.err.println("Eroare la scrierea în fisier: " + e.getMessage());
        }
        
        String numeFisier10 = "Ochelari.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(numeFisier10))) {
            // Iterează prin lista de persoane și scrie informațiile în fișier
            for (Ochelari ochelarifisier : o) {
                writer.write(ochelarifisier.toString());
                writer.newLine();
            }

            
        } catch (IOException e) {
            System.err.println("Eroare la scrierea în fisier: " + e.getMessage());
        }
        
    }
       
}
        
    

    class CustomOutputStream extends OutputStream {
    private JTextArea textArea;

    public CustomOutputStream(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void write(int b) {
        // Adaugă caracterul la JTextArea
        textArea.append(String.valueOf((char) b));
        // Derulează în jos pentru a afișa întotdeauna ultimul text
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }
}

        
    
    

