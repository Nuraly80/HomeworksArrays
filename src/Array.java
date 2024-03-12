public class Array {
    public static void main(String[] args) {
        System.out.println("Первая задача");
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();

        System.out.println("Второя задача");
        int[] array2 = new int[6];
        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;
        array2[3] = 4;
        array2[4] = 5;
        array2[5] = 6;
        for (int i = 0; i < 3; i++) {
            System.out.println(array2[i]);
        }
        System.out.println();

        System.out.println("Третья задача");
        for (int i = array2.length / 2; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println();

        System.out.println("Четвертая задача");
        for (int i = 1; i < array2.length - 1; i++) {
            System.out.println(array2[i]);
        }
        System.out.println();

        System.out.println("Пятая задача");
        int[] array3 = new int[] {7, -3, 9, -11, 18, 99, 2, 11};
        for (int i = array3.length - 3; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
        System.out.println();



        System.out.println("Шестая задача");
        for (int i = 0; i < array2.length; i++) {
            if (i % 2 != 0){ //[1, 2, 3, 4, 5, 6]
                System.out.println(array2[i]);
            }

        }
        System.out.println();


        System.out.println("Седьмая задача");
        int negativeCount = 0;
        int positiveCount = 0;
        for (int i = 0; i < array3.length; i++) {
            if(array3[i] >= 0){ // [7, -3, 9, -11, 18, 99, 2, 11]
                positiveCount++;
            }else{
                negativeCount++;
            }
        }
        System.out.println("Число отрицальных числ:" + negativeCount + " Позитивных:" + positiveCount);
        System.out.println();

        int max = array3[0];
        int min = array3[0];
        for (int i = 0; i < array3.length; i++) {
            if(max < array3[i]){
                max = array3[i];
            }
            if(min > array3[i]){
                min = array3[i];
            }
        }
        System.out.println("Минимум массива:" + min + " максимум:" + max);
    }
}
