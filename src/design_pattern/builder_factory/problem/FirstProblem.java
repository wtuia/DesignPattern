package design_pattern.builder_factory.problem;

/**
 * 案例1
 * 过多的构造方法
 *
 * 包含多个int参数，传参时，参数顺序的颠倒不会导致程序出错，但会导致结果出错
 */
public class FirstProblem {

    // required param
    private int height;
    private int width;
    private int size;
    // optional param
    private int volume;
    private int area;


    public FirstProblem(int height, int width, int size) {
        this.height = height;
        this.width = width;
        this.size = size;
    }

    public FirstProblem(int height, int width, int size, int volume) {
        this.height = height;
        this.width = width;
        this.size = size;
        this.volume = volume;
    }

    public FirstProblem(int height, int width, int size, int volume, int area) {
        this.height = height;
        this.width = width;
        this.size = size;
        this.volume = volume;
        this.area = area;
    }
}
