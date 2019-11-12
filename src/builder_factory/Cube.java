package builder_factory;

/**
 * 构造器 实例
 */
public class Cube {

    // required param
    private int height;
    private int width;
    private int size;
    // optional param
    private int volume;
    private int area;

    private Cube(Builder builder) {
        this.height = builder.height;
        this.width  = builder.width;
        this.size   = builder.size;
        this.volume = builder.volume;
        this.area   = builder.area;
    }

    public static class Builder {

        // required param
        private int height;
        private int width;
        private int size;
        // optional param
        private int volume;
        private int area;

        public Builder(int height, int width, int size) {
            this.height = height;
            this.width = width;
            this.size = size;
        }

        /**
         * @return 返回当前对象，实现链式编程
         */
        public Builder volume(int val) {
            this.volume = val;
            return this;
        }

        public Builder area(int val) {
            this.area = val;
            return this;
        }

        /**
         * 调用私有的构造方法进行实例化
         */
        public Cube build() {
            return new Cube(this);
        }
    }

}

