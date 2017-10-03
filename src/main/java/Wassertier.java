public class Wassertier extends Tier{
//Klasse für Wassertier
    public Wassertier(int groesse, int gewicht, Haut hauttyp, GangArt gangart){
        super(groesse, gewicht, hauttyp, gangart);
    }

    public void macheLaut(){
        System.out.println("UNTERWASSERSCHALLLLL");
    }

    public String toString(){

        return "Ich bin "+ groesse + "cm groß und wiege "+ gewicht+"kg mein Hauttyp ist "+ haut;
    }
}
