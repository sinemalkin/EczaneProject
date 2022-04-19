package EczaneProject;


import java.util.Arrays;

public class Methodlar extends VeriDeposu {

   public static void hastaGiris(){
       System.out.println("Lutfen hasta adi giriniz    :  ");
      String hasta=scan.next();
       hastaControl();


   }
   public static void hastaControl(){
       if (hastaList.contains(hasta)){
           receteControl();
       }else if (hastaList.contains(hasta)){
           hastaKayit();
       }else System.out.println("hatali giris yaptiniz...");
       hastaGiris();

   }
   public static void hastaKayit(){
       System.out.println("Belirttiginiz hasta kayitli degil");
       System.out.println("Hasta adi giriniz  :  ");
       yeniHasta=scan.next();
       hastaList.add(yeniHasta);
       System.out.println("hasta kaydi tamamlanmistir");
       System.out.println("recete ekranina yonlendiriliyorsunuz");
       for (int i = 1; i <=4 ; i++) {
           try{
               Thread.sleep(500);
           }catch (Exception e){
               Thread.currentThread().interrupt();
           }
           System.out.println(".");
       }
       receteControl();
   }
   public static void receteControl(){
       System.out.println("Recete numaranizi giriniz  :  ");
       receteNo=scan.next();
       if (receteNoList.contains(receteNo)){
           System.out.println("Bu recete var ");
           System.out.println("Recete kontrol icin 1\n Ana menu icin 2 ye ");
           receteEkranSecim=scan.next();
           switch(receteEkranSecim){
               case "1":
                   receteControl();
               case "2" :
                   hastaGiris();
               default:
                   System.out.println("Hatali giris yaptiniz");
                   receteControl();
           }
       }else if (!receteNoList.contains(receteNo)){
           receteNoList.add(receteNo);

           receteGetir();
       }else System.out.println("Hatali giris yaptiniz ");
       hastaGiris();

   }
   public static void receteGetir(){
       System.out.println(receteList);
       ilacGetir();


   }
   public static void ilacGetir(){
       System.out.println("Recetede olan ilaclariniz");
       System.out.println(recete1);

   }
   public void ilacEkle(){
       ilacList.add("Alegra");
       ilacList.add("Desmont");
       ilacList.add("Parol");
       ilacList.add("Glifor");
       ilacList.add("Aferin");
       ilacList.add("Majezik");
       ilacList.add("Ecoprin");
       ilacList.add("beloc");
       ilacList.add("Calpol");
       ilacList.add("Ventolin");
       ilacList.add("Aspirin");
       ilacIdList.add("1");
       ilacIdList.add("2");
       ilacIdList.add("3");
       ilacIdList.add("4");
       ilacIdList.add("5");
       ilacIdList.add("6");
       ilacIdList.add("7");
       ilacIdList.add("8");
       ilacIdList.add("9");
       ilacIdList.add("10");
       ilacIdList.add("11");

   }
   public void receteOlustur(){
      recete1.add(ilacList.get(0)+ilacList.get(1));
      recete2.add(ilacList.get(2));
      recete3.add(ilacList.get(3));
      recete4.add(ilacList.get(4)+ilacList.get(2));
      recete5.add(ilacList.get(5));
      recete6.add(ilacList.get(6)+ilacList.get(7));
      recete7.add(ilacList.get(8)+ilacList.get(9));
      recete8.add(ilacList.get(10));

      receteList.add(recete1);
      receteList.add(recete2);
      receteList.add(recete3);
      receteList.add(recete4);
      receteList.add(recete5);
      receteList.add(recete6);
      receteList.add(recete7);
      receteList.add(recete8);



       receteControl();
}
public void hastalik(){
       hastalikList.add("Allerji");
       hastalikList.add("Basagrisi");
       hastalikList.add("Diyabet");
       hastalikList.add("Soguk alginligi");
       hastalikList.add("Migren");
       hastalikList.add("Kalp hastaliklari");
       hastalikList.add("Cocuk hastaliklari");
       hastalikList.add("Genel cerrah");


}
   public void ilacSiparis(){

   }

}
