package by.bsuir.Yanushkevich.lab02.Service.Validator.impl;

import by.bsuir.Yanushkevich.lab02.Service.Validator.FeatureValidator;

/**
 * DoubleValidator class.
 * @author Yanushkevich Ihar
 */
public class DoubleValidator implements FeatureValidator {

    /**
     * Method that checks valid of double.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            return (Double) value > 0;
        } else {
            return false;
        }
    }

}
