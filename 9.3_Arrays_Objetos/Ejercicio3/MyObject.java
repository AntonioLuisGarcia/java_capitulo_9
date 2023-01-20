public class MyObject<T>{
    private T value;

    MyObject(){
        this.value = null;
    }

    MyObject(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}