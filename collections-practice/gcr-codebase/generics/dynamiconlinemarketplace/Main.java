package dynamiconlinemarketplace;

public class Main {

    public static void main(String[] args) {

        Product<BookCategory> book =
            new Product<>("Java Book", 500, new BookCategory());

        Product<ClothingCategory> shirt =
            new Product<>("T-Shirt", 1200, new ClothingCategory());

        Product<GadgetCategory> phone =
            new Product<>("Smartphone", 20000, new GadgetCategory());

        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(phone, 5);

        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        catalog.showAll();
    }
}
