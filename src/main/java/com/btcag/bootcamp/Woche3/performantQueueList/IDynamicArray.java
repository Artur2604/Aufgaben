package com.btcag.bootcamp.Woche3.performantQueueList;

public interface IDynamicArray {
    int popFront();
    int popLast();
    int pushLast(int i);
    int pushFront(int i);
    int getValue(int i);
}
