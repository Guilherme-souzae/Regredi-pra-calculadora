import org.example.Utils;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class UtilsTest
{
    @Test
    public void TesteSoma()
    {
        int resultado = Utils.somar(2, 2);
        assertEquals(4, resultado);
    }

    @Test
    public void TesteSubtracao()
    {
        int resultado = Utils.subtrair(10, 100);
        assertEquals(-90, resultado);
    }

    @Test
    public void TesteMultiplicacao()
    {
        int resultado = Utils.multiplicar(10, -5);
        assertEquals(-50, resultado);
    }

    @Test
    public void TesteDivisao()
    {
        double resultado = Utils.dividir(100, 2);
        assertEquals(50, resultado);
    }

    @Test
    public void TesteDivisaoVirgula()
    {
        double resultado = Utils.dividir(11, 2);
        assertEquals(5.5, resultado);
    }

    @Test
    public void TestePotencia()
    {
        int resultado = Utils.potencia(5,3);
        assertEquals(125, resultado);
    }

    @Test
    public void TesteRaiz()
    {
        double resultado = Utils.raiz(144);
        assertEquals(12, resultado);
    }

    @Test
    public void TesteSomaError()
    {
        int resultado = Utils.somar(2, 2);
        assertEquals(-10, resultado);
    }

    @Test
    public void TesteSubtracaoError()
    {
        int resultado = Utils.subtrair(10, 100);
        assertEquals(90, resultado);
    }

    @Test
    public void TesteMultiplicacaoError()
    {
        int resultado = Utils.multiplicar(10, -5);
        assertEquals(-110, resultado);
    }

    @Test
    public void TesteDivisaoError()
    {
        double resultado = Utils.dividir(100, 2);
        assertEquals(5, resultado);
    }

    @Test
    public void TesteDivisaoVirgulaError()
    {
        double resultado = Utils.dividir(11, 2);
        assertEquals(5.5112131, resultado);
    }

    @Test
    public void TestePotenciaError()
    {
        int resultado = Utils.potencia(5,3);
        assertEquals(25, resultado);
    }

    @Test
    public void TesteRaizError()
    {
        double resultado = Utils.raiz(144);
        assertEquals(121, resultado);
    }
}
