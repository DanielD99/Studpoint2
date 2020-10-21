
import java.util.ArrayList;

public class Garage {
    String navn;
    ArrayList<Bil> mineBiler = new ArrayList<Bil>();


    public Garage(String navn) {
        this.navn = navn;

    }


    public double beregnGrønAfgiftForBilpark(){
        double samletAfgift=0;
        for (Bil bil:mineBiler) {

            samletAfgift+=bil.beregnGrønEjerafgift();
        }
        return samletAfgift;

    }

    @Override
    public String toString() {
        String returnString = "";
        for (Bil bil:mineBiler) {

            returnString+=bil+"\n";
        }
        return returnString;
    }
    public void tilføjBil(Bil bil){
        mineBiler.add(bil);
    }
}
