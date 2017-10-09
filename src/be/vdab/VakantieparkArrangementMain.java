package be.vdab;

import java.util.Scanner;

public class VakantieparkArrangementMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VakantieparkArrangement bungalow = new Bungalow();
        System.out.println("Wilt u een barbecue bij uw bungalow? j/n?");
        if ("j".equalsIgnoreCase(sc.next())){
            bungalow = new Barbecue(bungalow);
        }
        System.out.println("Wilt u fietsen bij uw bungalow? j/n?");
        if ("j".equalsIgnoreCase(sc.next())){
            bungalow = new Fietsen(bungalow);
        }
        System.out.println("\nDe taken voor het personeel zijn de volgende:");
        System.out.println(bungalow.getTaak());        
    }
    
}
