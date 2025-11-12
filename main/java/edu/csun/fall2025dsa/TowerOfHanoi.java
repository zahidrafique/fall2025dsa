package edu.csun.fall2025dsa;

/**
 *
 * @author zrafique
 */
public class TowerOfHanoi {
    public static void main(String[] args) {
        doTowers(3, 'A', 'B', 'C');
    }
    
    private static void doTowers(int topN, char from, char inter, char to) { 
        System.out.println(topN + ", " + from + ", " + inter + ", " + to);
        
        if (topN == 1) {    //Base Case
            System.out.println("Disk 1 from " + from + " to " + to);
        } else {            //Recursive Case
            doTowers(topN-1, from, to, inter);
            System.out.println("Disk " + topN + " from " + from + " to " + to);
            doTowers(topN-1, inter, from, to);
        }   
        
        System.out.println();
    }
}
