package com.company.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}

// T is generic in java.
// implements Iterator<String>, current() will return a string;
// implements Iterator<User>, current () will return a User type.
