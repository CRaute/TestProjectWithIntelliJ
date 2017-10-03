public class Wassertier extends Tier{

    public Wassertier(int groesse, int gewicht, Haut hauttyp){
        super(groesse, gewicht, hauttyp);
    }

    public void macheLaut(){
        System.out.println("UNTERWASSERSCHALLLLL");
    }

    public String toString(){

        return "Ich bin "+ groesse + "cm groß und wiege "+ gewicht+"kg mein Hauttyp ist "+ haut;
    }
}
