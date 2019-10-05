package lesson5.textAnalyse;

public class LengthAnalyzer implements Analyzer {
    private int maxLength;

    public LengthAnalyzer(int maxLength){//конструктор
       this.maxLength=maxLength;
    }

    public boolean analyse(String text){
        if(text.length()>maxLength){
            return false;
        }

        return true;
    }
}
