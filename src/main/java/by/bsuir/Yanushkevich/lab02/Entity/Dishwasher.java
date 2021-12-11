package by.bsuir.Yanushkevich.lab02.Entity;

import by.bsuir.Yanushkevich.lab02.Common.ApplianceNameConstant;
import by.bsuir.Yanushkevich.lab02.Common.SearchFeatureConstant;
import by.bsuir.Yanushkevich.lab02.Entity.Enums.Color;
import by.bsuir.Yanushkevich.lab02.Entity.Enums.Company;

import java.util.Objects;

/**
 * Smartphone class entity.
 * @author Yanushkevich Ihar
 */
public class Dishwasher extends Appliance {
    /**
     * Field color of smartphone
     */
    private Color color;
    /**
     * Field company of smartphone
     */
    private Company company;
    /**
     * Instantiates a new Tablet pc.
     */
    public Dishwasher() {
    }

    /**
     * Instantiates a new Tablet pc.
     *
     * @param price               the price
     * @param color               the color
     * @param company             the company
     */
    public Dishwasher(double price,
                  Color color,
                  Company company) {
        super(price);
        this.color = color;
        this.company = company;
    }

    @Override
    public boolean isMatchesCriteria(String criteriaName, Object value) {
        switch (criteriaName) {
            case SearchFeatureConstant.PRICE:
            case SearchFeatureConstant.MORE_THAN_CURRENT_PRICE:
            case SearchFeatureConstant.LESS_THAN_CURRENT_PRICE:
            case SearchFeatureConstant.EQUAL_CURRENT_PRICE:
                return super.isMatchesCriteria(criteriaName, value);
            case SearchFeatureConstant.APPLIANCE_NAME:
                return ApplianceNameConstant.FRIDGE.equals(value);
            case SearchFeatureConstant.COLOR:
                return color.equals(Color.valueOf((String) value));
            case SearchFeatureConstant.COMPANY:
                return company.equals(Company.valueOf((String) value));
            default:
                return false;
        }
    }

    /**
     * Gets color value
     *
     * @return color color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Gets company value
     *
     * @return company company
     */
    public Company getCompany() {
        return company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dishwasher smartphone = (Dishwasher) o;
        return color == smartphone.color && company == smartphone.company;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color, company);
    }

    @Override
    public String toString() {
        return "Fridge [" +
                "price - " + super.getPrice() +
                " | color - " + color +
                " | company - " + company +
                ']';
    }
}

