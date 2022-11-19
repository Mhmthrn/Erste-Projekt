package projektdesSchulles;

import java.util.*;

public class Ogrenci {
    static Scanner scan = new Scanner(System.in);
    static Map<String, String> ogrenciMap = new HashMap<>();

    public static void feykOgrenciEkle() {

        ogrenciMap.put("14785442369","Ali,  Can,   2008, 3569, 12, A");
        ogrenciMap.put("74577826988","Veli, Kalem, 2009, 3559, 12, B");
        ogrenciMap.put("74881258963","Ayse, Terzi, 2008, 3565, 12, A");
        ogrenciMap.put("36688989874","Omer,  Nar,  2008, 1569, 11, A");
        ogrenciMap.put("14766852589","Murtaza,Tez, 2008, 3769, 11, A");
    }

    public static void ogrenciMenu() throws InterruptedException {
        String tercih = "";
        do {

            System.out.println("============== YILDIZ KOLEJI ========\n" +
                    "============= OGRENCI MENU ==============\n" +
                    "\n" +
                    "\t 1- Ogrenci Listesini Yazdir\n" +
                    "\t 2- Soyisimden Ogrenci Bulma\n" +
                    "\t 3- Sinif ve Sube ile  Ogrenci Bulma\n" +
                    "\t 4- Bilgilerini Girerek Ogrenci Ekleme\n" +
                    "\t 5- Kimlik No Ile Kayit Silme\n" +
                    "\t A- ANAMENU\n" +
                    "\t Q- Cikis");
            tercih = scan.nextLine();

            switch (tercih) {
                case "1":
                    ogrenciListeYazdir();
                    break;
                case "2":
                    soyisimdenOgrenciBulma();
                    break;
                case "3":
                    sinifVeSubeIleOgrenciBulma();
                    break;
                case "4":
                    ogrenciEkle();
                    break;
                case "5":
                    tcNoIleOgrenciSilme();
                    break;
                case "a":
                case "A":
                    Depo.anaMenu();
                    break;
                case "q":
                case "Q":
                    Depo.projeDurdur();
                    break;
                default:
                    System.out.println("Lutfen gecerli bir tercih giriniz.");

            }
        } while (!tercih.equalsIgnoreCase("q"));
        Depo.projeDurdur();

    }

    private static void tcNoIleOgrenciSilme() {
       /* System.out.println("Silinecek ogrenci kimlik no giriniz");
        String silinecekOgreci=scan.nextLine();
        String silinecekValue=ogrenciMap.get(silinecekOgreci);

        String sonucValue=ogrenciMap.remove(silinecekOgreci);

        try {
            boolean sonuc=  sonucValue.equals(silinecekValue);
        } catch (Exception e) {
            System.out.println("Verilen kimlik no ile ogrenci bulunamadi");
        }*/
    }

    private static void ogrenciEkle() {
      /*  System.out.println("Tc No");
        String tcNo=scan.nextLine();
        System.out.println("Isim");
        String isim=scan.nextLine();
        System.out.println("Soyisim");
        String soyIsim=scan.nextLine();
        System.out.println("Dagum Yili");
        String dYili=scan.nextLine();
        System.out.println("Okul No");
        String okulNo=scan.nextLine();
        System.out.println("Sinif");
        String sinif=scan.nextLine();
        System.out.println("Sube");
        String sube=scan.nextLine();

        String key=tcNo;
        String value= isim+", "+ soyIsim+"," + dYili+", "+ okulNo+","
                + sinif+","+sube ;

        ogrenciMap.put(tcNo,value);*/
    }

    private static void sinifVeSubeIleOgrenciBulma() throws InterruptedException {

   /* Set<Map.Entry<String, String>> myEntrySet = ogrenciMap.entrySet();
        System.out.println(ogrenciMap);
        System.out.println("Istediginiz ogrenci Sinifini  yaziniz");
        String istenilenSinif = scan.nextLine();
        System.out.println("Istediginiz ogrenci  Subesini yaziniz");
        String istenilenSube = scan.nextLine();


        System.out.println("============== YILDIZ KOLEJI ========\n"+
                "============= OGRENCI LISTESI ==============\n"+
                "Tc No      Isim    Soyisim   D Yili  Okul No   Sinif  Sube");

        for(Map.Entry<String, String> each:myEntrySet)

    {

        String eachKey = each.getKey();
        String eachValue = each.getValue();
        String[] eachValueArr = eachValue.split(", ");

        if (istenilenSinif.equalsIgnoreCase(eachValueArr[4]) && istenilenSube.equalsIgnoreCase(eachValueArr[5])){
            System.out.printf("%-12s %-6s %-9s %-7s %-8s %-5s %-2s \n", eachKey, eachValueArr[0], eachValueArr[1], eachValueArr[2], eachValueArr[3],
                    eachValueArr[4], eachValueArr[5]);
        }
        Thread.sleep(5000);
    }*/

}

    private static void soyisimdenOgrenciBulma() throws InterruptedException {
      /*  Set<Map.Entry<String,String>> myEntrySet=ogrenciMap.entrySet();
        System.out.println(ogrenciMap);
        System.out.println("Istediginiz ogrenci soyismini yaziniz");
        String istenilenSoyisim=scan.nextLine();


        System.out.println("============== YILDIZ KOLEJI ========\n" +
                "============= OGRENCI LISTESI ==============\n" +
                "Tc No      Isim    Soyisim   D Yili  Okul No   Sinif  Sube");

        for (Map.Entry<String,String> each: myEntrySet
        ) {

            String eachKey=each.getKey();
            String eachValue=each.getValue();
            String[] eachValueArr =eachValue.split(", ");

           if (istenilenSoyisim.equalsIgnoreCase(eachValueArr[1])){
               System.out.printf("%-12s %-6s %-9s %-7s %-8s %-5s %-2s \n",eachKey, eachValueArr[0],eachValueArr[1],eachValueArr[2], eachValueArr[3],
                                                                          eachValueArr[4], eachValueArr[5]);
        }
        Thread.sleep(5000);


    }*/
    }

    public static void ogrenciListeYazdir() throws InterruptedException {

        Set<Map.Entry<String,String>> ogrenciEntrySet= ogrenciMap.entrySet();

        System.out.println("============== YILDIZ KOLEJI ========\n" +
                "============= OGRENCI LISTESI ==============\n" +
                "Tc No      Isim    Soyisim   D Yili  Okul No   Sinif  Sube");

        for (Map.Entry<String,String> each: ogrenciEntrySet
             ) {

            String eachKey=each.getKey();
            String eachValue=each.getValue();

            String[] eachValueArr =eachValue.split(", ");
            System.out.printf("%-12s %-6s %-9s %-7s %-8s %-5s %-2s\n",eachKey,eachValueArr[0],eachValueArr[1],
                                              eachValueArr[2],eachValueArr[3], eachValueArr[4], eachValueArr[5]);

        }
        Thread.sleep(5000);


    }
}
