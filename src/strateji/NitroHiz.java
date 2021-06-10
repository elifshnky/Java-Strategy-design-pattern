
package strateji;


public class NitroHiz extends Davranis {

    @Override
    public void durumSet() {
        durum = 2;
    }

    @Override
    public void renkSet() {
        renk = "Kırmızı";
    }

    @Override
    public void hizKatSet() {
        hizlanma_katsayi = 3;
    }

    @Override
    public void maksHizSet() {
        maks_hiz = 600;
    }

    @Override
    public void nitroSet() {
        nitro = true;
    }

}
