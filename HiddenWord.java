public class HiddenWord {
    private String secret;

    public HiddenWord() {
        this.secret = "";
    }

    public HiddenWord(String secret) {
        this.secret = secret;
    }

    public String getHint(String guess) {
        String str = "";
        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) == secret.charAt(i)) {
                str = str + guess.charAt(i);
            } else {
                if (secret.indexOf(guess.substring(i, i + 1)) != -1) {
                    str = str + "+";
                } else {
                    str = str + "*";
                }
            }
        }
        return str;
    }

    public static void main(String[] args) {
        HiddenWord puzzle = new HiddenWord(args[0]);

        System.out.println(puzzle.getHint("AAAAA"));
    }
}
