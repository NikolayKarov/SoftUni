package HotelReservation;

public enum Discount {
    VIP(0.20),
    SECOND_VISION(0.10),
    NONE(0);

    private double percentage;

    Discount(double percentage) {
        this.percentage = percentage;
    }

    public static Discount parseDiscount(String discount) {
        switch (discount) {
            case "VIP":
                return VIP;
            case "SecondVisit":
                return SECOND_VISION;
            case "None":
                return NONE;
            default:
                throw new IllegalArgumentException("Unknown discount type" + discount);
        }
    }

    public double getPercentage() {
        return percentage;
    }
}
