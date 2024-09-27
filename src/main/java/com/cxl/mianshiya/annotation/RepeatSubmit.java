package com.cxl.mianshiya.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(ElementType.METHOD)
@Retention(value = RUNTIME)
public @interface RepeatSubmit {
    enum Type { PARAM, TOKEN };
    Type limitType() default Type.PARAM;
    int lockTime() default 5;
}