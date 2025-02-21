public class PythagoreanTriples {
    public static void main(String[] args) {
        int limit = 50; 

        System.out.println("Pythagorean Triples (a, b, c) where a^2 + b^2 = c^2:");

        for (int a = 1; a <= limit; a++) {
            for (int b = a + 1; b <= limit; b++) { 
                int cSquare = a * a + b * b;
                int c = (int) Math.sqrt(cSquare);

                if (c * c == cSquare && c <= limit) { 
                    System.out.println(a + ", " + b + ", " + c);
                }
            }
        }
    }
}
