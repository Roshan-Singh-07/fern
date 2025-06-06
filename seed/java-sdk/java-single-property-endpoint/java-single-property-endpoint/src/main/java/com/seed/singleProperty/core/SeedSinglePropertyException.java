/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seed.singleProperty.core;

/**
 * This class serves as the base exception for all errors in the SDK.
 */
public class SeedSinglePropertyException extends RuntimeException {
    public SeedSinglePropertyException(String message) {
        super(message);
    }

    public SeedSinglePropertyException(String message, Exception e) {
        super(message, e);
    }
}
