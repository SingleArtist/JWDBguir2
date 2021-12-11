package by.bsuir.Yanushkevich.lab02.DAO.Factory.impl;

import by.bsuir.Yanushkevich.lab02.Entity.Appliance;
import by.bsuir.Yanushkevich.lab02.Service.Fridge;
import by.bsuir.Yanushkevich.lab02.Entity.Enums.Color;
import by.bsuir.Yanushkevich.lab02.Entity.Enums.Company;
import by.bsuir.Yanushkevich.lab02.Entity.Feature.SearchFeature;
import by.bsuir.Yanushkevich.lab02.DAO.ExceptionMessageConstant;
import by.bsuir.Yanushkevich.lab02.DAO.Factory.ApplianceFactory;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class FridgeFactory extends ApplianceFactory {

    int price;
    Color color;
    Company company;

    @Override
    public Appliance createAppliance(NodeList nodeList) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String value = nodeList.item(i).getTextContent();

                SearchFeature.Fridge tabletPCSearchCriteria = SearchFeature.Fridge.valueOf(nodeList.item(i).getNodeName().toUpperCase());

                switch (tabletPCSearchCriteria) {
                    case PRICE:
                        price = Integer.parseInt(value);
                        break;
                    case COLOR:
                        color = Color.valueOf(value);
                        break;
                    case COMPANY:
                        company = Company.valueOf(value);
                        break;
                    default:
                        throw new IllegalArgumentException(ExceptionMessageConstant.ILLEGAL_ARGUMENT_CRITERIA_EXCEPTION_MSG);
                }
            }
        }
        return new Fridge(price, color, company);
    }

}
