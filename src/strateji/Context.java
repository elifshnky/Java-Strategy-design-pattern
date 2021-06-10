
package strateji;


public class Context {
    Davranis d;
    public void setDavranis(Davranis davranis)
    {
        d=davranis;
    }
    public void calistir(){
        d.durumSet();
        d.hizKatSet();
        d.maksHizSet();
        d.nitroSet();
        d.renkSet();
        d.Yazdir();
    }
}
