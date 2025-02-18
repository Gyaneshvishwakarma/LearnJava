class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("This is my first Java program.");
        System.out.println("I'm learning Java programming.");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping 3 using continue.");
                continue;
            }
            if (i == 5) {
                System.out.println("Breaking loop at 5.");
                break;
            }
            System.out.println("Iteration: " + i);
        }
    }
}