/*
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        System.out.println("Final Value of Variable After Performing Operations");

        Solution solution = new Solution();

        String jewels1 =  "aA" ;
        String stones1 =  "aAAbbbb" ;        
        int output1 = solution.numJewelsInStones(jewels1, stones1);
        System.out.println("Output = " + output1);

        String jewels2 =  "z" ;
        String stones2 =  "ZZ" ;        
        int output2 = solution.numJewelsInStones(jewels2, stones2);
        System.out.println("Output = " + output2);



    }
}
