package org.wahlzeit.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * This class holds all the attributes of an astronomical entity
 * @author Christoph Neubauer
 */
public class AstronomyType {

    private final List<Astronomy> instances = new LinkedList<>();

    private StarType type;
    private String name;
    private Location location;
    private double diameter;
    private double temperature;
    private double mass;
    private double rotation;
    private ChemicalComposition chemicalComposition;
    private long age;

    /**
     * @methodtype get
     */
    public List<Astronomy> getInstances() {
        return Collections.unmodifiableList(instances);
    }

    public void addInstance(Astronomy astronomy) {
        instances.add(astronomy);
    }

    public void removeInstance(Astronomy astronomy) {
        instances.remove(astronomy);
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

    /**
     * @methodtype get
     */
    public StarType getType() {
        return type;
    }

    /**
     * @methodtype set
     */
    public void setType(StarType type) {
        this.type = type;
    }

    /**
     * @methodtype constructor
     */
    public AstronomyType(String name, StarType type, double diameter, double temperature, double mass, double rotation,
                          ChemicalComposition chemicalComposition, long age) {
        super();
        this.name = name;
        this.type = type;
        this.diameter = diameter;
        this.temperature = temperature;
        this.mass = mass;
        this.rotation = rotation;
        this.chemicalComposition = chemicalComposition;
        this.age = age;
    }

    /**
     * @methodtype constructor
     */
    public AstronomyType(String name) {
        super();
        this.name = name;
        this.type = StarType.STAR;
        this.diameter = 0.0;
        this.temperature = 0;
        this.mass = 0;
        this.rotation = 0.0;
        this.chemicalComposition = new ChemicalComposition();
        this.age = 0;
    }

    /**
     * @methodtype constructor
     */
    public AstronomyType() {
        super();
        this.type = StarType.STAR;
        this.diameter = 0.0;
        this.temperature = 0;
        this.mass = 0;
        this.rotation = 0.0;
        this.chemicalComposition = new ChemicalComposition();
        this.age = 0;
    }
}
