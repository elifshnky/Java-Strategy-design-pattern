
package strateji;


public abstract class Davranis {
   protected int durum=0;
    protected String renk="Beyaz";
    protected int hizlanma_katsayi=1;
    protected int maks_hiz=200;
    protected boolean nitro=false;
    
    public abstract void durumSet();
    public abstract void renkSet();
    public abstract void hizKatSet();
    public abstract void maksHizSet();
    public abstract void nitroSet();

    public void Yazdir()
    {
      //  System.out.println(DataTime.Now);
                System.out.println("Durum "+durum+" Renk= "+renk+" Hizlanma Katsayisi= "+hizlanma_katsayi+
                        " Maksimum Hız "+maks_hiz+" Nitro Durumu= "+nitro);

    }
}
