package academy.devdojo.maratonajava.javacore.ZZAinnerclasses.test;

public class OuterClassTest01 {
    private String name = "Outer Class Name";

    class Inner {
        private String name = "Inner Class Name";

        public void printOuterData() {
            System.out.println(this.name);
            System.out.println(OuterClassTest01.this.name);
        }
    }

    public static void main(String[] args) {
        OuterClassTest01 outerClass = new OuterClassTest01();
        Inner innerClass = outerClass.new Inner();

        innerClass.printOuterData();
    }
}
