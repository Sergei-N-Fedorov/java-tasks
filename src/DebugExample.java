public class DebugExample {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 5, 25, 30};
        int total = 0;
        
        for (int number : numbers) {
            total += number;
        }
        
        System.out.println("Total: "+ total);
    }    
}
