package factory_pattern;

public abstract class Pizza {

    String name;

    public void prepare() {
        System.out.println("制作中..."+name);
    }

    public void back() {
        System.out.println("等待20分钟..");
    }

    public void cut() {
        System.out.println("切割中...");
    }

    public void box() {
        System.out.println("打包完成");
    }
}

