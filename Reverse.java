package stringprocessing;

public class Reverse {

    public static void main(String[] args) {
        String[] n = "this is a train".split(" ");
        int length = n.length;
        String rs = "";
        for (int i = length - 1; i >= 0; i--) {

            System.out.print(n[i]+'\t');

        }
        System.out.println();
    }

}
