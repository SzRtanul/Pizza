/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program;

import java.io.*;
import java.util.*;

/**
 *
 * @author SzabóRoland(SZOFT_20
 */
public class Rendeles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] osszetevok = new String[][]{
            {"Édes:0", "Ananász:900", "Nutella:1200", "Vanilliakrém:400", "Tejszínhab:100", "Csokiöntet:200", "Lekvár:300"},
            {"Sós:0", "Bacon:600", "Sonka:600", "Kolbász:700", "Hurka:800", "Szalámi:450", "Sós karamella krém:230", "Tojás:120", "Dupla sajt:1200"}
        };
        String[] ossz = new String[osszetevok.length];
        for (int i = 0; i < osszetevok.length; i++) {
            ossz[i] = osszetevok[i][0];
        }
        String[][] pizza = new String[][]{
            {"Vastagság:0", "Vastag:600", "Vékony:500"},
            {"Alap:0", "Paradicsomos:500", "Tejfölös:500"},
            {"Átmérő:0", "32cm:1500", "45cm:1700"},
            //{"Összetevők", "Édes", "Sós"},
            {"Átsültség mértéke:0", "Nyers:0", "Félig nyers:0", "Sült:0", "Túl sült:0", "Égett:0", "Hamu:0"}
        };
        FileWritn(pizza, "pizza.txt");
        FileWritn(osszetevok, "osszetevok.txt");
        
        
        
    }
    
    public static void FileWritn(String[][] arrayi, String filename){
        File fil = new File(filename);
        try (PrintWriter writer = new PrintWriter(fil, "UTF-8")) {    
            for (int i = 0; i < arrayi.length; i++) {
                String szoveg = arrayi[i][0]+",";
                for (int j = 1; j < arrayi[i].length; j++) {
                    szoveg+=arrayi[i][j]+",";
                }
                writer.println(szoveg);
            }
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            //Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static String[][][] FileReadn(String filename) throws FileNotFoundException{
        File file = new File(filename);
        String[][][] arrayi;
        ArrayList<String> al = new ArrayList<String>();
        
        try(Scanner sc = new Scanner(file)){
            while(sc.hasNextLine()) {
                al.add(sc.nextLine());
            }
        }
        
        arrayi = new String[al.size()][][];
        for (int i = 0; i < al.size(); i++) {
            String[] ideig = al.get(i).split(",");
            arrayi[i] = new String[ideig.length][];
            for (int j = 0; j < ideig.length; j++) {
                String[] ideig2 = ideig[j].split(":");
                arrayi[i][j] = ideig2;
            }
        }
        
       /*
        for (int i = 0; i < arrayi.length; i++) {
            for (int j = 1; j < arrayi[i].length; j++) {
                    System.out.println(arrayi[i][j][0] + arrayi[i][j][1]);  
            }
        }
        */
        
        return arrayi;
    }
}
