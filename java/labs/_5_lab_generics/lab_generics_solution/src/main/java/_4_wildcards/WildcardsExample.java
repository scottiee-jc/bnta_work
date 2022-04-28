package _4_wildcards;

import java.util.List;

public class WildcardsExample {
    void printNames_grampasAndFathersOnly(List<? super Father> grampasAndFathers) {
        System.out.println(grampasAndFathers);
    }

    void printNames_fathersAndChildrenOnly(List<? extends Father> fathersAndChildren) {
        System.out.println(fathersAndChildren);
    }

    void printNames_allFamily(List<? super Child> all) {
        System.out.println(all);
    }
}