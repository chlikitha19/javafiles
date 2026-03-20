public class formatspeacifiers {
    public static void main(String args[]){
        //%[flags][width][.precision][specifier_character]
        /*flags
         * += output a plus
         * ,=comma grouping separator
         * (=negative numbers are enclosed in ()
         * space = display a minus if negative,space if positive
         */
        /*width 
         * 0= zero padding 
         * number = right justified padding
         * negative number = left jsutfied padding
         */
        double price1 = 9.99;
        double price2 = -96.45;
        double price3 = 5476.93;
        int id1 = 345;
        int id2 = 3456;
        int id3 = 89035;
       
         System.out.printf("% .3f\n",price1);
          System.out.printf("% .3f\n",price1);
        System.out.printf("% .3f\n",price2);
        System.out.printf("% .3f\n",price3);
        System.out.printf("%-5d\n",id1);
        System.out.printf("%5d\n",id2);
        System.out.printf("%5d\n",id3);//here we are adding zeros in front of the % and giving the number upto which place the number should print
//.1,.2,.3 are the precision where the number prints to that decimal extinct
//by using the above flags we can sperated the answers which we should keep after the % 
    }}
