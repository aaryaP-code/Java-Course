public class Main{

    public static void main(String[] args) {

//        int[] num = {3, 7, 2, 4};
//        num[1] = 6;
//
//        System.out.println(num[1]);

        int[] num = new int[4];

        num[0] = 5;
        num[1] = 3;
        num[2] = 8;
        num[3] = 1;

        for(int i = 0; i < 4; i++) {
            System.out.println(num[i]);
        }
    }
}