package fruit;

public class Orange {
    private int weightInOunces;
    private int pricePerPoundInCents;

    public Orange(int weightInOunces, int pricePerPoundInCents) {
        this.weightInOunces = weightInOunces;
        this.pricePerPoundInCents = pricePerPoundInCents;
    }

    public int getWeightInOunces() {
        return weightInOunces;
    }

    public void setWeightInOunces(int weightInOunces) {
        this.weightInOunces = weightInOunces;
    }

    public int getPricePerPoundInCents() {
        return pricePerPoundInCents;
    }

    public void setPricePerPoundInCents(int pricePerPoundInCents) {
        this.pricePerPoundInCents = pricePerPoundInCents;
    }
}
