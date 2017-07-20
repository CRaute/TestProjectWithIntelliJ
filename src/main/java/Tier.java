public abstract class Tier {

    int groesse, gewicht;
    Haut haut;


    Tier(int groesse, int gewicht, Haut haut){
        this.groesse=groesse;
        this.haut=haut;
        this.gewicht=gewicht;
    }

    public abstract void macheLaut();
}
