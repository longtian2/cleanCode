package com.cll.style.common;

public interface Action<P, T> {
    T doAction(P content);
}
