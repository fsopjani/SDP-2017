/**
 * Created by fatos on 18/02/2017.
 */
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;

// NOTE this test unit is only taking care of all the negative scenarios mentioned on the sheet.

public class UnitTestClass {

    Class<?> testClass;
    @Before
    public void method() throws ClassNotFoundException {

        testClass = Class.forName("MyTestClass");

    }

    @Test
    public void moreThanFourFields(){
        assertThat(Stream.of(testClass.getDeclaredFields()).collect(Collectors.toList()).size(), Matchers.lessThanOrEqualTo(4));
    }


    @Test
    public void anyNonPrivateFields(){
        assertThat(Stream.of(testClass.getDeclaredFields()).collect(Collectors.toList()).size(), Matchers.equalTo(0));
    }

    @Test
    public void anyFieldsOfTypeArray(){
        assertThat(Stream.of(testClass.getDeclaredFields()).anyMatch(c -> c.getType().toString().equalsIgnoreCase(ArrayList.class.toString())),Matchers.is(false));
    }

    @Test
    public void fewerThanTwoPrivateHelperMethods(){
        assertThat(Stream.of(testClass.getDeclaredMethods()).filter(c -> Modifier.isPrivate(c.getModifiers())).collect(Collectors.toList()).size(), Matchers.lessThan(2));
    }

    @Test
    public void anyMethodsThaTThrowsClause(){
        assertThat(Stream.of(testClass.getDeclaredMethods()).flatMap(c -> Stream.of(c.getExceptionTypes())).map(e -> e).collect(Collectors.toList()).size(), Matchers.is(0));
    }

    @Test
    public void anyMethodThatReturnsAnInt(){
        assertThat(Stream.of(testClass.getDeclaredMethods()).map(Method::getGenericReturnType).anyMatch(r -> r.getTypeName().equalsIgnoreCase(Integer.class.toString())),Matchers.is(true));
    }

    @Test
    public void missingZeroArgsConstructor(){
        assertThat(Stream.of(testClass.getConstructors()).anyMatch(r -> r.getParameterCount() == 0),Matchers.is(true));
    }

}
