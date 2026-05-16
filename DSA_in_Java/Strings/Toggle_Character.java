package Strings;

public class Toggle_Character {
    public static void main(String[] args) {

        String toggle = "capiTAlize";
        StringBuilder result = new StringBuilder();

        for(int i = 0 ; i<toggle.length() ; i++){
            char check = toggle.charAt(i);

            if(Character.isLowerCase(check)){
                result.append(Character.toUpperCase(check));
            }
            else {
                result.append(Character.toLowerCase(check));
            }
        }
        System.out.println(result);
    }
}
