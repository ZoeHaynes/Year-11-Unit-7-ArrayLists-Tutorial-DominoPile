public class Domino {
    //properties
    private int top;
    private int bottom;

    //constructor
    public Domino(){
        top = 0;
        bottom = 0;
    }

    public Domino(int top, int bottom){
        this.top = top;
        this.bottom = bottom;

    }

    //methods
    public int getTop(){
        return this.top;
    }

    public int getBottom(){
        return this.bottom;
    }
    public void setTop(int top){
        this.top = top;
    }

    public void setBottom(int bottom){
        this.bottom = bottom;
    }

    public String toString(){
        return this.top + "/" + this.bottom;
    }

    public void flip(){
        int a = this.top;
        this.top = this.bottom;
        this.bottom = a;

    }

    public void settle(){
        if(this.top>this.bottom){
            this.flip();
        }

    }
    public int compareTo(Domino other){
        this.settle();
        other.settle();
        if(this.top<other.top){
            return -1;
        }
        else if(other.top<this.top){
            return 1;
        }
        else{
            if(this.bottom<other.bottom){
                return -1;
            }
            else if(other.bottom<this.bottom){
                return 1;
            }
            else{
                return 0;
            }


        }

    }

    public int compareToWeight(Domino other){
        int totalDots = this.top+this.bottom;
        int otherTotalDots = other.bottom+other.top;
        if(totalDots>otherTotalDots){
            return 1;
        }
        else if(totalDots<otherTotalDots){
            return -1;
        }
        return 0;

    }

    public boolean canConnect(Domino other){
        if(this.top==other.top || this.top==other.bottom || this.bottom==other.top || this.bottom==other.bottom){
            return true;
        }
        return false;
    }





}
