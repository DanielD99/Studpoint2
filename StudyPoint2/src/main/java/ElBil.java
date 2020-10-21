import java.util.WeakHashMap;

public class ElBil extends Bil {
    private float batterikapacitetKWh;
    private int maxKm;
    private int WhPrKm;

    public ElBil(int regNr, String mærke, String model, int årgang, int antalDøre, float batterikapacitetKWh, int maxKm, int whPrKm) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.batterikapacitetKWh = batterikapacitetKWh;
        this.maxKm = maxKm;
        WhPrKm = whPrKm;
    }
    public double beregnGrønEjerafgift() {
double kmPrL = 100/(WhPrKm/91.25);

        if (kmPrL > 20) {
            return 330;

        } else if (kmPrL > 15) {
            return 1050;

        } else if (kmPrL > 10) {
            return 2340;
        } else if (kmPrL > 5) {
            return 5500;
        } else {
            return 10470;

        }
    }
    public float getBatterikapacitetKWh() {
        return batterikapacitetKWh;
    }

    public void setBatterikapacitetKWh(float batterikapacitetKWh) {
        this.batterikapacitetKWh = batterikapacitetKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public int getWhPrKm() {
        return WhPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        WhPrKm = whPrKm;
    }
    @Override
    public String toString() {
        return "Brand: " + this.getMærke()+ " Model: "+ this.getModel()+ " Year:" + this.getÅrgang()+ " regNr: "+this.getRegNr();
    }
}
