package chap09.inherit;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 부모 메소드와 다른 예외(Exception)를 throws 할 수 없음
 * - 부모 메소드와 같은 예외, 혹은 그 하위 예외는 가능
 * 	ex. IOException / FileNotFoundException
 * - 단, 런타임예외는 해당 규칙에 적용안됨
 *  ex. NumberFormatException, ClassCastException,
 * 	ArithmeticException, NullPointerException, ...
 */
public class Child extends Parent {
    @Override
    void method() throws NumberFormatException {

    }
}
