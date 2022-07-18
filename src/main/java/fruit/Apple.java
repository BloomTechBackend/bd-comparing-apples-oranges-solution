package fruit;

public class Apple {

    public static final String[] APPLE_TYPES = {"FUJI","RED_DELICIOUS","GRANNY_SMITH"};
    private String type;
    private int weightInGrams;
    private int pricePerPoundInCents;

    public Apple(String type, int weightInGrams, int pricePerPoundInCents) {
        this.type = type;
        this.weightInGrams = weightInGrams;
        this.pricePerPoundInCents = pricePerPoundInCents;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(int weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public int getPricePerPoundInCents() {
        return pricePerPoundInCents;
    }

    public void setPricePerPoundInCents(int pricePerPoundInCents) {
        this.pricePerPoundInCents = pricePerPoundInCents;
    }
}
