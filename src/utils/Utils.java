package utils;


public class Utils {

    public static class Modifier {

        public static int modifier(int statValue) {

            if (statValue < 5) return  -1;
            else if (statValue < 10) return  0;
            else if (statValue < 15) return  1;
            else return  2;


          /*  if (statValue > 15) return 2;
            else if(statValue > 10) return 1;
            else if(statValue > 5) return 0;
            else return -1;*/

        } //end modifier()

    } //end class Modifier

}
