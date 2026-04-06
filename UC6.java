public class UC6 {

    public static void main(String[] args) {
        // UC6: Array initialization by calling helper methods for each row
        // This abstracts the construction of the word from the character patterns.
        String[] bannerLines = {
            assembleRow(0),
            assembleRow(1),
            assembleRow(2),
            assembleRow(3),
            assembleRow(4),
            assembleRow(5),
            assembleRow(6)
        };

        // Render the final banner
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    /**
     * Assembles a single horizontal line of the banner by joining character segments.
     */
    private static String assembleRow(int row) {
        return String.join("  ", 
            getOPattern(row), 
            getOPattern(row), 
            getPPattern(row), 
            getSPattern(row)
        );
    }

    // --- Helper Methods for Character Patterns ---

    private static String getOPattern(int row) {
        String[] pattern = {
            "   ****   ", 
            " **    ** ", 
            " **    ** ", 
            " **    ** ", 
            " **    ** ", 
            " **    ** ", 
            "   ****   "
        };
        return pattern[row];
    }

    private static String getPPattern(int row) {
        String[] pattern = {
            " ******   ", 
            " **    ** ", 
            " **    ** ", 
            " ******   ", 
            " **       ", 
            " **       ", 
            " **       "
        };
        return pattern[row];
    }

    private static String getSPattern(int row) {
        String[] pattern = {
            "  *****  ", 
            " **      ", 
            " **      ", 
            "  ****   ", 
            "     ** ", 
            "     ** ", 
            " *****   "
        };
        return pattern[row];
    }
}