public class Test {

    static double PI = 3.14;
    double X = 0;
    // static initializer
    public static int[] nums;
    static{
        System.out.println("Helloooo");
        nums = new int[5];
        nums[0] = 1;
        nums[1] = 1;
        nums[2] = 1;
        nums[3] = 1;
        nums[4] = 1;
    }

    public static int[] num2 = initNums();
    public static int[] initNums(){
        System.out.println("Hiiiii");
        int[] num2 = new int[5];
        num2[0] = 1;
        num2[1] = 2;
        num2[2] = 3;
        num2[3] = 4;
        num2[4] = 5;

        return num2;
    }



    static void printName(){
        System.out.println("Chiev Lyeng");
    }

    public static void main(String[] args) {
        printName();
        System.out.println(PI);
//        System.out.println(X);
    }

}
