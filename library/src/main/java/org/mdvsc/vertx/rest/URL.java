package org.mdvsc.vertx.rest;

import java.lang.annotation.*;

/**
 * @author HanikLZ
 * @since 2017/3/1
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
public @interface URL {
    String value() default "";
    boolean regex() default false;
    boolean ignoreDeploy() default false;
    boolean ignoreMount() default false;
    Class[] mount() default {};
}

