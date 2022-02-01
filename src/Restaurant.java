import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Restaurant {

    private final Cuisine cuisine;
    private final int maxDeliveryTime;
    private static final Random random = new Random();

    public Restaurant(Cuisine cuisine, int maxDeliveryTime) {
        this.cuisine = cuisine;
        this.maxDeliveryTime = maxDeliveryTime;
    }

    public static Restaurant getRandomRestaurant() {
        Cuisine randomCuisine = Cuisine.values()[random.nextInt(Cuisine.values().length)];
        return new Restaurant(randomCuisine, random.nextInt(5000, 15000));
    }

    public void order(String dish, TakeoutListener listener) {
        Timer timer = new Timer();
        Restaurant restaurant = this;
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                boolean canDeliver = random.nextFloat(1) > 0.3;
                if (canDeliver) {
                    listener.onFoodReadyForDelivery(dish, restaurant);
                } else {
                    listener.onOrderCancelled(restaurant);
                }
            }
        }, random.nextInt(maxDeliveryTime / 2, maxDeliveryTime));
    }

    public Cuisine getCuisine() {
        return cuisine;
    }

    public enum Cuisine {
        Italian,
        Chinese,
        German,
        Indian,
        Greek,
    }
}
