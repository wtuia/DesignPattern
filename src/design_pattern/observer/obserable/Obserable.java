package design_pattern.observer.obserable;


import design_pattern.observer.observer.Observer;

/**
 * 被观察者接口（主题对象）
 * @author 14244
 *
 */
public interface Obserable {

    // 注册
    void registerObserver(Observer o);

    // 移除
    void removeObserver(Observer o);


    // 更新所有
    void notifyObservers();
    
}
