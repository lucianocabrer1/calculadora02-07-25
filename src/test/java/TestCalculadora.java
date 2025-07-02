import org.example.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculadora {

    public Calculadora calculadora = new Calculadora();

    @Test
    public void testSuma(){
        Assertions.assertFalse(calculadora.Suma(2,3)==6);
    }

    @Test
    public void testSumaCorrecta(){
        Assertions.assertEquals(5, calculadora.Suma(2,3));
    }

    @Test
    public void testMultiplicacion(){
        Assertions.assertEquals(10,calculadora.multiplicacion(2,5));
    }

    @Test
    public void testResta(){
        Assertions.assertEquals(2,calculadora.Resta(5,3));
    }

    @Test
    public void testResta2(){
        Assertions.assertEquals(2,calculadora.Resta(5,3));
    }
}
