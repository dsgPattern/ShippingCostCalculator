public class Main {
    public static void main(String[] args){
        Order order = new Order(12, 30);
        CostCalculator costCalculator = new CostCalculator();

        System.out.println(costCalculator.calculateCost(order, IShippingMethod.FanCurier));
        System.out.println(order.getTotalCost(new CostCalculator(), IShippingMethod.FanCurier));
        System.out.println(order.getTotalCost(new CostCalculator(), IShippingMethod.UgerntCargus));
        System.out.println(order.getTotalCost(new CostCalculator(), IShippingMethod.SameDay));
    }
}
