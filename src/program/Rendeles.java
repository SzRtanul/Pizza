/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author SzabóRoland(SZOFT_20
 */
public class Rendeles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        String[][] pizza = new String[][]{
            {"Vastagság: ", "Vastag", "Vékony"},
            {"Alap: ", "Paradicsomos", "Tejfölös"},
            {"Átmérő: ", "32cm", "45cm"},
            {"Összetevők: ", "Édes", "Hús", "Tejtermék és egyebek"},
            {"Átsültség mértéke: ", "Nyers", "Félig nyers", "Sült", "Túl sült", "Égett", "Hamu"}
        };
        String[][] osszetevok = new String[][]{
            {"Édes: ", "Ananász", "Nutella", "Vanilliakrém", "Tejszínhab", "Csokiöntet", "Lekvár"},
            {"Hús: ", "Bacon", "Sonka", "Kolbász", "Hurka", "Sós karamella krém"},
            {"Tejtermék és egyebek: ", "Tojás", "Dupla sajt"}
        };
        FileWritn(pizza, "pizza.txt");
        FileWritn(osszetevok, "osszetevok.txt");
        
        
        
    }
    
    public static void FileWritn(String[][] arrayi, String filename){
        File fil = new File(filename);
        try (PrintWriter writer = new PrintWriter(fil, "UTF-8")) {    
            for (int i = 0; i < arrayi.length; i++) {
                String szoveg = arrayi[i][0]+",";
                for (int j = 0; j < arrayi[i].length; j++) {
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
    
    public static void FileReadn(String filename) throws FileNotFoundException{
        String[][] arrayi;
        File file = new File(
            "");
        
        try(Scanner sc = new Scanner(file)){
            for (int i = 0; sc.hasNextLine(); i++) {
               // arrayi.
               // sc.nextLine();
               // sc.
            }
            while (sc.hasNextLine()){
            }
        }
    }
}
