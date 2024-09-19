package chap10.inherit;

/**
 * 제네릭 클래스 상속 Test
 */
public class InheritGenericExample {
    public static void main(String[] args) {
        Tv tv = new Tv();
        ChildProduct<Tv, String, String> childProduct =
                new ChildProduct(tv, "galaxy book", "samsung");

        String company = childProduct.getCompany();
        System.out.println(company);
    }
}
