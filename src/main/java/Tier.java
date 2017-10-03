public abstract class Tier {

    int groesse, gewicht;
    Haut haut;
    GangArt gangArt;


    Tier(int groesse, int gewicht, Haut haut, GangArt gangArt){
        this.groesse=groesse;
        this.haut=haut;
        this.gewicht=gewicht;
        this.gangArt = gangArt;
    }

    public abstract void macheLaut();
}
