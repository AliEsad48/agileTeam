package projectvendingmachine;

import java.util.Scanner;

public class Methods {

    public double select(Products product){

        System.out.println(product.toString());

        Scanner scan=new Scanner(System.in);

        do {

            System.out.println("Lutfen almak istediginiz urunun numarasini giriniz (1'den 10'a kadar)");

            product.setProductNum(scan.nextInt());

            if (product.getProductNum()<1||product.getProductNum()>10) {

                System.out.println("Gecerli bir product numarasi giriniz (1'den 10'a kadar)");

            }

        }while (product.getProductNum()<1||product.getProductNum()>10);

        return 0;

    }



}
