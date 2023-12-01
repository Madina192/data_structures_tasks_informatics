package queue;

public class Queue {
    static int[] array = new int[10000];
    static int h;
    static int t;
    public static void main(String[] args) {
        System.out.println("vghcmj");
    }

    public static void push(int x) {
        array[t] = x;
        t+=1;
    }

    public static void pop(){
        h+=1;
    }
}
