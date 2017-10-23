package screens;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

public class ScreenApp {

    public static void main(String[] args) {

        List<Screen> myScreens = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            myScreens.add(new Screen43());
            myScreens.add(new Screen169());
            myScreens.add(new Screen219());
        }

        for(Screen sc : myScreens) {
            Class c = sc.getClass();
            Annotation an = c.getAnnotation(Monitor.class);
            Monitor m = (Monitor) an;
            System.out.println(sc.getSize() + m.classification() + m.aspectRatio());
        }
    }
}