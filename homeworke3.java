import java.util.ArrayList;
import java.util.Scanner;
public class homeworke3 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер исходного списка");

        Integer n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(i, (int) (10 + (Math.random() * (100 - 10))));
        }
        System.out.println("Исходный список! " + list);
        for (int i = n - 1; i >= 0; i--  ){
            if (list.get(i) % 2 == 0){
                list.remove(i);

            }
        }
        System.out.println("список без четных чисел" + list );

    }
}
  //2
 





