package observer_pattern.observer;

/**
 * 观察者
 * @author 14244
 *
 */
public interface Observer {

    void update(float temp, float humidity, float pressure);
}
