import java.util.StringTokenizer;

public class Runner {
    public static void printToken(StringTokenizer stringTokenizer){
        while (stringTokenizer.hasMoreTokens()){
            System.out.print("["+stringTokenizer.nextToken() +"] ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        //1. StringTokenizer with default delimiter with space
        StringTokenizer stringTokenizer1 = new StringTokenizer("Hi How are you?");
        printToken(stringTokenizer1);

        //2. StringTokenizer with default delimiter with space
        String setDelimiter = " ,";
        StringTokenizer stringTokenizer2 = new StringTokenizer("Hi ,How,are,you Hello Ahmad",setDelimiter);
        printToken(stringTokenizer2);

        //3. StringTokenizer with default delimiter with space with 3parameter true
        StringTokenizer stringTokenizer3 = new StringTokenizer("Hi ,How,are,you Hello Ahmad"," ,", true);
        printToken(stringTokenizer3);


    }
}
