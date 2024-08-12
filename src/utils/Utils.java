package utils;


public class Utils {

    public static class Modifier {

        public static int modifier(int baseModifier) {

            int modifierBonus;

            if (baseModifier < 5) {
                return modifierBonus = -1;
            }
            else if (baseModifier < 10) {
                return modifierBonus = 0;
            }
            else if (baseModifier < 15) {
                return modifierBonus = 1;
            }
            else {
                return modifierBonus = 2;
            }
        }

    }

}
