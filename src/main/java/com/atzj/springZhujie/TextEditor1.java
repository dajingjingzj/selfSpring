package com.atzj.springZhujie;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 类描述：
 * 属性上的@Autowired，，去除setter方法
 * @author zhoujing129
 * @date 2019/7/16
 */
public class TextEditor1 {
    @Autowired
    private SpellChecker spellChecker;
    public TextEditor1() {
        System.out.println("Inside TextEditor1 constructor." );
    }
    public SpellChecker getSpellChecker( ) {
        return spellChecker;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
