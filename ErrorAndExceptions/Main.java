package ErrorAndExceptions;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Recursion recursion = new Recursion();
//        recursion.print();

        AccessChar accessChar = new AccessChar();
        System.out.println(accessChar.getChar(3));

//        ArrayList<AccessChar> arrayList = new ArrayList<>();
//        while(true) {
//            AccessChar accessChar = new AccessChar();
//            arrayList.add(accessChar);
//        }



        StorageAccessor storageAccessor = new StorageAccessor();
        storageAccessor.updateOrWriteData("as", "Sa");
    }

}
