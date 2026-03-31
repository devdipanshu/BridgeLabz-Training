package hotel_reservation_system;

interface PricingStrategy {
    double calculatePrice(double basePrice, int nights);
}
