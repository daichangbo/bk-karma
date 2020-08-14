package com.bk.karma.annotation;

import java.lang.annotation.*;

@Inherited
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataInit {

     /**
      * 是否非空,默认不能为空
      */
     boolean notNull() default true;

     /**
      * 默认值
      * @return
      */
     String defaultValue() default "";
}
