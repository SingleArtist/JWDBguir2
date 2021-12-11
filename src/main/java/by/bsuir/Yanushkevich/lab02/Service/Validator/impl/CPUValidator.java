package by.bsuir.Yanushkevich.lab02.Service.Validator.impl;

import by.bsuir.Yanushkevich.lab02.Entity.Enums.CPU;
import by.bsuir.Yanushkevich.lab02.Service.Validator.FeatureValidator;

/**
 * CPUValidator class.
 * @author Yanushkevich Ihar
 */
public class CPUValidator implements FeatureValidator {

    /**
     * Method that checks valid of cpu.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            CPU.valueOf((String) value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
