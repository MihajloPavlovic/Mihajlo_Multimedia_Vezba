
package media;


public class Radio {
    
    private double fmFrequency = 91.8;
    private double amFrequency = 600;
    private char bandAM = 'A';
    private char bandFM = 'F';
    
    public double getFmFrequency() {
        return this.fmFrequency;
    }
    
    public void setFmFrequency(double newFmFrequency) {
        this.fmFrequency = newFmFrequency;
    }
    
    public double getAmFrequency() {
        return this.amFrequency;
    }
    
    public void setAmFrequency(double newAmFrequency) {
        this.amFrequency = newAmFrequency;
    }
    
    public char getBandAm() {
        return this.bandAM;
    }
    
    public void setBandAm(char newBandAm) {
        this.bandAM = newBandAm;
    }
    
    public char getBandFm() {
        return this.bandFM;
    }
    
    public void setBandFm(char newBandFm) {
        this.bandFM = newBandFm;
    }
    
    public Radio(double fmFrequency, double amFrequency, char bandAm, char bandFm) {
        this.fmFrequency = fmFrequency;
        this.amFrequency = amFrequency;
        this.bandAM = bandAm;
        this.bandFM = bandFm;
    }
    
    public void printAttributes() {
        System.out.println("FM frequency: " + this.getFmFrequency());
        System.out.println("AM frequency: " + this.getAmFrequency());
        System.out.println("Band AM: " + this.getBandAm());
        System.out.println("Band FM: " + this.getBandFm());
    }
}
