/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labthirteencollectionframework;

import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author user
 */
public class LabThirteenCollectionFramework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Integer> whole_num = new HashSet<Integer>();
        Set<Integer> even_num = new HashSet<Integer>();
        Set<Integer> odd_num = new HashSet<Integer>();

        whole_num.add(1);
        whole_num.add(2);
        whole_num.add(3);
        whole_num.add(4);
        whole_num.add(5);
        whole_num.add(6);
        whole_num.add(7);
        whole_num.add(8);
        whole_num.add(9);

        even_num.add(2);
        even_num.add(4);
        even_num.add(6);
        even_num.add(8);
        even_num.add(10);
        even_num.add(12);
        even_num.add(14);
        even_num.add(16);
        even_num.add(18);

        odd_num.add(1);
        odd_num.add(3);
        odd_num.add(5);
        odd_num.add(7);
        odd_num.add(9);
        odd_num.add(11);
        odd_num.add(13);
        odd_num.add(15);
        odd_num.add(17);
        System.out.println("\n" + whole_num);
        System.out.println(even_num);
        System.out.println(odd_num + "\n");
        System.out.println("Whole number given below \n");
        for (Integer i : whole_num) {
            System.out.println("whole_num" + i);
        }
        System.out.println("Even number given Below \n");
        for (Integer i : even_num) {
            System.out.println("Even_num" + i);
        }
        System.out.println("Even number given Below \n");
        for (Integer i : odd_num) {
            System.out.println("odd_num" + i);
        }
        Set<Integer> intersect_set_a = new HashSet<>(whole_num);
        intersect_set_a.retainAll(odd_num);
        Set<Integer> intersect_set_b = new HashSet<>(whole_num);
        System.out.println("Intersected Set A:" + intersect_set_a);
        System.out.println("Intersected Set A:" + intersect_set_b);
        Set<Integer> diff_set_a = new HashSet<>(whole_num);
        Set<Integer> diff_set_b = new HashSet<>(whole_num);
        System.out.println("diff Set A:" + diff_set_a);
        System.out.println("Intersected Set A:" + diff_set_b);
        diff_set_a.removeAll(even_num);
        diff_set_b.removeAll(even_num);
        System.out.println("Difference of Wholenumber with even:" + diff_set_a);
        System.out.println("Difference of Wholenumber with odd:" + diff_set_b);
        Set<Integer> toclear = new HashSet<>(whole_num);
        System.out.println("Before" + toclear);
        toclear.clear();
        System.out.println("After" + toclear);
        whole_num.add(12);
        System.out.println("Whole Number :" + whole_num);
        System.out.println("Diff Set A :" + diff_set_a);
        Set<Integer> new_Whole_num_set = new HashSet<>(whole_num);
        System.out.println("whole num Before" + new_Whole_num_set);
        new_Whole_num_set.clear();
        System.out.println("whole num after" + new_Whole_num_set);
    }
}
