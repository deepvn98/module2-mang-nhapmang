import java.util.Scanner;

public class ChangePTM {
    public static int getLength(Scanner scanner){
        int size;
        do {
            System.out.println("Mời bạn nhập vào độ dài mảng: ");
            size = scanner.nextInt();
            if (size < 1){
                System.out.println("chiều dài mảng phải lớn hơn 0!");
            }

        } while (size < 1) ;
        return size;
    }
    public static int [] setPTM(Scanner scanner, int size ){
        int [] array = new int[size];
        for ( int i = 0; i < array.length; i++ ){
            System.out.print("a["+i+"] = ");
            array[i] = scanner.nextInt();
        }return array;
    }
    public static int [] changeMang(int array[] ){
        for ( int i =0; i < array.length/2; i++ ){
            int x = array[i];
           array[i] = array [array.length - 1 -i];
            array [array.length - 1 -i] = x;

        }return array;
    }
    public static void showMang(int array[]){

        for (int a : array) {
            System.out.println( a );
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = getLength(scanner);
//        System.out.println(x);
        int [] array = setPTM(scanner,x);
//        System.out.println(array);
        showMang(array);
        int arr [] = changeMang(array);
        System.out.println();
        showMang(arr);
    }
}
