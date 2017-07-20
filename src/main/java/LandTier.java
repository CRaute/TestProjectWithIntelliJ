public class LandTier extends Tier{

    public LandTier(int groesse, int gewicht, Haut hauttyp){
        super(groesse, gewicht, hauttyp);

    }

    public void macheLaut(){
        System.out.println("SCHALLLLL");
    }

    public String toString(){

        return "Ich bin "+ groesse + "cm groß und wiege "+ gewicht+"kg mein Hauttyp ist "+ haut;
    }
}
