package org.mdvsc.vertx.rest;

import java.lang.annotation.*;

/**
 *
 * @author HanikLZ
 * @since 2017/3/1
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.PARAMETER })
public @interface Body {
    String defaultValue() default Constants.DEFAULT_VALUE_NULL;
}
