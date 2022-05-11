package HackerRank;

public class LetterCapitalize {
    public static void main(String[] args) {
        System.out.println(letterCapitalize("welcome to our new world"));

    }

    public static String letterCapitalize(String str){

        StringBuilder builder = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            if(i == 0){
                builder.append(str.toUpperCase().charAt(i));
            }else if(str.charAt(i) == ' ' && (i+1 != str.length())){
                builder.append(str.charAt(i)); //bosluk
                i++;
                builder.append(str.toUpperCase().charAt(i));

            }else{
                builder.append(str.charAt(i));
            }
        }
        return builder.toString();
    }
}
