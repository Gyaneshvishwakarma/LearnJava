public class EggDropUnlimited {
    public static int findCriticalFloor(int n) {
        int low = 1, high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2; 

            
            boolean eggBreaks = doesEggBreak(mid);

            if (eggBreaks) {
                high = mid - 1; 
            } else {
                low = mid + 1; 
            }
        }

        return high;
    }

    
    private static boolean doesEggBreak(int floor) {
        int CRITICAL_FLOOR = 25; 
        return floor >= CRITICAL_FLOOR;
    }

    public static void main(String[] args) {
        int floors = 100; 
        int result = findCriticalFloor(floors);
        System.out.println("The critical floor is: " + result);
    }
}
