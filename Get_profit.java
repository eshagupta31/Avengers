public class Get_profit {

    public static void main(String[] args) {

        int cost_price = Integer.parseInt(args[0]);
        int profit_percent = Integer.parseInt(args[1]);

        int get_profit = get_profit(cost_price, profit_percent);
        System.out.println(get_profit);
    }

    private static int get_profit(int cost_price, int profit_percent) {

        int profit;
        profit = (cost_price * profit_percent)/100;
        return profit;
    }
}
