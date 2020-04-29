import java.util.Scanner;
public class AddValueInArray {
    public static void addValue(int[]arr,int num,int i){
        if(i<=1||i>arr.length-1){
            System.out.println("Không thể chèn phần tử vào vị trí "+i);
        }else {
            int a=0;
            for (int j=0;j<arr.length;j++){
                if (j==i) {

                }
            }
        }
    }

    public static void show(int [] arr){
        for (int k=0;k<=arr.length;k++){
            System.out.print(arr[k]+"\t");
        }
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
//        System.out.println("Nhập số lượng phần tử của mảng: ");
//        int amount=scanner.nextInt();
//        int[] arrA=new int[amount];
//        System.out.println("Nhập các phần tử: ");
//        for (int i=0;i<arrA.length;i++){
//            arrA[i]=scanner.nextInt();
//        }
        int[] arrA={1,2,3,4,5,6};
        System.out.println("Nhập số nguyên bất kỳ: ");
        int n=scanner.nextInt();
        System.out.println("Nhập vị trí cần chèn: ");
        int index=scanner.nextInt();
        addValue(arrA,n,index);
        System.out.print("Mảng sau khi thêm là: ");
        show(arrA);
    }
}
