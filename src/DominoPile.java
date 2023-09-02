import java.util.ArrayList;
import java.util.Collections;

public class DominoPile {
    //properties
    private ArrayList<Domino> pile;

    //constructors
    public DominoPile(){
        pile = new ArrayList<>();
    }

    //methods
    public void newStack6(){
        int a = 0;
        for(int i = 0; i <= 6; i++) {
            for(int j = a; j <=6; j++) {
                pile.add(new Domino(i,j));
            }
            a++;

        }
    }

    //option 1
    //*public void shuffle(){
        //Collections.shuffle(pile);

    //}

    //option 2
    public void shuffle(){
        for(int i = 0; i<pile.size(); i++){
            int positionA = (int)(Math.random() * pile.size());
            int positionB = (int)(Math.random()*pile.size());
            Domino a = pile.get(positionA);
            Domino b = pile.get(positionB);
            pile.set(positionA, b);
            pile.set(positionB, a);


        }

    }

    public ArrayList<Domino> getPile(){
        return pile;
    }



}
