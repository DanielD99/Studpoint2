public class BenzinBil extends Bil {
    private int oktantal;
    private float kmPrL;


    public BenzinBil(int regNr, String mærke, String model, int årgang, int antalDøre, int oktantal, float kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.oktantal = oktantal;
        this.kmPrL = kmPrL;
    }

    public double beregnGrønEjerafgift() {
        if (this.kmPrL > 20) {
            return 330;

        } else if (this.kmPrL > 15) {
            return 1050;

        } else if (this.kmPrL > 10) {
            return 2340;
        } else if (this.kmPrL > 5) {
            return 5500;
        } else {
            return 10470;
        }
        }

        public int getOktantal () {
            return oktantal;
        }

        public void setOktantal ( int oktantal){
            this.oktantal = oktantal;
        }

        public float getKmPrL () {
            return kmPrL;
        }

        public void setKmPrL ( float kmPrL){
            this.kmPrL = kmPrL;
        }

        @Override
        public String toString () {
            return "Brand: " + this.getMærke() + " Model: " + this.getModel() + " Year:" + this.getÅrgang() + " regNr: " + this.getRegNr();
        }
    }