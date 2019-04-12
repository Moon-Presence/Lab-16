public class Example1<T> {
    T ob;
    Example1(T o){
        ob = o;
    }
    T getob(){
        return ob;
    }
    void showType(){
        System.out.println("T type: "+ob.getClass().getName());
    }
}
