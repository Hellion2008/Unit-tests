package seminars.first.Shop;

import java.util.Comparator;

public class CostComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.getCost(), o2.getCost());
    }
}
