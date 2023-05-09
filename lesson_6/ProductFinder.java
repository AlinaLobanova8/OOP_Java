package OOP_Java.lesson_6;

public class ProductFinder {
    private ProductInventory<HotDrink> products;

    public ProductFinder(ProductInventory<HotDrink> products) {
        this.products = products;
    }

    public HotDrink findProduct(String productName, Integer productVolume) {
        for (HotDrink product : products.getProducts()) {
            if (product.getName().equals(productName) && product.getVolume().equals(productVolume)) {
                return product;
            }
        }
        return null;
    }
}
