public class ArrayDemo {
    public static void main(String[] args) {
        System.out.println(args.length);
//        System.out.println(args[1]);

        int [] nums = { 1,2,3,4,5,6,7,8};
        String [] student = {"Lyxa","Lyna","Dalina"};

        for (int i = 0 ; i< nums.length; i++){
            System.out.print(nums[i] + ",");
        }
        System.out.println();
        for (int i = 0 ; i< student.length; i++){
            System.out.print(student[i] + ",");
        }
    }
}
