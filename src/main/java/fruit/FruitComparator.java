package fruit;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit> {
    @Override
    public int compare(Fruit fruit1, Fruit fruit2) {
        // First by weight
        if (fruit1.getWeightInOunces() == fruit2.getWeightInOunces()) {
            // then by cost
            return (fruit1.getPriceInCents() - fruit2.getPriceInCents());
        } else {
            return (fruit1.getWeightInOunces() - fruit2.getWeightInOunces());
        }
    }
}