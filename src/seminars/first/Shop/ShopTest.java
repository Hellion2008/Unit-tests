package seminars.first.Shop;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №2");
        List<Product> products = new ArrayList<>();
        products.add(new Product(100, "111"));
        products.add(new Product(300, "222"));
        products.add(new Product(1000, "333"));
        products.add(new Product(500, "444"));
        products.add(new Product(700, "555"));

        Shop shop = new Shop();
        shop.setProducts(products);

        System.out.println("Max: " + shop.getMostExpensiveProduct().getCost());
        shop.sortProductsByPrice();
        System.out.println("Products: ");
        for (Product product: shop.getProducts()){
            System.out.println(product.getTitle() + " - " + product.getCost());
        }

        String[] titles = new String[shop.getProducts().size()];
        for (int i = 0; i < titles.length; i++){
            titles[i] = shop.getProducts().get(i).getTitle();
        }

        assertThat(shop.getProducts())
                .isNotEmpty()
                .hasSize(5)
                .isNotInstanceOf(Product.class);
        assertThat(titles)
                .hasSize(5)
                .contains("222","444")
                .doesNotContain("666")
                .doesNotHaveDuplicates();

        assertThat(shop.sortProductsByPrice())
                .isNotEmpty()
                .hasSize(5)
                .doesNotContainNull()
                .isSortedAccordingTo(new CostComparator())
                .hasOnlyElementsOfType(Product.class);

        assertThat(shop.getMostExpensiveProduct().getCost())
               .isEqualTo(1000)
               .isGreaterThan(shop.getProducts().get(0).getCost());
    }
    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */

}