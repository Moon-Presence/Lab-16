public class Example3<T,V> {
    T ob1;
    V ob2;
    Example3(T o1, V o2){
        ob1=o1;
        ob2=o2;
    }
    void showTypes(){
        System.out.println("T type: "+ob1.getClass().getName()+
                "\nV type: "+ob2.getClass().getName());
    }
    T getob1(){
        return ob1;
    }
    V getob2(){
        return ob2;
    }
}
