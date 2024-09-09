package chap06.annotation;

@AnnotationName(elementNameOne = "값", elementNameTwo = 3)
public class ClassName {

    @AnnotationName(elementNameOne = "값")
    int field;

    @AnnotationName(elementNameOne = "값")
    void method() {

    }
}
