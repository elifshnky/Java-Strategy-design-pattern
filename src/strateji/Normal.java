
package strateji;


public class Normal extends Davranis {

    @Override
    public void durumSet() {
        durum = 0;
    }

    @Override
    public void renkSet() {
        renk = "Sari";
    }

    @Override
    public void hizKatSet() {
        hizlanma_katsayi = 1;
    }

    @Override
    public void maksHizSet() {
        maks_hiz = 200;
    }

    @Override
    public void nitroSet() {
        nitro = false;
    }

}
