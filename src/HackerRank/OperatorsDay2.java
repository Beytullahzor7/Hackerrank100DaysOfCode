package HackerRank;

public class OperatorsDay2 {
    public static void main(String[] args) {
        solve(12.00,20,8);

    }
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tipPrice = (meal_cost/100) * tip_percent;
        double taxPrice = (meal_cost/100) * tax_percent;

        double totalPrice = meal_cost + tipPrice + taxPrice;
        System.out.println(Math.round(totalPrice));
    }
}
