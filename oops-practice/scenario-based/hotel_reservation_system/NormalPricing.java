package hotel_reservation_system;

class NormalPricing implements PricingStrategy {
    public double calculatePrice(double basePrice, int nights) {
        return basePrice * nights;
    }
}