package design_pattern.builder_factory.problem;

/**
 * 案例2
 *
 * 过多的setter getter
 * 为了避免案例1的传参顺序颠倒的问题，使用setter方式设置值
 *
 */
public class SecondProblem {

    // required param
    private int height;
    private int width;
    private int size;
    // optional param
    private int volume;
    private int area;

    /**
     * 将对象的构造过程分成多个步骤，
     * 在构造过程中，需要其他手段保证对象状态不变（同步）
     */
    public static void main(String[] args) {
        SecondProblem problem = new SecondProblem();
        problem.setHeight(1);
        problem.setWidth(1);
        problem.setSize(1);
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
