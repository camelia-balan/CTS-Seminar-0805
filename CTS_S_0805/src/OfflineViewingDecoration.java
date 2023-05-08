// Decorator pentru adaugarea de optiune de vizionare offline
public class OfflineViewingDecoration extends SubscriptionDecorator {
    public OfflineViewingDecoration(Subscription subscription) {
        super(subscription);
    }

    @Override
    public String getDescription() {
        return subscription.getDescription() + ", vizionare offline";
    }

    @Override
    public double getPrice() {
        return subscription.getPrice() + 5.0;
    }
}
