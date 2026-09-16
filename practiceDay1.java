//print number 1 to 10
class practiceDay1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("printed number 1 to 10 : " + i);
            System.out.println("___________________________________");
            sumofnaturalnum();
            System.out.println("___________________________________");
            evenorodd();
            System.out.println("___________________________________");
            largenum();
            System.out.println("___________________________________");
            printTable();
        }
    }

    // q.2 sum of 1st 10 natural number

    public static void sumofnaturalnum() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
            System.out.println("sum of 1st 10 num is : " + sum);
        }
    }

    public static void evenorodd() {
        int num = 2;
        if (num % 2 == 0) {
            System.out.println(" even number");
        } else {
            System.out.println(" odd number");
        }
    }

    public static void largenum() {
        int a = 60;
        int b = 20;
        if (a < b) {
            System.out.println("b is greater : " + b);
        } else {
            System.out.println("a is greater : " + a);
        }

    }

    public static void printTable() {
        int num = 5;
        for (int i = 1; i <= 10; i++) {
            int sum = num * i;
            System.out.println("multi" + sum);


            String str="sanskruti";
            String str = new String();
        }
    }

}