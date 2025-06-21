public class AlternateArraySplit {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int n = arr.length;
        int xSize = (n + 1) / 2;
        int ySize = n / 2;

        int[] x = new int[xSize];
        int[] y = new int[ySize];

        int xi = 0;
        int yi = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                x[xi] = arr[i];
                xi = xi + 1;
            } else {
                y[yi] = arr[i];
                yi = yi + 1;
            }
        }

        System.out.print("x = ");
        for (int i = 0; i < xSize; i++) {
            System.out.print(x[i] + " ");
        }

        System.out.println();

        System.out.print("y = ");
        for (int i = 0; i < ySize; i++) {
            System.out.print(y[i] + " ");
        }
    }
}
