package by.bsuir.Yanushkevich.lab02.Service.Validator.impl;

import by.bsuir.Yanushkevich.lab02.Entity.Enums.Company;
import by.bsuir.Yanushkevich.lab02.Service.Validator.FeatureValidator;

/**
 * ColorValidator class.
 * @author Yanushkevich Ihar
 */
public class CompanyValidator implements FeatureValidator {

    /**
     * Method that checks valid of company.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            Company.valueOf((String) value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}