package design_pattern.proxy.dynamic_proxy;

/**
 * 切入方法，计算耗时
 * 执行之前调用start 之后调用finish 可以计算出运行时间
 */
public class MonitorUtil {

    private static ThreadLocal<Long> t1 = new ThreadLocal<>();

    public static void start() {
        t1.set(System.currentTimeMillis());
    }

    public static void finish(String methodName) {
        long finishTime = System.currentTimeMillis();
        System.out.println(methodName + "方法耗时" + (finishTime - t1.get()) + "ms");
    }
}


