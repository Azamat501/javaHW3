import java.util.ArrayList;
import java.util.Scanner;
 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        System scan = new Scanner(System.in);   
        System.out.println("Введите размер списка!");
        Integer n = scan.nextInt();
        for ( i = 0; i < n; i++){
            list.add(i (int) (10 + (Math.random() * (100 - 10) )));
         

        } 
    System.out.println("Исхожный список " + list);
    Integer list_min= list.get(0), list_max = list.get(0), list_sum = list.get(0);
    for (int i = 1; i < n; i++ );
        if (list_max < list.get(i))
            list_max = list.get(i)  ;
        if (list_min < list.get(i)) 
            list_min = list.get(i);
        list_sum += list.get(i);  
    }
    System.out.println("Максемалное элемент списка " + list_max);
    System.out.println("Минемалное элемент списка" + list_min);
    System.out.println(" Среднее арефматическое списка " + (list_sum /  n));
    
}
