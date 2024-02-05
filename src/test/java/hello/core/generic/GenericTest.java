package hello.core.generic;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GenericTest {

    @Getter
    @Setter
    static class Sample<T>{
        private T data;
    }

    @Test
    @DisplayName("제네릭 테스트")
    void genericTest() {
        Sample<String> sample = new Sample<>();

        sample.setData("hello");
        System.out.println("sample = " + sample.getData());
    }
}
