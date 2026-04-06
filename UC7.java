import java.util.HashMap;
import java.util.Map;

public class UC7 {

    static class CharacterPattern {
        private final String[] rows;

        public CharacterPattern(String[] rows) {
            this.rows = rows;
        }

        public String getRow(int index) {
            return (index < rows.length) ? rows[index] : "       "; 
        }
    }

    private static final Map<Character, CharacterPattern> registry = new HashMap<>();

    static {
        // Each pattern is exactly 7 characters wide to ensure vertical alignment
        registry.put('O', new CharacterPattern(new String[]{
            "  ****   ", 
            "**    ** ", 
            "**    ** ", 
            "**    ** ", 
            "**    ** ", 
            "**    ** ", 
            "  ****   "
        }));
        registry.put('P', new CharacterPattern(new String[]{
            "*****    ", 
            "**   **  ", 
            "**   **  ", 
            "*****    ", 
            "**       ", 
            "**       ", 
            "**       "
        }));
        registry.put('S', new CharacterPattern(new String[]{
            " ****    ", 
            "**       ", 
            "**       ", 
            " ****    ", 
            "    **   ", 
            "    **   ", 
            " ****    "
        }));
    }

    public static void main(String[] args) {
        String input = "OOPS";
        renderBanner(input);
    }

    /**
     * Renders the banner by iterating through rows first, then characters.
     */
    public static void renderBanner(String text) {
        String upperText = text.toUpperCase();
        
        // The banner is 7 rows high
        for (int i = 0; i < 7; i++) {
            StringBuilder lineBuilder = new StringBuilder();
            
            for (char c : upperText.toCharArray()) {
                if (registry.containsKey(c)) {
                    // Append the specific row for this character + 2 spaces for "gutter"
                    lineBuilder.append(registry.get(c).getRow(i)).append("  ");
                }
            }
            // Print the assembled line and trim trailing whitespace for neatness
            System.out.println(lineBuilder.toString().stripTrailing());
        }
    }
}