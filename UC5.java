public class UC5 {
    public static void main(String[] args) {
        // We define each letter segment with a fixed width of 6 characters
        // This ensures the letters stay "straight" and aligned vertically.
        String[] banner = {
            String.join("  ", "  **** ", "   **** ", " *****", "      ****"), // Row 0
            String.join("  ", "**    **", "**    **", "**    **", " ** "), // Row 1
            String.join("  ", "**    **", "**    **", "**    **", " ** "), // Row 2
            String.join("  ", "**    **", "**    **", "*****   ", "  *** "), // Row 3
            String.join("  ", "**    **", "**    **", "**      ", "     **"), // Row 4
            String.join("  ", "**    **", "**    **", "**      ", "     **"), // Row 5
            String.join("  ", "  **** ", "   **** ", " **      ", " **** ")  // Row 6
        };

        // Enhanced for-loop to render each row
        for (String row : banner) {
            System.out.println(row);
        }
    }
}