package com.designpatter.behavioral.iterator.demo;

public interface Iterator<E>
{

    E next();   // to get the next element

    E currentItem();    // to get the current element

    boolean hasNext();  // to check whether there is any next element or not.
}