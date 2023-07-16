import java.util.Scanner;

public class ClosestMin {
    public static int closeMinMax(int[] array) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int x : array) {
            if (x > max) {
                max = x;
            }
            if (x < min) {
                min = x;
            }
        }
        int lastminindex = -1;
        int lastmaxindex = -1;
        int result = array.length;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                lastminindex = i;
                if (lastmaxindex >= 0) {
                    result = Math.min(result, i - lastmaxindex + 1);
                }
            }
            if (array[i] == max) {
                lastmaxindex = i;
                if (lastminindex >= 0) {
                    result = Math.min(result, i - lastminindex + 1);
                }
            }
        }
            return result;
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println(closeMinMax(array));
    }

    }
