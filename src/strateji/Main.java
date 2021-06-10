
package strateji;


public class Main {


    public static void main(String[] args) {
          Context c=new Context();
          System.out.println("Arac normal hızla ilerliyor.");
          c.setDavranis(new Normal());
          c.calistir();
          System.out.println("Araç yüksek hıza çıktı..");
          c.setDavranis(new YuksekHiz());
          c.calistir();
          System.out.println("Araç nitro hıza çıktı");
          c.setDavranis(new NitroHiz());
          c.calistir();

    }
    
}
