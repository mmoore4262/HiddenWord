public class HiddenWord {
    private String actualWord;
    private String guess;
    public HiddenWord(String actualWord)
    {
        this.actualWord=actualWord;
    }
    public String getHint(String guess)
    {
        int l = 0;

        String hint = "";
        while (l < guess.length()) {
            for (int i = l; i != guess.length(); i++)
            {
                if (guess.substring(i, i + 1).equals(this.actualWord.substring(i, i + 1))) {
                    hint += this.actualWord.substring(i, i + 1);
                    l++;
                    break;
                }
                if(this.actualWord.indexOf(guess.substring(i,i+1))>=0) //(guess.indexOf(this.actualWord.substring(i, i + 1)) == (this.actualWord.indexOf(this.actualWord.substring(i, i + 1)))) {
                {  hint += "+";
                    l++;
                    break;

                }
                else {
                    hint += "*";
                    l++;
                    break;
                }
            }

        }
        return hint;

    }
}
