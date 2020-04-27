public class FanCurierCostMethod implements IShippingCostCalculator {
    private double dimensionExcessValue = 10;
    private double weightExcessValue = 10;

    public double getCost(Order order) {
        double totalCost = 15;
        double excessDimension = order.getDimension() - dimensionExcessValue;
        double excessWeight = order.getWeight() - dimensionExcessValue;
        if (excessDimension > 0)
            totalCost += excessDimension;
        if (excessWeight > 0)
            totalCost += excessWeight;

        return totalCost;
    }
}
