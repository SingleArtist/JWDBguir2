package by.bsuir.Yanushkevich.lab02.Entity.Feature;

/**
 * SearchFeature class.
 * Contains all search feature.
 * @author Yanushkevich Ihar
 */
public final class SearchFeature {

    /**
     * Contains General search feature
     */
    public enum General {
        NAME, PRICE
    }

    /**
     * Contains Teapot search feature
     */
    public enum Teapot {
        PRICE, POWER, WEIGHT, BULK, COLOR
    }

    /**
     * Contains Laptop search feature
     */
    public enum Laptop {
        PRICE, BATTERY_CAPACITY, OS, MEMORY_ROM, CPU, DISPLAY_INCHES
    }


    /**
     * Contains Smartphone search feature
     */
    public enum Fridge {
        PRICE, COLOR, COMPANY
    }

    /**
     * Contains Speakers search feature
     */
    public enum Mouse {
        PRICE, WEIGHT, LENGTH, HEIGHT, WIDTH, DPI
    }

    /**
     * Contains PriceFilter search feature
     */
    public enum PriceFilter {
        MORE_THAN_CURRENT_PRICE, LESS_THAN_CURRENT_PRICE, EQUAL_CURRENT_PRICE
    }

    /**
     * Private constructor.
     */
    private SearchFeature() {
    }
}

