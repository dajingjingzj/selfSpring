package com.atzj.springZhujie;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 类描述：
 * 方法中的 @Autowired
 * @author zhoujing129
 * @date 2019/7/16
 */
public class TextEditor {
    private SpellChecker spellChecker;
    @Autowired
    public void setSpellChecker( SpellChecker spellChecker ){
        this.spellChecker = spellChecker;
    }
    public SpellChecker getSpellChecker( ) {
        return spellChecker;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
