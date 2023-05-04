package rule;

import org.junit.Before;
import org.junit.Test;
import translator.dictionary.DictionaryRuleFour;
import translator.service.translate.impl.rule.RuleFour;

import static org.junit.Assert.assertEquals;

public class RuleFourTest {

    RuleFour ruleFour;

    @Before
    public void setUp() {
        ruleFour = new RuleFour(new DictionaryRuleFour());
    }

    @Test
    public void translateNoChangeTest() {
        assertEquals(ruleFour.translate("синхрофазотрон"), "синхрофазотрон");
        assertEquals(ruleFour.translate("океюшки"), "океюшки");
    }

    @Test
    public void translateChangeTest() {
        assertEquals(ruleFour.translate("еда"), "ѣда");
        assertEquals(ruleFour.translate("лелеять"), "лелѣять");
    }
}