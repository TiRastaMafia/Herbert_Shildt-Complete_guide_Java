import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}

class MetaUpdate {
   // Method 'myMeth' now take two parametrs
   @MyAnno(str = "Two parametrs", val = 19)
   public static void myMeth(String str, int i)
   {
    MetaUpdate ob = new MetaUpdate();
    try {
        Class<?> c = ob.getClass();
        // THe types of parametrs are specified here
        Method m = c.getMethod("myMeth", String.class, int.class);
        MyAnno anno = m.getAnnotation(MyAnno.class);
        System.out.println(anno.str() + " " + anno.val());
    } catch (NoSuchMethodException exc) {
        System.out.println("Method not found");
    }
   }

   public static void main(String[] args){
        myMeth("test", 10);
        myMeth("test2", 20);
   }
}
