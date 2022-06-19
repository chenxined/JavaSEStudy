Java异常机制

在理想的情况下，我们的程序会按照我们的思路去运行，按理说是不会出现问题的，但是，代码实际编写后并不一定是完美的，可能会有我们没有考虑到的情况，如果这些情况能够正常得到一个错误的结果还好，但是如果直接导致程序运行出现问题了呢？

public static void main(String[] args) {
    test(1, 0);   //当b为0的时候，还能正常运行吗？
}

private static int test(int a, int b){
    return a/b;   //没有任何的判断而是直接做计算
}

Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.test.Application.test(Application.java:9)
	at com.test.Application.main(Application.java:5)

当程序运行出现我们没有考虑到的情况时，就有可能出现异常或是错误！
