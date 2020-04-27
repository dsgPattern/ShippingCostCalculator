public class Main {
    public static void main(String[] args){
        Order order = new Order(12, 30);
        CostCalculator costCalculator = new CostCalculator();

        System.out.println(costCalculator.calculateCost(order, IShippingMethod.FanCurier));
        System.out.println(order.getTotalCost(new FanCurierCostMethod()));
        System.out.println(order.getTotalCost(new UrgentCargusCostMethod()));
        System.out.println(order.getTotalCost(new SamedayCostMethod()));
    }
}
