public class Practice23 {
    public static void main(String[] args) {
        /* staticメンバの練習 */

        // System.out.println(Test.a);    インスタンス変数をstatic変数の呼び出し方で記述している為コンパイルエラーが出る
        System.out.println(Test.b);

        // Test.methodA();   インスタンスメソッドをstaticメソッドの呼び出し方で記述している為コンパイルエラーが出る
        Test.methodB();

        Test x = new Test();
        x.methodB();    // staticメソッドを参照変数（インスタンス化済）で呼び出している
    }
}

class Test {
    int a = 100;
    static int b = 200;

    void methodA() {
        System.out.println("インスタンスメソッドです");
    }

    static void methodB() {
        System.out.println("staticメソッドです");
    }
}
