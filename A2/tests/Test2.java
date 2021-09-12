class Test2 {
    public static void main(String[] args) {
        System.out.println(new A().foo(10));
    }
}

// Expected output: Type checking failed.

class A {
    public int foo(int p) {
        boolean a;
        int b;
        int c;
        a = 10;
        b = 20;
        c = a + b;
        return c;
    }
}
