public class BitManipulation1 {
    public static void main(String[] args) {
        int a = 5; // 101
        int b = 6; // 110
        System.out.println("a & b = " + (a & b)); // 100 = 4
        System.out.println("a | b = " + (a | b)); // 111 = 7
        System.out.println("a ^ b = " + (a ^ b)); // 011 = 3
        System.out.println("~a = " + (~a)); // 11111111111111111111111111111010 = -6
        System.out.println("a << 1 = " + (a << 1)); // 1010 = 10
        System.out.println("a >> 1 = " + (a >> 1)); // 10 = 2
        System.out.println("a >>> 1 = " + (a >>> 1)); // 10 = 2
    }
}