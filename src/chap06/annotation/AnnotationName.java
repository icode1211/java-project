package chap06.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 6.7 어노테이션 실습
 */
@Target({ElementType.FIELD, ElementType.TYPE, ElementType.METHOD})
public @interface AnnotationName {
    String elementNameOne();
    int elementNameTwo() default 5;
}
