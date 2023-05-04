package translator.service.translate.impl.rule;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import translator.dictionary.DictionaryRuleFour;
import translator.service.translate.Translate;

@Service
@AllArgsConstructor
public class RuleFour implements Translate {
    private final DictionaryRuleFour dictionaryRuleFour;

    @Override
    public String translate(String str) {
        String changeStr = dictionaryRuleFour.getDictionary().get(str.toLowerCase());
        if (changeStr != null) {
            return changeStr;
        }
        return str;
    }

}
