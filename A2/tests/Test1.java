class Test1 {
    public static void main(String[] args) {
        System.out.println(new A().foo(10));
    }
}
class A {
    public int foo(int p) {
        int a;
        int b;
        int c;
        a = 10;
        b = 20;
        c = a + b;
        return c;
    }
}
