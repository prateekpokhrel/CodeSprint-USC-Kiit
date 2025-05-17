// Day 1_2: Can Shivam Buy Icecream.
public class IceCreamSelector {

    public static boolean canBuyIceCream(int budget, int[] iceCreamPrices) {
        for (int price : iceCreamPrices) {
            if (price == budget) {
                return true;
            }
        }
        return false;
    }

    // Example usage
    public static void main(String[] args) {
        int budget = 30;
        int[] iceCreamPrices = {10, 25, 30, 50};

        boolean result = canBuyIceCream(budget, iceCreamPrices);
        
        System.out.println(result); 
         // Output: true
    }
}
