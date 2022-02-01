public interface TakeoutListener {

    void onFoodReadyForDelivery(String dish, Restaurant restaurant);
    void onOrderCancelled(Restaurant restaurant);
}
