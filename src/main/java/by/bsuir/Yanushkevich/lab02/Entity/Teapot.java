package by.bsuir.Yanushkevich.lab02.Entity;

import by.bsuir.Yanushkevich.lab02.Common.ApplianceNameConstant;
import by.bsuir.Yanushkevich.lab02.Common.SearchFeatureConstant;
import by.bsuir.Yanushkevich.lab02.Entity.Enums.Color;

import java.util.Objects;

/**
 * Teapot class entity.
 * @author Yanushkevich Ihar
 */
public class Teapot extends Appliance {
    /**
     * Field powerConsumption of teapot
     */
    private double power;
    /**
     * Field weight of teapot
     */
    private double weight;
    /**
     * Field capacity of teapot
     */
    private double bulk;
    /**
     * Field color of teapot
     */
    private Color color;

    /**
     * Instantiates a new Teapot.
     */
    public Teapot() {
    }

    /**
     * Instantiates a new Teapot.
     *
     * @param price            the price
     * @param power            the power consumption
     * @param weight           the weight
     * @param bulk             the bulk
     */
    public Teapot(double price,
                double power,
                double weight,
                double bulk,
                Color color) {
        super(price);
        this.power = power;
        this.weight = weight;
        this.bulk = bulk;
        this.color = color;

    }

    @Override
    public boolean isMatchesCriteria(String featureName, Object value) {
        switch (featureName) {
            case SearchFeatureConstant.PRICE:
            case SearchFeatureConstant.MORE_THAN_CURRENT_PRICE:
            case SearchFeatureConstant.LESS_THAN_CURRENT_PRICE:
            case SearchFeatureConstant.EQUAL_CURRENT_PRICE:
                return super.isMatchesCriteria(featureName, value);
            case SearchFeatureConstant.APPLIANCE_NAME:
                return ApplianceNameConstant.TEAPOT.equals(value);
            case SearchFeatureConstant.POWER:
                return (double) value == power;
            case SearchFeatureConstant.WEIGHT:
                return (double) value == weight;
            case SearchFeatureConstant.BULK:
                return (double) value == bulk;
            case SearchFeatureConstant.COLOR:
                return color.equals(Color.valueOf((String) value));
            default:
                return false;
        }
    }

    /**
     * Gets power value
     *
     * @return power
     */
    public double getPower() {
        return power;
    }

    /**
     * Gets weight value
     *
     * @return width weight
     */
    public double getWidth() {
        return weight;
    }

    /**
     * Gets bulk value
     *
     * @return bulk bulk
     */
    public double getBulk() {
        return bulk;
    }
    /**
     * Gets color value
     *
     * @return color
     */
    public Color getColor() {
        return color;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teapot teapot = (Teapot) o;
        return Double.compare(teapot.power, power) == 0 && Double.compare(teapot.bulk, bulk) == 0 &&  Double.compare(teapot.weight, weight) == 0 && color == teapot.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), power, weight, bulk);
    }

    @Override
    public String toString() {
        return "Teapot [" +
                "price - " + super.getPrice() +
                " | power - " + power +
                " | weight - " + weight +
                " | bulk - " + bulk +
                " | color - " + color +
                ']';
    }
}
