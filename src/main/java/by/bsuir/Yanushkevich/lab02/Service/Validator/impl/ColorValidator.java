package by.bsuir.Yanushkevich.lab02.Service.Validator.impl;

import by.bsuir.Yanushkevich.lab02.Entity.Enums.Color;
import by.bsuir.Yanushkevich.lab02.Service.Validator.FeatureValidator;

/**
 * ColorValidator class.
 * @author Yanushkevich Ihar
 */
public class ColorValidator implements FeatureValidator {

    /**
     * Method that checks valid of color.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            Color.valueOf((String) value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
