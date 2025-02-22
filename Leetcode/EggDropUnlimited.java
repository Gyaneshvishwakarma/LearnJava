public class EggDropUnlimited {
    public static int findCriticalFloor(int n) {
        int low = 1, high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Find middle floor

            // Simulating egg breaking condition (you would replace this with actual test)
            boolean eggBreaks = doesEggBreak(mid);

            if (eggBreaks) {
                high = mid - 1; // Search in lower half
            } else {
                low = mid + 1; // Search in upper half
            }
        }

        return high; // Critical floor found
    }

    // Simulated function to determine if the egg breaks (Replace with real check)
    private static boolean doesEggBreak(int floor) {
        int CRITICAL_FLOOR = 25; // Assume the egg breaks at floor 25
        return floor >= CRITICAL_FLOOR;
    }

    public static void main(String[] args) {
        int floors = 100; // Example: 100 floors
        int result = findCriticalFloor(floors);
        System.out.println("The critical floor is: " + result);
    }
}
