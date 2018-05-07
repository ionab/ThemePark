public abstract class Ride {
    private double price;
    private int min_height;

    public Ride(double price, int min_height) {
        this.price = price;
        this.min_height = min_height;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMin_height() {
        return min_height;
    }

    public void setMin_height(int min_height) {
        this.min_height = min_height;
    }
}
