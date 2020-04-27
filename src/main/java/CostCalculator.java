public class CostCalculator {
    public double calculateCost(Order order, IShippingMethod  shippingMethod)    {
        switch (shippingMethod)
        {
            case FanCurier:
                return getFanCurierCost(order);
            case UgerntCargus:
                return getUrgentCargusCost(order);
            case SameDay:
               return getSameDatCost(order);
            default:
                return -1;
        }

    }

    public double getFanCurierCost(Order order) {
        double totalCost = 15;
        double excessDimension = order.getDimension() - 10;
        double excessWeight = order.getWeight() - 10;
        if (excessDimension > 0)
            totalCost += excessDimension;
        if (excessWeight > 0)
            totalCost += excessWeight;

        return totalCost;
    }

    public double getUrgentCargusCost(Order order) {
        double totalCost = 12;
        double excessWeight = order.getWeight() - 10;
        if (excessWeight > 0)
            totalCost += excessWeight * 0.5;
        return totalCost;
    }

    public double getSameDatCost(Order order)
    {
        return  23;
    }
}
