package atm;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Options extends Account{

    Scanner scan=new Scanner(System.in);

    DecimalFormat paraFormat=new DecimalFormat("'$'###,##0.00");

    HashMap<Integer , Integer> musteriData=new HashMap<>();

    public void login(){

        boolean flag = true;

        do {

            try {
                musteriData.put(12345 , 123);
                musteriData.put(23456 , 236);
                musteriData.put(34567 , 345);
                musteriData.put(45678 , 456);
                musteriData.put(56789 , 567);

                System.out.print("Lütfen müşteri numaranızı giriniz: ");

                setMusteriNo(scan.nextInt());

                System.out.println();

                System.out.print("Lütfen PIN numaranızı giriniz: ");

                setPinNo(scan.nextInt());

            } catch (Exception e) {

                System.out.println("Lütfen geçerli müşteri ve pin numarası giriniz, çıkmak için 'Q' tuşuna basınız...");

                String cikis=scan.next();
                if (cikis.equalsIgnoreCase("Q")){

                    flag=false;

                }

            }

           Set<Map.Entry<Integer , Integer>> musteriDataSet=musteriData.entrySet();

            for (Map.Entry<Integer , Integer> w:musteriDataSet){

                if (w.getKey()==getMusteriNo() && w.getValue()==getPinNo()){

                    //ilerleyebilirsin....


                }

            }

        }while (flag);

    }

    public void islemSec(){

        System.out.println("Aşağıdaki işlemlerden biriniz seçiniz:");
        System.out.println("1: Vadesiz Hesap İşlemleri");
        System.out.println("2: Vadeli Hesap İşlemleri");
        System.out.println("3: Çıkış");

        int secim = scan.nextInt();

        switch (secim){

            case 1:

                break;

            case 2:

                break;

            case 3:

                System.out.println("Teşekkür eder tekrar bekleriz...");

                break;

            default:

                System.out.println("Lütfen geçerli bir seçim yapınız...");

                islemSec();

        }

    }

}
