package by.bsuir.Yanushkevich.lab02.Service.impl;

import by.bsuir.Yanushkevich.lab02.Exception.ResourceException;
import by.bsuir.Yanushkevich.lab02.Exception.ServiceException;
import by.bsuir.Yanushkevich.lab02.Service.Validator.Validator;
import by.bsuir.Yanushkevich.lab02.DAO.ExceptionMessageConstant;
import by.bsuir.Yanushkevich.lab02.DAO.ApplianceDAO;
import by.bsuir.Yanushkevich.lab02.DAO.DAOFactory;
import by.bsuir.Yanushkevich.lab02.Entity.Appliance;
import by.bsuir.Yanushkevich.lab02.Entity.Feature.Feature;
import by.bsuir.Yanushkevich.lab02.Service.ApplianceService;

import java.util.List;

/**
 * ApplianceServiceImpl class that works with appliances DAO.
 *
 * @author Yanushkevich Ihar
 */
public class ApplianceServiceImpl implements ApplianceService {

    /**
     * Method that find appliances by criteria.
     *
     * @param feature the criteria
     * @return appliances
     * @throws ServiceException exception
     */
    @Override
    public List<Appliance> find(Feature feature) throws ServiceException {
        if (!Validator.isCriteriaValid(feature)) {
            throw new ServiceException(ExceptionMessageConstant.INVALID_CRITERIA_EXCEPTION_MSG);
        }

        List<Appliance> appliances;
        try {
            DAOFactory factory = DAOFactory.getInstance();
            ApplianceDAO applianceDAO = factory.getApplianceDAO();
            appliances = applianceDAO.find(feature);
        } catch (ResourceException e) {
            throw new ServiceException(e);
        }
        return appliances;
    }

}
