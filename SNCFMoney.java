import static java.lang.Math.min;

public class SNCFMoney {
    public static void main(String[] args) {
        System.out.println("Age: 9, Price: 100, Subscription: false -> Reduced Price: " + reduction(9, 100, false));   // 50.0
        System.out.println("Age: 66, Price: 100, Subscription: false -> Reduced Price: " + reduction(66, 100, false));  // 66.67
        System.out.println("Age: 20, Price: 30, Subscription: false -> Reduced Price: " + reduction(20, 30, false));   // 15.0
        System.out.println("Age: 20, Price: 100, Subscription: true -> Reduced Price: " + reduction(20, 100, true));   // 25.0
        System.out.println("Age: 30, Price: 100, Subscription: false -> Reduced Price: " + reduction(30, 100, false));  // 100.0

        System.out.println("Ca devient intéressant pour un étudiant à partir de : " + seuil() + " euros");  // Output the threshold price
    }

    public static float reduction(int age, int price, boolean subscription) {
        // Price reduction for users under 10 years old (50% off)
        if (age < 10) {
            return price * 0.5f;
        }
        // Price reduction for users above 65 years old (33% off)
        else if (age > 65) {
            return price * (2.0f / 3.0f);
        }
        // Price reduction for users between 18 and 25 years old without subscription (15 euros off if ticket price is above 20 euros)
        else if (age >= 18 && age <= 25 && !subscription) {
            return price > 20 ? price - 15 : price;
        }
        // Price reduction for students with subscription (75% off)
        else if (age >= 18 && age <= 25) {
            return min((price > 20 ? price - 15 : price) , price * 0.25f );
        }
        // No reduction
        else {
            return price;
        }
    }

    public static float seuil() {
        // The subscription costs 10 euros and gives a 75% discount
        // We need to find the price at which the total cost with a subscription becomes lower than without it
        float subscriptionCost = 10.0f;

        // For students between 18 and 25, without subscription: price > 20 ? price - 15 : price
        // With subscription: price * 0.25
        // We need to find the price where (price - 15) > price * 0.25 + 10

        float price = 0.0f;

        while ((price > 20 ? price - 15 : price) <= price * 0.25f + subscriptionCost) {
            price += 0.01f;  // Increment price to find the threshold
        }

        return price;
    }
}
