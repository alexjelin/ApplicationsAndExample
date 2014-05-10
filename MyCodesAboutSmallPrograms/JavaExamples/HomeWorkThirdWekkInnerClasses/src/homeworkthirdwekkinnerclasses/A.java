package homeworkthirdwekkinnerclasses;

public class A {

    private String text = "Some text";

    private void printText(String thisText) {
        System.out.print(thisText);
    }

    public class B {

        public void printTextFromInnerClass(String thisText) {
            String ischange = "is change";
            String result = thisText.concat(ischange);
            printText(result);
        }
    }

    public void callerOfInnerClass() {
        B testobj = new B();
        System.out.println("Resyltat ot vareshniq klas e:");
        System.out.println("\n");
        testobj.printTextFromInnerClass(text);
        System.out.println("Resyltat ot vanshniq  klas e:");
        System.out.println("\n");
        printText(text);
        System.out.println("\n");
    }
}
