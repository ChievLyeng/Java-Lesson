import business.Company;

public class Person {
    private String name = "Jerry";
    private int age;
    private long id;
    private char middleInitial = 'J';
    private byte myByte;
    static private Company company = new Company();
    private NewsAgency agency;

    public void sayHello() {
        System.out.print("Hello ! ");
    }

    public void saySomething(String text){
        System.out.println(text);
    }

    public char getMiddleInitial(){
        return name.charAt(0);
    }

    public int addNumber(int num1,int num2){
        return num1 + num2;
    }

    public void test(String[] words){
        for(int i=0; i < words.length; i++){
            System.out.print(words[i] + " ");
        }
    }

    public void test2(int a,int b, String[] words){
        System.out.println();
        System.out.println(a+b);
        for(int i=0; i < words.length; i++){
            System.out.print(words[i] + " ");
        }
    }

    // var arg can not stay at the front have to stay at the back
    public void test3(int num1,int num2,String... words){
        System.out.print(num1);
        System.out.println(num2);
        for(int i=0; i < words.length; i++){
            System.out.print(words[i] + " ");
        }
    }



    public static void main(String[] args) {
        var firstName = "Chiev";
        var lastName = "Lyeng";
        System.out.println(firstName +" " + lastName);
        System.out.println(company);

        Person p1 = new Person();
        p1.sayHello();

        p1.saySomething(firstName + lastName);
        System.out.println("The first character of name is " + p1.getMiddleInitial());

        System.out.println("Sum : " +  p1.addNumber(11,22));

        String[] words = new String[] {"Wo", "ai", "ni !"};

        p1.test(words);
        p1.test(new String[] {"Hello","Hi", "Ni hao"});
        p1.test2(1,1,new String[] {"Web","App","System"});

        // var arg
        p1.test3(3,4,"one","two","three");
    }

}
