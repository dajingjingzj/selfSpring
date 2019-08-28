package com.atzj.springautowire;

/**
 * 类描述：
 *
 * @author zhoujing129
 * @date 2019/7/16
 */
public class TextEditor {
    private SpellChecker spellChecker;
    private String name;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public String getName() {
        System.out.println("this is "+ name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
