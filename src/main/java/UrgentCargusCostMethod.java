public class UrgentCargusCostMethod implements IShippingCostCalculator {
    public double getCost(Order order) {
        double totalCost = 12;
        double excessWeight = order.getWeight() - 10;
        if (excessWeight > 0)
            totalCost += excessWeight * 0.5;
        return totalCost;
    }
}
