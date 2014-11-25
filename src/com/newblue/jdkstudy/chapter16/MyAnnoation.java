package com.newblue.jdkstudy.chapter16;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by levi on 2014/11/19.
 */
@Retention(value= RetentionPolicy.RUNTIME)
public @interface MyAnnoation {
    public String value() default "11";

    public String key();
}
