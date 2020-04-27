public class Order {
    private double dimension = 10;
    private double weight= 50;
    private double productsCost = 100;

    public Order(double dimension, double weight)
    {
        this.dimension=dimension;
        this.weight = weight;
    }

    public double getDimension(){return dimension;}
    public double getWeight(){return weight;}

    public double getTotalCost(CostCalculator costCalculator, IShippingMethod shippingMethod)
    {
        return productsCost + costCalculator.calculateCost(this, shippingMethod);
    }
}
