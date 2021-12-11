package by.bsuir.Yanushkevich.lab02.Service.Validator.impl;

import by.bsuir.Yanushkevich.lab02.Entity.Enums.OS;
import by.bsuir.Yanushkevich.lab02.Service.Validator.FeatureValidator;

/**
 * OSValidator class.
 * @author Yanushkevich Ihar
 */
public class OSValidator implements FeatureValidator {

    /**
     * Method that checks valid of os.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            OS.valueOf((String) value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
