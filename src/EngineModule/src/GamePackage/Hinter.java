package GamePackage;

import java.util.Scanner;

public class Hinter extends Player {
    private Word.cardColor team;
    private String hint;
    private int wordsHint;
    Board fullBoard;

    public Hinter(Word.cardColor team) {
        this.team = team;
    }
    public Hinter(){}
    public Hinter(Hinter otherHinter){
        this.team = otherHinter.team;
        this.hint = otherHinter.hint;
    }

    public void setHint(String otherHint) {
        this.hint = otherHint;
    }

    public void setWordsHint(int wordsHint) {
        this.wordsHint = wordsHint;
    }

    public int getWordsHint() {
        return wordsHint;
    }

    public void getHint() {
        System.out.println("The hint is " + hint +",number of words related is " + wordsHint);
    }

    public void printBoard()
    {
        printFullBoard();
    }

    public void playTurn()
    {
        return;
    }

    public void printFullBoard(){
        return;
    }
    public void playHinterTurn(String hint,int numOfWords){
        setHint(hint);
        setWordsHint(numOfWords);
    }
}
