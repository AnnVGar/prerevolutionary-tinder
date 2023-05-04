package translator.service.translate.impl.rule;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import translator.dictionary.DictionaryRuleThree;
import translator.service.translate.Translate;

@Service
@AllArgsConstructor
public class RuleThree implements Translate {
    private final DictionaryRuleThree dictionaryRuleThree;

    @Override
    public String translate(String str) {
        String changeStr = dictionaryRuleThree.getDictionary().get(str.toLowerCase());

        if (changeStr != null) {
            return firstLetterUpperCase(changeStr);
        }
        return str;
    }

    private String firstLetterUpperCase(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
