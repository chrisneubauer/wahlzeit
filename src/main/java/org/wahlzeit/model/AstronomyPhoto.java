package org.wahlzeit.model;

import com.googlecode.objectify.annotation.Subclass;

/**
 * AstronomyPhoto contains specific information about pictures regarding stars and other astronomical entities
 * @author Christoph Neubauer
 */
@Subclass
public class AstronomyPhoto extends Photo {
    private Astronomy astronomy;

    /**
     * @methodtype constructor
     */
    public AstronomyPhoto(Astronomy astronomy) {
        this.astronomy = astronomy;
    }

    /**
     * @methodtype constructor
     */
    public AstronomyPhoto() {
        super();
    }

    /**
     * @methodtype constructor
     */
    public AstronomyPhoto(PhotoId id) {
        super(id);
    }

    /**
     * @methodtype get
     */
    public Astronomy getAstronomy() {
        return astronomy;
    }

    /**
     * @methodtype set
     */
    public void setAstronomy(Astronomy astronomy) {
        this.astronomy = astronomy;
    }
}
