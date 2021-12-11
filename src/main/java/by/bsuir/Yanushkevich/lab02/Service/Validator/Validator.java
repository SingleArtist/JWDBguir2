package by.bsuir.Yanushkevich.lab02.Service.Validator;

import by.bsuir.Yanushkevich.lab02.Entity.Feature.Feature;

/**
 * Validator class.
 * @author Yanushkevich Ihar
 */
public class Validator {

    /**
     * Validates criteria by its SearchCriteria.
     *
     * @param feature - criteria to validate
     * @return true if criteria is valid. Otherwise, false.
     */
    public static boolean isCriteriaValid(Feature feature) {
        if (feature == null) {
            return false;
        }

        return feature.getFeatureMap().entrySet().stream().allMatch(
                entry -> FeatureValidatorFactory.getInstance()
                        .getValidator(entry.getKey())
                        .isCriteriaValid(entry.getValue()));
    }

}