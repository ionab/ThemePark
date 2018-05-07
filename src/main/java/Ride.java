public abstract class Ride {
    private double price;
    private int min_height;
    Customer customer;


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

    public boolean checkTallEnough(Customer customer) {
        return customer.getHeight() >= this.min_height;
    }

    public boolean checkHasMoney(Customer customer){
        return customer.getMoney() >= this.price;
    }

    public boolean checkCanRide(Customer customer){
        return (checkTallEnough(customer) && checkHasMoney(customer));
    }

//   refactored above.
//    public boolean checkCanRide(Customer customer) {
//        if ((customer.getMoney() >= this.price) && (customer.getHeight() >= this.min_height)){
//            return true;
//        }
//        return false;
//    }
}
