package design_pattern.builder_factory;

public class Main {

    public static void main(String[] args) {
        Cube cube = new Cube.Builder(3, 4, 5)
                .volume(60).area(12).build();
    }
}
