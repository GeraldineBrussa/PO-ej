package org.POO.example.MET;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Training {

    public int areaOrPerimeter (int l, int w) {
        return l == w ? l * w : 2*(l+w);
        /*
        if (l==w){
            return l*w;
        }else {
            return 2*(l+w);
        }*/

    }
    public  int enough(int cap, int on, int wait){
        return Math.max(0, on + wait - cap);
        //int total = on + wait;
        //if (total<=cap){
        //    return 0;
        //}else {
        //    return total - cap;
        //}
    }
    public int[] pipeFix(int[] numbers) {
        // Fix the pipes!
        Arrays.sort(numbers);
        return IntStream.rangeClosed(numbers[0], numbers[numbers.length - 1]).toArray();
        //int initialValue = numbers[0];
        //int max = numbers[numbers.length - 1];
        //int [] fixedList = new int[max-initialValue+1];
        //for (int i =0; i<fixedList.length; i++){
        //    fixedList[i]=initialValue +i;
        //}
        //return fixedList;

    }

}
