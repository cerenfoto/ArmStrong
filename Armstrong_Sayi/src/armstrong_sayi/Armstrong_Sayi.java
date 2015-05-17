/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armstrong_sayi;

/**
 *
 * @author Sinarik
 */
public class Armstrong_Sayi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int yuzler_bas,onlar_bas,birler_bas,sayi,armstrong_sayi;
        System.out.println("3 basamaklı armstrong sayılar:");
        
        for(sayi=100; sayi<=999; sayi++){
            yuzler_bas=(sayi/100);
            
            onlar_bas=(sayi-(yuzler_bas*100))/10;
            
            birler_bas=sayi-((yuzler_bas*100)+(onlar_bas*10));
            
            armstrong_sayi=((yuzler_bas*yuzler_bas*yuzler_bas)+(onlar_bas*onlar_bas*onlar_bas)+(birler_bas*birler_bas*birler_bas));
            
            if(sayi==armstrong_sayi){
                System.out.println(sayi);
            }
    }
        
    }
    
}
