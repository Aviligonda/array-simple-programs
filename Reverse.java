public class Reverse {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6};
        System.out.println("original order is ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
        System.out.println();
        System.out.println("reverse order is ");
        for (int i = num.length-1; i >=0 ; --i) {
            System.out.print(num[i]+"  ");

        }
    }
}
