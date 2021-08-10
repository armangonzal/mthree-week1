public class ProjectGutenberg {
    public static void main(String[] args) {
        String[] phrases = {
                "Did you know that in 1440 (or thereabouts),",
                "Johannes Gutenberg invented the printing press?\n",
                "He started out as a goldsmith!\n",
                "His invention made it easy to print and",
                "distribute books to anyone who wanted one.\n",
                "We are like a modern Gutenberg,\n",
                "printing vast amounts to the waiting console with ease.\n",
        };

        for(String phrase: phrases)
            System.out.print(phrase);
    }
}