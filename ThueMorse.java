public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int checkN = n;
        boolean[] boolArray = new boolean[n];

        boolean power2 = false;
        // when n is a power of 2
        while (checkN % 2 == 0) {
            checkN = checkN / 2;
        }
        if (checkN == 1) {
            power2 = true;
        }

        if (power2) {
            for (int i = 0; i < Math.log(n) / Math.log(2); i++) {
                for (double j = Math.pow(2, i); j < 2 * Math.pow(2, i); j++) {

                    boolArray[(int) j] = !boolArray[(int) (j - Math.pow(2, i))];

                }
            }
            for (int i = 0; i < boolArray.length; i++) {
                System.out.print(boolArray[i] + " ");
            }
        }

        else {
            // set n to smallest power of 2 greater than n
            long a = (int) (Math.log(n) / Math.log(2));

            int newN = (int) Math.pow(2, a + 1);
            boolean[] newBoolArray = new boolean[newN];

            for (int i = 0; i < Math.log(newN) / Math.log(2); i++) {

                for (double j = Math.pow(2, i); j < 2 * Math.pow(2, i); j++) {

                    newBoolArray[(int) j] = !newBoolArray[(int) (j - Math.pow(2, i))];

                }
            }
            for (int i = 0; i < newBoolArray.length; i++) {
                System.out.print(newBoolArray[i] + " ");
            }

        }
    }
}