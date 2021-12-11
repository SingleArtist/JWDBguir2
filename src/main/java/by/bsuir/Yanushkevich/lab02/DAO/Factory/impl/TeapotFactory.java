package by.bsuir.Yanushkevich.lab02.DAO.Factory.impl;

import by.bsuir.Yanushkevich.lab02.Entity.Appliance;
import by.bsuir.Yanushkevich.lab02.Entity.Teapot;
import by.bsuir.Yanushkevich.lab02.Entity.Enums.Color;
import by.bsuir.Yanushkevich.lab02.Entity.Feature.SearchFeature;
import by.bsuir.Yanushkevich.lab02.DAO.ExceptionMessageConstant;
import by.bsuir.Yanushkevich.lab02.DAO.Factory.ApplianceFactory;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * TeapotFactory class.
 * @author Yanushkevich Ihar
 */
public class TeapotFactory extends ApplianceFactory {

    int price;
    /**
     * The Power field.
     */
    double power;
    /**
     * The Weight field.
     */
    double weight;
    /**
     * The Bulk field.
     */
    double bulk;
    /**
     * The Color field.
     */
    Color color;


    /**
     * Method for create appliance
     *
     * @param nodeList the node list
     * @return appliance {@link Appliance}
     */
    @Override
    public Appliance createAppliance(NodeList nodeList) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String value = nodeList.item(i).getTextContent();

                SearchFeature.Teapot teapotSearchFeature
                        = SearchFeature.Teapot.valueOf(nodeList.item(i).getNodeName().toUpperCase());

                switch (teapotSearchFeature) {
                    case PRICE:
                        price = Integer.parseInt(value);
                        break;
                    case POWER:
                        power = Double.parseDouble(value);
                        break;
                    case WEIGHT:
                        weight = Double.parseDouble(value);
                        break;
                    case BULK:
                        bulk = Double.parseDouble(value);
                        break;
                    case COLOR:
                        color = Color.valueOf(value);
                        break;
                    default:
                        throw new IllegalArgumentException(ExceptionMessageConstant.ILLEGAL_ARGUMENT_CRITERIA_EXCEPTION_MSG);
                }

            }
        }
        return new Teapot(price, power, weight, bulk, color);
    }

}
