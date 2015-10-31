package org.wahlzeit.model;

/**
 * Contains chemical compositions of stars
 * @author Christoph
 */
public class ChemicalComposition {
    private double hydrogen;
    private double helium;
    private double carbon;
    private double neon;
    private double oxygen;
    private double silicium;
    private double beryllium;

    /**
    * @methodtype constructor
    */
    public ChemicalComposition(double hydrogen, double helium, double carbon, double neon, double oxygen, double silicium, double beryllium) {
        this.hydrogen = hydrogen;
        this.helium = helium;
        this.carbon = carbon;
        this.neon = neon;
        this.oxygen = oxygen;
        this.silicium = silicium;
        this.beryllium = beryllium;
    }

    /**
     * @methodtype get
     */
    public double getHydrogen() {
        return hydrogen;
    }

    /**
     * @methodtype set
     */
    public void setHydrogen(double hydrogen) {
        this.hydrogen = hydrogen;
    }

    /**
     * @methodtype get
     */
    public double getHelium() {
        return helium;
    }

    /**
     * @methodtype set
     */
    public void setHelium(double helium) {
        this.helium = helium;
    }

    /**
     * @methodtype get
     */
    public double getCarbon() {
        return carbon;
    }

    /**
     * @methodtype set
     */
    public void setCarbon(double carbon) {
        this.carbon = carbon;
    }

    /**
     * @methodtype get
     */
    public double getNeon() {
        return neon;
    }

    /**
     * @methodtype set
     */
    public void setNeon(double neon) {
        this.neon = neon;
    }

    /**
     * @methodtype get
     */
    public double getOxygen() {
        return oxygen;
    }

    /**
     * @methodtype set
     */
    public void setOxygen(double oxygen) {
        this.oxygen = oxygen;
    }

    /**
     * @methodtype get
     */
    public double getSilicium() {
        return silicium;
    }

    /**
     * @methodtype set
     */
    public void setSilicium(double silicium) {
        this.silicium = silicium;
    }

    /**
     * @methodtype get
     */
    public double getBeryllium() {
        return beryllium;
    }

    /**
     * @methodtype set
     */
    public void setBeryllium(double beryllium) {
        this.beryllium = beryllium;
    }
}
