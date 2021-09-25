import java.util.Scanner;

public class Test {
    public static void main (String[] args){
        printArray();
    }

    /**Выводит на печать созданный массив
     *
     */
    static void printArray()
    {int[] arr1 = createArray();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(" " + arr1[i]);
        }
    }

    /**
     * Создаёт массив введённого пользователем размера
     *
     * @return новый массив с элементами, введёнными пользователем
     */
    static int[] createArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Количество элементов массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }
}