package lesson6;

public class hw6 {


    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run(201);
        cat.swim(1);
        cat.jump(1.9);

        Dog dog = new Dog();
        dog.run(500);
        dog.swim(10);
        dog.jump(0.4);
    }

    abstract static class Animal {
        private final int MAX_RUN_LENGTH = 0;
        private final int MAX_SWIM_LENGTH = 0;
        private final double MAX_JUMP_HEIGHT = 0;

        abstract void run(int length);

        abstract void swim(int length);

        abstract void jump(double height);
    }

    static class Cat extends Animal {
        private final int MAX_RUN_LENGTH = 200;
        private final double MAX_JUMP_HEIGHT = 2;
        @Override
        void run(int length) {
            if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("run: true");
            else System.out.println("run: false");
        }

        @Override
        void swim(int length) {
            System.out.println("swim: false");
        }

        @Override
        void jump(double height) {
            if ((height >= 0) && (height <= MAX_JUMP_HEIGHT)) System.out.println("jump: true");
            else System.out.println("jump: false");
        }
    }

    static class Dog extends Animal {
        private final int MAX_RUN_LENGTH = 500;
        private final int MAX_SWIM_LENGTH = 10;
        private final double MAX_JUMP_HEIGHT = 0.5;

        @Override
        void run(int length) {
            if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("run: true");
        }

        @Override
        void swim(int length) {
            if ((length >= 0) && (length <= MAX_SWIM_LENGTH)) System.out.println("swim: true");
            else System.out.println("swim: false");
        }

        @Override
        void jump(double height) {
            if ((height >= 0) && (height <= MAX_JUMP_HEIGHT)) System.out.println("jump: true");
            else System.out.println("jump: false");
        }
    }}