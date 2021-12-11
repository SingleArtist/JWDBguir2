package by.bsuir.Yanushkevich.lab02.Service.Validator.impl;

import by.bsuir.Yanushkevich.lab02.Common.ApplianceNameConstant;
import by.bsuir.Yanushkevich.lab02.Service.Validator.FeatureValidator;

/**
 * ApplianceNameValidator class.
 * @author Yanushkevich Ihar
 */
public class ApplianceNameValidator implements FeatureValidator {

    /**
     * Method that checks valid of criteria name.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            switch ((String) value) {
                case ApplianceNameConstant.LAPTOP:
                case ApplianceNameConstant.TEAPOT:
                case ApplianceNameConstant.FRIDGE:
                case ApplianceNameConstant.DISHWASHER:
                    return true;
                default:
                    return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
}
