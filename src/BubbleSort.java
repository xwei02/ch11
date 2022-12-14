public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int turn = 1;
        for (int i = arr.length-1; i >0; i--) {
            int earlyStop=1;
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]){ //由小大大
                    int temp = arr[j]; //temp暫放 兩數交換
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                        earlyStop = 0;
                }
            }
            if (earlyStop==1) break;
            for (int k = 0; k < arr.length; k++) {
                if(k== arr.length-1-turn)
                    System.out.print(arr[k] + "[");
                else if(k==arr.length-1)
                    System.out.print(arr[k]+"]");
                else
                    System.out.print(arr[k] + " ");
            }
            System.out.println();
            turn++;
        }
    }
    public static void main(String[] args) {
        int[] array = {366,5,1,12,25,4,2,8,34,124,-24};
        bubbleSort(array);
        for (int i : array){
            System.out.print(i + " ");
        }
    }


}
