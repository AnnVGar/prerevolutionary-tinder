package rule;

import org.junit.Before;
import org.junit.Test;
import translator.dictionary.DictionaryRuleThree;
import translator.service.translate.impl.rule.RuleThree;

import static org.junit.Assert.assertEquals;

public class RuleThreeTest {
    RuleThree ruleThree;

    @Before
    public void setUp() {
        ruleThree = new RuleThree(new DictionaryRuleThree());
    }

    @Test
    public void translateNoChangeTest() {
        assertEquals(ruleThree.translate("Франческа"), "Франческа");
        assertEquals(ruleThree.translate("фиалка"), "фиалка");
    }

    @Test
    public void translateChangeTest() {
        assertEquals(ruleThree.translate("Агафья"), "Агаѳья");
        assertEquals(ruleThree.translate("Феофанъ"), "Ѳеофанъ");
    }

}