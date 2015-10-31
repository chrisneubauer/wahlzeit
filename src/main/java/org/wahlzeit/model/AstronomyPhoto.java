package org.wahlzeit.model;

/**
 * AstronomyPhoto contains specific information about pictures regarding stars and other astronomical entities
 * @author Christoph Neubauer
 */
public class AstronomyPhoto extends Photo {
    private AstronomyType type;
    private double diameter;
    private double temperature;
    private double mass;
    private double rotation;
    private ChemicalComposition chemicalComposition;
    private long age;

    /**
     * @methodtype constructor
     */
    public AstronomyPhoto(AstronomyType type, double diameter, double temperature, double mass, double rotation,
                          ChemicalComposition chemicalComposition, long age) {
        super();
        this.type = type;
        this.diameter = diameter;
        this.temperature = temperature;
        this.mass = mass;
        this.rotation = rotation;
        this.chemicalComposition = chemicalComposition;
        this.age = age;
    }

    /**
     * @methodtype get
     */
    public double getDiameter() {
        return diameter;
    }

    /**
     * @methodtype set
     */
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    /**
     * @methodtype get
     */
    public double getTemperature() {
        return temperature;
    }

    /**
     * @methodtype set
     */
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    /**
     * @methodtype get
     */
    public double getMass() {
        return mass;
    }

    /**
     * @methodtype set
     */
    public void setMass(double mass) {
        this.mass = mass;
    }

    /**
     * @methodtype get
     */
    public double getRotation() {
        return rotation;
    }

    /**
     * @methodtype set
     */
    public void setRotation(double rotation) {
        this.rotation = rotation;
    }

    /**
     * @methodtype get
     */
    public ChemicalComposition getChemicalComposition() {
        return chemicalComposition;
    }

    /**
     * @methodtype set
     */
    public void setChemicalComposition(ChemicalComposition chemicalComposition) {
        this.chemicalComposition = chemicalComposition;
    }

    /**
     * @methodtype get
     */
    public long getAge() {
        return age;
    }

    /**
     * @methodtype set
     */
    public void setAge(long age) {
        this.age = age;
    }

    /**
     * @methodtype get
     */
    public AstronomyType getType() {
        return type;
    }

    /**
     * @methodtype set
     */
    public void setType(AstronomyType type) {
        this.type = type;
    }
}
