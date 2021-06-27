package design.pattern.composite;

public class ApplicationMain {

    /**   Composite Pattern
     *
     * Composite 패턴은 두가지 유형이 있다.
     * Uniformity(일관성) vs Type Safety(타입 안정성)
     * 일관성을 유지하는 방법으로는 Leaf와 Composite 객체가 의존하는 Component 객체에 자식을 다룰 수 있도록 하는
     * 메소드를 정의하는 것이다. 부모와 자식을 모두 일관성있는 객체로 사용할 수 있다는 장점이 있다.
     *
     * Type Safety 방법은 Composite 객체에 자식을 다룰 수 있도록 하는 메소드를 정의하는 방법이다.
     * 실행해야하는 역할(Leaf)와 자식을 갖고있는 역할을 나누어 볼 수 있다는 장점이 있다.
     *
     * 아래 예제에서는 Type Safety 방법을 다룬다.
     *
     * Ellipse을 Leaf으로 하고 Graphic을 Component으로 한다.
     **/
    public static void main(String[] args) {
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();
        Ellipse ellipse4 = new Ellipse();

        // compositeGraphic1이 root
        // compositeGraphic2, 3이 자식이 된다.
        CompositeGraphic compositeGraphic1 = new CompositeGraphic();
        CompositeGraphic compositeGraphic2 = new CompositeGraphic();
        CompositeGraphic compositeGraphic3 = new CompositeGraphic();

        // compositeGraphic2에 3개의 leaf을 넣어준다.
        compositeGraphic2.add(ellipse2);
        compositeGraphic2.add(ellipse3);
        compositeGraphic2.add(ellipse4);

        // compositeGraphic3에 1개의 leaf을 넣어준다.
        compositeGraphic3.add(ellipse1);

        compositeGraphic1.add(compositeGraphic2);
        compositeGraphic1.add(compositeGraphic3);

        // compositeGraphic1는 자식만 2개
        // compositeGraphic2는 leaf이 3개 자식은 없다.
        // compositeGraphic3는 leaf이 1개 자식은 없다.
        compositeGraphic1.print();
    }
}
