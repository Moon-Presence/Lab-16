public class Example2 {
    Object ob;
    Example2(Object o){
        ob=o;
    }
    Object getob(){
        return ob;
    }
    void showType(){
        System.out.println("Object type: "+ob.getClass().getName());
    }
}
