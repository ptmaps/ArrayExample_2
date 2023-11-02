public class ArrayExample {
    public static void main(String[]args){
        int[] myArray = new int[10];

        for (int i=9; i>=0; i--){
            myArray[9-i] = i;
        }
        for (int element : myArray){
            System.out.print(element);
        }
    }
}
