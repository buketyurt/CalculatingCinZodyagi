package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Doğum Yılınızı Giriniz : ");
        Integer Year = scanner.nextInt();
        int Kalan =0;
        Kalan = Year % 12;
        if(Kalan == 0){
            System.out.println("Çin Zodyağı Burcunuz : Maymun");
        }
        else if(Kalan == 1){
            System.out.println("Çin Zodyağı Burcunuz : Horoz");
        }
        else if(Kalan == 2){
            System.out.println("Çin Zodyağı Burcunuz : Köpek");
        }
        else if(Kalan == 3){
            System.out.println("Çin Zodyağı Burcunuz : Domuz");
        }
        else if(Kalan == 4){
            System.out.println("Çin Zodyağı Burcunuz : Fare");
        }
        else if(Kalan == 5){
            System.out.println("Çin Zodyağı Burcunuz : Öküz");
        }
        else if(Kalan == 6){
            System.out.println("Çin Zodyağı Burcunuz : Kaplan");
        }
        else if(Kalan == 7){
            System.out.println("Çin Zodyağı Burcunuz : Tavşan");
        }
        else if(Kalan == 8){
            System.out.println("Çin Zodyağı Burcunuz : Ejderha");
        }
        else if(Kalan == 9){
            System.out.println("Çin Zodyağı Burcunuz : Yılan");
        }
        else if(Kalan == 10){
            System.out.println("Çin Zodyağı Burcunuz : At");
        }
        else if(Kalan == 11){
            System.out.println("Çin Zodyağı Burcunuz : Koyan");
        }


    }
}