package by.bsuir.Yanushkevich.lab02.Service;

import by.bsuir.Yanushkevich.lab02.Exception.ResourceException;
import by.bsuir.Yanushkevich.lab02.Exception.ServiceException;
import by.bsuir.Yanushkevich.lab02.Entity.Appliance;
import by.bsuir.Yanushkevich.lab02.Entity.Feature.Feature;

import java.util.List;

/**
 * ApplianceService interface of an ApplianceService class.
 * @author Yanushkevich Ihar
 */
public interface ApplianceService {

    /**
     * Method that finds list of appliance.
     *
     * @param feature the feature
     * @return the list
     * @throws ResourceException the resource exception
     * @throws ServiceException  the service exception
     */
    List<Appliance> find(Feature feature) throws ResourceException, ServiceException;

}
