public class Pythagorean {
    public double calculateHypotenuse(int lenA, int lenB) {
        double hyp = Math.sqrt((lenA * lenA) + (lenB * lenB));
        return hyp;
    }
}