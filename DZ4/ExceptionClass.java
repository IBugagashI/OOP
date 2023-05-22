package OOP.DZ4;

public class ExceptionClass extends Exception {
    public ExceptionClass(String type){
        super(String.format("Тип %s несопоставим", type));
    }
}

