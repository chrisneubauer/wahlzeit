package org.wahlzeit;
/**
 * @COPYRIGHT (C) 2015 Schenker AG
 *
 * All rights reserved
 */

/**
 * The annotation class is used for homework purposes (CW09)
 * @author Christoph
 */
public @interface Pattern {
    String name() default "";
    String[] participants() default "";
}
