package ru.netology.sqr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @Test
    public void ShouldCalcCountWithTwoLimit() {
        SQRService service = new SQRService();
        int actual = service. MathCalculate(200,300);
        int expected = 3;
        Assertions.assertEquals(expected, actual);

    }
@ParameterizedTest
    @CsvFileSource(resources = {"/testdata.csv"})
    public void test (int limit1, int limit2, int expected) {
        SQRService service = new SQRService();
        int actual = service. MathCalculate(limit1, limit2);
        Assertions.assertEquals(expected, actual);
}
}
