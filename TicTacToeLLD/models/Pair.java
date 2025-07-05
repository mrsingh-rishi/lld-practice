package models;

public class Pair<T, T1> {
    public T1 value;
    public T key;

    public Pair(T1 value, T key){
        this.value = value;
        this.key = key;
    }

    public T1 getValue(){
        return value;
    }

    public T getKey() {
        return key;
    }
}
