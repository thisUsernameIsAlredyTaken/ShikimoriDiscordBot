package com.zhivaevartem.siliciumbot.discord.listener.base;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for command handlers. All command handlers must be annotated.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CommandHandler {
  /**
   * Possible commands to invoke the handler.
   */
  String[] aliases();

  /**
   * How many arguments to parse.
   * The remaining arguments will fall into the "free argument".
   * If count is negative all remaining arguments will fall into the "free argument".
   * Default value is -1.
   */
  int argumentsCount() default -1;
}
