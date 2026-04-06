import java.util.HashMap;
import java.util.Map;

public class UC8 {
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    static {
      
        patternMap.put('O', new String[]{
            "   ****   ", 
            " **    ** ", 
            " **    ** ", 
            " **    ** ", 
            " **    ** ", 
            " **    ** ", 
            "   ****   "
        });
        patternMap.put('P', new String[]{
            " ******   ", 
            " **    ** ", 
            " **    ** ", 
            " ******   ", 
            " **       ", 
            " **       ", 
            " **       "
        });
        patternMap.put('S', new String[]{
            "  *****   ", 
            " **       ", 
            " **       ", 
            "  ****    ", 
            "     **   ", 
            "     **   ", 
            " *****    "
        });
    }

    public static void main(String[] args) {
        // The core functionality: Rendering the word via the Map-driven function
        renderBanner("OOPS");
    }

    /**
     * UC8 Core Function: Retrieves patterns from Map and assembles the banner
     * using a StringBuilder within nested loops for maximum efficiency.
     */
    public static void renderBanner(String word) {
        if (word == null || word.isEmpty()) return;
        
        String input = word.toUpperCase();
        int bannerHeight = 7;

        // Outer loop iterates through each row of the banner (top to bottom)
        for (int row = 0; row < bannerHeight; row++) {
            StringBuilder lineAssembler = new StringBuilder();
            
            // Inner loop iterates through each character of the input word (left to right)
            for (char c : input.toCharArray()) {
                if (patternMap.containsKey(c)) {
                    // Constant time lookup from HashMap
                    lineAssembler.append(patternMap.get(c)[row]).append("  ");
                }
            }
            // Print the fully assembled horizontal line
            System.out.println(lineAssembler.toString());
        }
    }
}