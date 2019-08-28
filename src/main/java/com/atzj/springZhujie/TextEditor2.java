package com.atzj.springZhujie;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 类描述：
 * 属性上的@Autowired，，去除setter方法
 * @author zhoujing129
 * @date 2019/7/16
 */
public class TextEditor2 {

    private SpellChecker spellChecker;

    @Autowired
    public TextEditor2(SpellChecker spellChecker){
        System.out.println("Inside TextEditor constructor." );
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
