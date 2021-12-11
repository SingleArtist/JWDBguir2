package by.bsuir.Yanushkevich.lab02.Service.Validator;

/**
 * CriteriaValidator interface.
 * @author Yanushkevich Ihar
 */
public interface FeatureValidator {

    /**
     * Validate value of a search criteria
     *
     * @param value - value to validate
     * @return true, if value is valid. Otherwise, false.
     */
    boolean isCriteriaValid(Object value);
}
