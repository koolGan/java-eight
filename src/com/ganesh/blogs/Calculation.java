package com.ganesh.blogs;

@FunctionalInterface
public interface Calculation<T> {
    T operation(T t1, T t2);
}
