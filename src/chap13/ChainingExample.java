package chap13;

/**
 * 메소드 체이닝 방식으로 객체 필드 초기화
 */
public class ChainingExample {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza.dough("치즈크러스트")
                .source("칠리")
                .topping("올리브");

    }
}

class Pizza {
    String topping;
    String source;
    String dough;

//    Pizza(String topping, ... ) 생성자 대신
    Pizza topping(String topping) {
        this.topping = topping;
        return this;
    }

    Pizza source(String source) {
        this.source = source;
        return this;
    }

    Pizza dough(String dough) {
        this.dough = dough;
        return this;
    }
}
