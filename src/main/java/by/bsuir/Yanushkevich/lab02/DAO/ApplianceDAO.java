package by.bsuir.Yanushkevich.lab02.DAO;

import by.bsuir.Yanushkevich.lab02.Entity.Appliance;
import by.bsuir.Yanushkevich.lab02.Entity.Feature.Feature;
import by.bsuir.Yanushkevich.lab02.Exception.ResourceException;

import java.util.List;

/**
 * ApplianceDAO interface of an applianceDao class.
 * @author Yanushkevich Ihar
 */
public interface ApplianceDAO {

    /**
     * Finds all appliances by given criteria.
     *
     * @param feature {@link Feature}
     * @return list of appliance
     * @throws ResourceException exception
     */
    List<Appliance> find(Feature feature) throws ResourceException;
}
