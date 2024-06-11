public class Sample {

    public static void main(String[] args) {
        boolean test1 = false;
        boolean test2 = false;

        if (test1) {
            System.out.println("true block executed");
        }

        else if(test2) {
            System.out.println("This is the second line");

        }
        else {
            System.out.println("else block executed");
        }

    }
}