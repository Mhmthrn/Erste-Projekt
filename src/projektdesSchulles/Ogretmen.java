package projektdesSchulles;

import java.util.*;

public class Ogretmen {
    static Scanner scan=new Scanner(System.in);
    static Map<String, String> ogretmenlerMap=new HashMap<>();
    public static void feykOgretmenEkle (){

        ogretmenlerMap.put("14785442369","Ali,Can,1989,Matematik");
        ogretmenlerMap.put("74577826988","Veli,Kalem,1988,Geometri");
        ogretmenlerMap.put("74881258963","Mahmut,Terzi,1965,Edebiyat");
        ogretmenlerMap.put("36688989874","Okkes,Nar,1975,Fizik");
        ogretmenlerMap.put("14766852589","Mehmet,Tez,1978,Kimya");
    }

    public static void ogretmenMenu() throws InterruptedException {
        String tercih="";

        do {
            System.out.println("============== YILDIZ KOLEJI ========\n" +
                    "============= OGRETMEN MENU ==============\n" +
                    "\n" +
                    "\t 1- Ogretmen Listesini Yazdir\n" +
                    "\t 2- Soyisimden Ogretmen Bulma\n" +
                    "\t 3- Branstan Ogretmen Bulma\n" +
                    "\t 4- Bilgilerini Girerek Ogretmen Ekleme\n" +
                    "\t 5- Kimlik No Ile Kayit Silme\n" +
                    "\t A- ANAMENU\n" +
                    "\t Q- Cikis");
            tercih=scan.nextLine();

            switch (tercih){

                case "1":// ogretmen listesi yazdir
                    ogretmenListesiYazdir();
                    break;
                case "2"://Soyisimden Ogretmen Bulma
                    soyisimdenOgretmenBulma();
                    break;
                case "3"://Branstan Ogretmen Bulma
                    branstanOgretmenBulma();
                    break;
                case "4":// Bilgilerini Girerek Ogretmen Ekleme
                    ogretmenEkleme();

                    break;
                case "5":// Kimlik No Ile Kayit Silme
                    tcNoIleKayitSil();
                    break;
                case "A":
                case "a":
                    Depo.anaMenu();
                    break;
                case "Q":
                case "q":
                    break;
                default:
                    System.out.println("Lutfen Gecerli tercih yapiniz.");

            }

        }while (!tercih.equalsIgnoreCase("q"));
        Depo.projeDurdur();
    }

    public static void tcNoIleKayitSil() {
        System.out.println("Silinecek ogretmen kimlik no giriniz");
        String silinecekOgretmen=scan.nextLine();
        String silinecekValue=ogretmenlerMap.get(silinecekOgretmen);

        String sonucValue=ogretmenlerMap.remove(silinecekOgretmen);

        try {
            boolean sonuc=  sonucValue.equals(silinecekValue);
        } catch (Exception e) {
            System.out.println("Verilen kimlik no ile ogretmen bulunamadi");
        }
    }

    public static void ogretmenEkleme() {
        System.out.println("Tc No");
        String tcNo=scan.nextLine();
        System.out.println("Isim");
        String isim=scan.nextLine();
        System.out.println("Soyisim");
        String soyIsim=scan.nextLine();
        System.out.println("Dagum Yili");
        String dYili=scan.nextLine();
        System.out.println("Brans");
        String brans=scan.nextLine();

        String eklenecekValue = isim+", "+ soyIsim+"," + dYili+", "+ brans+",";

        ogretmenlerMap.put(tcNo,eklenecekValue);


    }

    public static void branstanOgretmenBulma() throws InterruptedException {
        System.out.printf("Lutfen Armak istediginiz Ogretmenin Bransini giriniz");
        String istenenBrans=scan.nextLine();

        Set<Map.Entry<String,String>>ogretmenEntryset=ogretmenlerMap.entrySet();

        System.out.println("============== YILDIZ KOLEJI ========\n" +
                "===========BRANS ILE  OGRETMEN ARAMA ============\n"+
                "TcNo        Isim   Soyisim  D.Yili   Brans"
        );
        for (Map.Entry<String,String>each:ogretmenEntryset
        ) {
            String eachKey=each.getKey();
            String eachvalue=each.getValue();

            String eachValuarr []=eachvalue.split(",");

            if (istenenBrans.equalsIgnoreCase(eachValuarr[3])){
                System.out.printf("%11s %-6s %-8s %-4s     %s\n",eachKey,eachValuarr[0], eachValuarr[1],
                        eachValuarr[2],eachValuarr[3]);
            }
        }
        Thread.sleep(5000);
    }

    public static void soyisimdenOgretmenBulma() throws InterruptedException {
        System.out.printf("Lutfen Armak istediginiz Ogretmenin Soyismini giriniz");
        String istenenSoyisim=scan.nextLine();

        Set<Map.Entry<String,String>>ogretmenEntryset=ogretmenlerMap.entrySet();

        System.out.println("============== YILDIZ KOLEJI ========\n" +
                "===========SOYSIM ILE  OGRETMEN ARAMA ============\n"+
                "TcNo        Isim   Soyisim  D.Yili   Brans"
        );
        for (Map.Entry<String,String>each:ogretmenEntryset
        ) {
            String eachKey=each.getKey();
            String eachvalue=each.getValue();

            String eachValuarr []=eachvalue.split(",");

            if (istenenSoyisim.equalsIgnoreCase(eachValuarr[1])){
                System.out.printf("%11s %-6s %-8s %-4s     %s\n",eachKey,eachValuarr[0], eachValuarr[1],
                        eachValuarr[2],eachValuarr[3]);
            }
        }
        Thread.sleep(5000);
    }

    public static void ogretmenListesiYazdir() throws InterruptedException {

        Set<Map.Entry<String,String>>ogretmenEntryset=ogretmenlerMap.entrySet();

        System.out.println("============== YILDIZ KOLEJI ========\n" +
                "============= OGRETMEN LISTESI ==============\n"+
                "TcNo        Isim   Soyisim  D.Yili   Brans"
        );
        for (Map.Entry<String,String>each:ogretmenEntryset
             ) {

            String eachKey=each.getKey();
            String eachvalue=each.getValue();

            String eachValuarr []=eachvalue.split(",");
            System.out.printf("%11s %-6s %-8s %-4s     %s\n",eachKey,eachValuarr[0], eachValuarr[1],
                    eachValuarr[2],eachValuarr[3]);
        }
        Thread.sleep(5000);

    }
}
