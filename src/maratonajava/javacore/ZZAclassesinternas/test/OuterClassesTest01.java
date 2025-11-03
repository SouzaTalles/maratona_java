package maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest01 {
    private String name = "Monkei D. Luffy";

    // Nested
    class Inner {
        public void printOuterClassAtrribute() {
            System.out.println("Name: " + name);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        Inner inner = outerClass.new Inner();
        inner.printOuterClassAtrribute();

        Inner inner2 = new OuterClassesTest01().new Inner();
        inner2.printOuterClassAtrribute();
    }
}
