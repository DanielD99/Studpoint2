public class DieselBil extends Bil {
    private boolean harPartikelfilter;
    private float kmPrL;


    public DieselBil(int regNr, String mærke, String model, int årgang, int antalDøre, boolean harPartikelfilter, float kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.harPartikelfilter = harPartikelfilter;
        this.kmPrL = kmPrL;
    }

    public double beregnGrønEjerafgift() {
        int partikelUdledningsAfgift = 1000;
        if (this.harPartikelfilter) {
            partikelUdledningsAfgift= 0;
        }
        if (this.kmPrL > 20) {
            return 330 + 130+ partikelUdledningsAfgift;

        } else if (this.kmPrL > 15) {
            return 1050 + 1390+ partikelUdledningsAfgift;

        } else if (this.kmPrL > 10) {
            return 2340 + 1850+ partikelUdledningsAfgift;
        } else if (this.kmPrL > 5) {
            return 5500 + 2770+ partikelUdledningsAfgift;
        } else {
            return 10470 + 15260+ partikelUdledningsAfgift;

        }
    }

    public boolean isHarPartikelfilter() {
        return harPartikelfilter;
    }

    public void setHarPartikelfilter(boolean harPartikelfilter) {
        this.harPartikelfilter = harPartikelfilter;
    }

    public float getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(float kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "Brand: " + this.getMærke()+ " Model: "+ this.getModel()+ " Year:" + this.getÅrgang()+ " regNr: "+this.getRegNr();
    }
}
