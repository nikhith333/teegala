package com.tnsif.day14;



import static org.junit.Assert.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParamTest {

    @ParameterizedTest
    @ValueSource(strings = {"calhi", "bali"})
    void endsWithI(String str) {
        assertTrue(str.endsWith("i"));
        		
}

}
