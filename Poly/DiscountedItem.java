public class DiscountedItem extends Item
{
    private double discount;

    public DiscountedItem(String string, double d, double e) {
        super();
        discount = e;
    }

    public double getDiscount() {return discount;}
    public void setDiscount(double discount) {this.discount = discount;}

    public String toString() {return super.toString() + " (-$" + super.valueToString(discount) + ")";}

}
