package by.bsuir.Yanushkevich.lab02;

import by.bsuir.Yanushkevich.lab02.DAO.ExceptionMessageConstant;
import by.bsuir.Yanushkevich.lab02.Entity.Appliance;

import java.util.List;

/**
 * Class that print info of appliances.
 * @author Yanushkevich Ihar
 */
public class PrinterAppliance {

    /**
     * Method that prints information.
     *
     * @param appliances the appliances
     */
    public static void print(List<Appliance> appliances) {
        if (appliances == null) {
            System.out.println(ExceptionMessageConstant.APPLIANCES_LIST_NULL_EXCEPTION_MSG);
        } else if (appliances.isEmpty()) {
            System.out.println(ExceptionMessageConstant.APPLIANCES_LIST_EMPTY_EXCEPTION_MSG);
        } else {
            for (Appliance appliance : appliances) {
                System.out.println(appliance);
            }
        }
    }

}
