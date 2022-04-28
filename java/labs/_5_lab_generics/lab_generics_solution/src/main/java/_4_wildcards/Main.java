package _4_wildcards;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // 4 lists with different types, 3 are from the same hierarchy
        List<Grampa> grampas = List.of(
                new Grampa("Christopher"),
                new Grampa("Theodore"),
                new Grampa("Rudolph")
        );

        List<Father> fathers = List.of(
                new Father("Max"),
                new Father("Christopher"),
                new Father("Andrew")
        );

        List<Child> children = List.of(
                new Child("Henry"),
                new Child("Owen"),
                new Child("Noah")
        );

        List<String> names = List.of("Max","Rudolph");

        WildcardsExample wildEx = new WildcardsExample();
        //      we can pass all 3 lists from the same hierarchy
        wildEx.printNames_allFamily(grampas);
        wildEx.printNames_allFamily(fathers);
        wildEx.printNames_allFamily(children);
        //      but not, e.g. a list of Strings (compiler error)
        //      wildEx.printNames_allFamily(names);

        //      we can pass only 2 lists from the same hierarchy
        //      compiler error
        //      wildEx.printNames_fathersAndChildrenOnly(grampas);
        wildEx.printNames_fathersAndChildrenOnly(fathers);
        wildEx.printNames_fathersAndChildrenOnly(children);

        //      compiler error
        //      wildEx.printNames_grampasAndFathersOnly(children);
        wildEx.printNames_grampasAndFathersOnly(grampas);
        wildEx.printNames_grampasAndFathersOnly(fathers);
    }
}