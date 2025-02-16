public class Longest {
    public static void main(String[] args) {
        int len = 0;
        int k = 0;
        if (args.length == 0) {
            System.out.println("No parameters");
        } else {
            for (int i = 0; i < args.length; i++) {
                if (args[i].length() > len) {
                    len = args[i].length();
                    k = i;
                }
            }
            System.out.println("Longest parameter: " + args[k]);
        }
    }
}