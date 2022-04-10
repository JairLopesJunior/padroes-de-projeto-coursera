import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    @Test
    public void testSemDesconto() {
        ItemDepoisDasModificacoes i = new ItemDepoisDasModificacoes("tenis", 150.00);
        assertEquals(300.0, i.precoQuantidade(2), 0.001);
        assertEquals("tenis R$150.0", i.toString());
    }

    @Test
    public void testDescontoPercentual() {
        ItemDepoisDasModificacoes i = new ItemDepoisDasModificacoes("tenis", 150.00, new DescontoPercentual(10));
        assertEquals(270.0, i.precoQuantidade(2), 0.001);
        assertEquals("tenis R$135.0", i.toString());
    }

    @Test
    public void testDescontoAbsoluto() {
        ItemDepoisDasModificacoes i = new ItemDepoisDasModificacoes("tenis", 150.00, new DescontoAbsoluto(10));
        assertEquals(280.0, i.precoQuantidade(2), 0.001);
        assertEquals("tenis R$140.0", i.toString());
    }
}
