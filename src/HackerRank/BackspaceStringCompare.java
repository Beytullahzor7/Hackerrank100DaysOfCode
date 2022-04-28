package HackerRank;

public class BackspaceStringCompare {
    public static void main(String[] args) {

    }
    public static int compareStrings(String s1, String s2) {
        StringBuilder builder = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();

        char[] c1 = s1.toLowerCase().toCharArray();
        char[] c2 = s2.toCharArray();

        for(int i=0; i<c1.length; i++){
            if(c1[i] != '#'){
                builder.append(i);

            } else if(builder.length() != 0){
                builder.deleteCharAt(builder.length()-1);
            }
        }

        for(int i=0; i<c2.length; i++){
            if(c2[i] != '#'){
                builder2.append(i);

            } else if(builder2.length() != 0){
                builder2.deleteCharAt(builder2.length()-1);
            }
        }

        int result = builder.toString().equals(builder2.toString()) ? 1 : 0;
        return result;
    }
}
