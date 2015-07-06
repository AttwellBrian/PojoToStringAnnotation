package com.brianattwell;

import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;

/**
 * Create a function in {@link StringUtil} for creating strings.
 */
@Target(value = TYPE)
public @interface StaticStringUtil {}