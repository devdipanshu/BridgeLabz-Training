package dynamiconlinemarketplace;

class DiscountUtil {

    static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        product.price = product.price - (product.price * percentage / 100);
    }
}
