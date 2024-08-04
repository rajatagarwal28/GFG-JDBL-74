package ErrorAndExceptions;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Recursion recursion = new Recursion();
//        recursion.print();

//        AccessChar accessChar = new AccessChar();
//        System.out.println(accessChar.getChar(3));

//        ArrayList<AccessChar> arrayList = new ArrayList<>();
//        while(true) {
//            AccessChar accessChar = new AccessChar();
//            arrayList.add(accessChar);
//        }


        try{
            AccessChar accessChar = new AccessChar();
            System.out.println(accessChar.getChar(3));


            StorageAccessor storageAccessor = new StorageAccessor();
            storageAccessor.updateOrWriteData("as", "Sa");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

//        try {
//            // bank deduct from acc x -> fail DeductionFail, unknown exception
//            // bank credit into acc y -> credit fail
//        } catch (Deduction e) {
//           throws new Exception();
//        } finally {
//
//        }

//
//                1. Debit the balance from person x.
//                try {
//                    2. Credit the amount in person y account. -> throw new Exception()
//                } catch (Exception e){
//                    System.out.println(e.getMessage());
//                } finally {
//                    3. Credit the balance back into person x
//                }


    }

}
