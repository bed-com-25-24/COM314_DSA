public class InnerClassDemo {
    private String hello = "hello from outer class";

    public void speak() {
        System.out.println(hello);
    }

    public class InnerClass {
        private String hello = "hello from inner class";

        public void speak() {
            System.out.println(hello);
        }
    }

    public static class NestedClass {
        private String hello = "hello from nested class";

        public void speak() {
            System.out.println(hello);
        }
    }

    public static void main(String[] args) {
        InnerClassDemo outerObj = new InnerClassDemo();
        outerObj.speak();

        InnerClassDemo.InnerClass innerObj = outerObj.new InnerClass();
        innerObj.speak();

        NestedClass nestedObj = new NestedClass();
        nestedObj.speak();

        class Point {
            private double x;
            private double y;

            public Point(double x, double y) {
                this.x = x;
                this.y = y;
            }

            public double getX() {
                return x;
            }

            public void setX(double x) {
                this.x = x;
            }

            public double getY() {
                return y;
            }

            public void setY(double y) {
                this.y = y;
            }
        }

        Point point = new Point(3, 4);
        System.out.println("Point: (" + point.getX() + ", " + point.getY() + ")");
    }
}