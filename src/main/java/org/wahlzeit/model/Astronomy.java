package org.wahlzeit.model;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import org.wahlzeit.services.DataObject;

/**
 * This class contains attributes of an astronomical entity
 * @author Christoph Neubauer
 */
@Entity
public class Astronomy extends DataObject {
    @Id
    long id;

    private AstronomyType type;
    private String name;
    private Location location;
    private double diameter;
    private double temperature;
    private double mass;
    private double rotation;
    private ChemicalComposition chemicalComposition;
    private long age;

    /**
     * @methodtype constructor
     */
    private Astronomy() {}

    /**
     * @methodtype constructor
     */
    public Astronomy(AstronomyType type) {
        this.type = type;
    }

    public AstronomyPhoto createAstronomyPhoto() {
        return AstronomyPhotoFactory.getInstance().createPhoto();
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

    /**
     * @methodtype get
     */
    public String getName() {
        return name;
    }

    /**
     * @methodtype set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @methodtype get
     */
    public Location getLocation() {
        return location;
    }

    /**
     * @methodtype set
     */
    public void setLocation(Location location) {
        this.location = location;
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
}
