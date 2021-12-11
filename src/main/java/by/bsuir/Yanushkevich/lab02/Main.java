package by.bsuir.Yanushkevich.lab02;

/*Напишите приложение, которое предоставляет информацию
об товарах бытовой техники в магазине (холодильники,
чайники и др.). Информация о товарах хранится в xml-файле,
каждая категория товаров отличается от другой свойствами.
Напишите код, который позволяет отыскать все чайники и
самый дешевый товар.*/

import by.bsuir.Yanushkevich.lab02.Common.ApplianceNameConstant;
import by.bsuir.Yanushkevich.lab02.Entity.Appliance;
import by.bsuir.Yanushkevich.lab02.Entity.Feature.Feature;
import by.bsuir.Yanushkevich.lab02.Entity.Feature.SearchFeature;
import by.bsuir.Yanushkevich.lab02.Exception.ResourceException;
import by.bsuir.Yanushkevich.lab02.Exception.ServiceException;
import by.bsuir.Yanushkevich.lab02.Service.ApplianceService;
import by.bsuir.Yanushkevich.lab02.Service.ServiceFactory;

import java.util.List;

/**
 * The type by.bsuir.Yanushkevich.Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws ServiceException  the service exception
     * @throws ResourceException the resource exception
     */
    public static void main(String[] args) throws ServiceException, ResourceException {
        List<Appliance> appliances;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        Feature featureFridge = new Feature(ApplianceNameConstant.FRIDGE);
        featureFridge.add(SearchFeature.Fridge.COLOR.name(), "SILVER");
        featureFridge.add(SearchFeature.Fridge.COMPANY.name(), "Samsung");
        appliances = service.find(featureFridge);
        PrinterAppliance.print(appliances);

        Feature featureLaptop = new Feature(ApplianceNameConstant.LAPTOP);
        featureLaptop.add(SearchFeature.PriceFilter.LESS_THAN_CURRENT_PRICE.name(), 10000.0);
        appliances = service.find(featureLaptop);
        PrinterAppliance.print(appliances);

        Feature featureTeapot = new Feature(ApplianceNameConstant.TEAPOT);
        featureTeapot.add(SearchFeature.Teapot.POWER.name(), 1000.0);
        featureTeapot.add(SearchFeature.Teapot.BULK.name(), 2.0);
        appliances = service.find(featureTeapot);
        PrinterAppliance.print(appliances);

    }
}
