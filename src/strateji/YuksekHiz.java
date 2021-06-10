
package strateji;


public class YuksekHiz extends Davranis {

    @Override
    public void durumSet() {
        durum = 1;
    }

    @Override
    public void renkSet() {
        renk = "Turuncu";
    }

    @Override
    public void hizKatSet() {
        hizlanma_katsayi = 2;
    }

    @Override
    public void maksHizSet() {
        maks_hiz = 400;
    }

    @Override
    public void nitroSet() {
        nitro = false;
    }

}
