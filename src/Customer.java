public class Customer implements TakeoutListener {

    private final String name;
    private final String favoriteFood;
    private final Restaurant defaultRestaurant;

    public Customer(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        defaultRestaurant = Restaurant.getRandomRestaurant();
    }

    public void orderFood() {
        orderFood(defaultRestaurant);
    }

    public void orderFood(Restaurant restaurant) {
        System.out.println(name + " orders " + favoriteFood + " from " + restaurant.getCuisine() + " restaurant.");
        restaurant.order(favoriteFood, this);
    }

    @Override
    public void onFoodReadyForDelivery(String dish, Restaurant restaurant) {
        System.out.println(name + " received " + dish + " from " + restaurant.getCuisine() + " restaurant.");
    }

    @Override
    public void onOrderCancelled(Restaurant restaurant) {
        System.out.println("Order was rejected by " + restaurant.getCuisine() + " restaurant. Ordering somewhere else...");
        orderFood(Restaurant.getRandomRestaurant());
    }
}
