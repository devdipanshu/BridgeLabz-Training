package hotel_reservation_system;

class SeasonalPricing implements PricingStrategy {
    public double calculatePrice(double basePrice, int nights) {
        return basePrice * nights * 1.2; 
    }
}