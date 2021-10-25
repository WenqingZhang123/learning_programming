

class Outer {

    public void methodOuter() {
        class Inner { // inner class
            int num = 10;
            public void methodInner() {
                System.out.println(num); // 10
            }
        }

        Inner inner = new Inner();
        inner.methodInner();
    }

}
