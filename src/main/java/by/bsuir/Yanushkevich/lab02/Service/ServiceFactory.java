package by.bsuir.Yanushkevich.lab02.Service;

import by.bsuir.Yanushkevich.lab02.Service.impl.ApplianceServiceImpl;

/**
 * ServiceFactory class.
 * @author Yanushkevich Ihar
 */
public final class ServiceFactory {

    private static final ServiceFactory instance = new ServiceFactory();
    private final ApplianceService applianceService = new ApplianceServiceImpl();

    private ServiceFactory() {
    }

    /**
     * Gets appliance service.
     *
     * @return the appliance service
     */
    public ApplianceService getApplianceService() {
        return applianceService;
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static ServiceFactory getInstance() {
        return instance;
    }

}
