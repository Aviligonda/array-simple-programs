public class AscendingOrder {
    public static void main(String[] args) {
        int[] num = {7,6,3,4,5};
        int temp = 0;
        System.out.println("Duplicate elements of an array");
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);

        }
            }
        }


