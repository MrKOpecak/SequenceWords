public class Main {
    public static void main(String[] args){
        NumMatchingSubseq("Hello", new String[]{"Hello","World"});
    }

    public static int NumMatchingSubseq(String s, String[] words) {
        int result = 0;

        for (String word: words) {
            System.out.println(word);
        }

        return result;
    }
}
