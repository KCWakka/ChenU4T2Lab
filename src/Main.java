public class Main {
    public static void main(String[] args) {
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i);
//        }
//        for (int i = 0; i < 11; i++) {
//            System.out.println(i);
//        }
//        for (int x = 15; x >= 0; x--) {
//            System.out.println(x);
//        }
//        for (int x = 15; x > -1; x--) {
//            System.out.println(x);
//        }
//        for (int x = 0; x <= 20; x++) {
//            if (x % 2 == 0) {
//                System.out.println(x);
//            }
//        }
//        for (int x = 0; x <= 20; x += 2) {
//                System.out.println(x);
//        }
//        for (int count = 5; count < 10; count++) {
//            System.out.print(count + " ");
//        }
//        for (int i = 20; i >= 0; i = i - 3) {
//            System.out.print(i + " ");
//        }
//        int sum = 0;
//        int x = 5;
//        for (int i = 0; i < 10 + x; i += 2) {
//            sum += i;
//        }
//        System.out.println(sum);
//        int i = 5;
//        while (i < 10) {
//            System.out.print(i + " ");
//            i++;
//        }
//        for (int count = 4; count <= 11; count++) {
//            System.out.print(count + " ");
//        }
//        for (int count = 4; count < 15; count+= 2) {
//            System.out.print(count + " ");
//        }
//        for (int count = 4; count <= 14; count+= 2) {
//            System.out.print(count + " ");
//        }
//        for (int count = 6; count <= 100; count+= 6) {
//            System.out.print(count + " ");
//        }
//        for (int count = 0; count <= 100; count+= 1) {
//            if (count % 6 == 0) {
//                System.out.print(count + " ");
//            }
//        }
//        int num = 100;
//        for (int count = 1; count <= num; count++) {
//            System.out.print(num + " ");
//            num = num / 2;
//        }
//        String print = "Print Me!";
//
//        for(int i = 0; i <= print.length(); i++) {
//            System.out.println(print.substring(i, i + 1));
//        }
        StringLoops loops = new StringLoops();
        System.out.println("--- testing countCharacters ---");
        System.out.println(loops.countCharacters("a", "Apple and banana"));
        System.out.println(loops.countCharacters("A", "Apple and banana"));
        System.out.println(loops.countCharacters("!", "Hello! Nice day!"));
        System.out.println(loops.countCharacters("g", "Hello! Nice day!"));
        System.out.println("\n--- testing reverseString ---");
        System.out.println(loops.reverseString("hello!"));
        System.out.println(loops.reverseString("Apples and bananas"));
        System.out.println(loops.reverseString("C"));

    }
}