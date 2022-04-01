import java.util.ArrayList;
import java.util.List;

public class myApp {

    void myApp(){
        System.out.println("Constructor");
    }

    public void m1(){
        String s="";
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list=null;
        list.add(1);
        Object obj=getData();
        System.out.println(obj.toString());

    }
    public Object getData(){
        return null;
    }
    public static void main(String[] args) {
        myApp app=new myApp();
        app.m1();

    }
}
