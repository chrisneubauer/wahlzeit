package org.wahlzeit.model;

import java.util.HashMap;

/**
 * Holds instance with all astronomyTypes. Returns object if existent, otherwise creates a new one
 * @author Christoph Neubauer
 */
public class AstronomyManager extends PhotoManager {
    protected static final AstronomyManager instance = new AstronomyManager();

    private final HashMap<String, AstronomyType> astronomyTypes = new HashMap<>();

    /**
     * @methodtype get
     */
    public AstronomyType getAstronomyType(String name) {
        if (astronomyTypes.containsKey(name)) {
            return astronomyTypes.get(name);
        }
        synchronized (astronomyTypes) {
            AstronomyType newType = new AstronomyType();
            astronomyTypes.put(name, newType);
            return newType;
        }
    }

    /**
     * @methodtype get
     */
    public AstronomyType getAstronomyType(String name, StarType type, double diameter, double temperature, double mass, double rotation,
                                          ChemicalComposition chemicalComposition, long age) {
        if (astronomyTypes.containsKey(name)) {
            return astronomyTypes.get(name);
        }
        synchronized (astronomyTypes) {
            AstronomyType newType = new AstronomyType(name, type, diameter, temperature, mass, rotation,
             chemicalComposition, age);
            astronomyTypes.put(name, newType);
            return newType;
        }
    }

    /**
     * @methodtype create
     */
    public Astronomy createAstronomy(AstronomyType astronomyType) {
        Astronomy astronomy = new Astronomy(astronomyType);
        astronomyType.addInstance(astronomy);
        return astronomy;
    }
}
