package com.ganesh.blogs.functional;

@FunctionalInterface
public interface Calculation<T> {
    T operation(T t1, T t2);
}
