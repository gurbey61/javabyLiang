package ch_07;

public class CopyingArrays {
    public static void main(String[] args) {
        int[] sourceArray = {2, 3, 1, 5, 10};
        int[] targetArray = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
        }
        System.out.println("targetArray is ");
        for (int i: targetArray) {
            System.out.print(i);
        }
        System.out.println();

        /*The arraycopy method does not allocate memory space for the target array. The target array
must have already been created with its memory space allocated. After the copying takes place,
targetArray and sourceArray have the same content but independent memory locations.*/

        int[] targetArray2 = new int[sourceArray.length];

        System.out.println("targetArray2 is ");
        System.arraycopy(sourceArray, 0, targetArray2, 0, sourceArray.length);
        for (int i: targetArray2) {
            System.out.print(i);
        }


    }
}
