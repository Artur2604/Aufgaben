package com.btcag.bootcamp.Woche3.QueueList;

public interface iQueueList {
    int popFront();
    int popLast();
    int pushLast(int i);
    int pushFront(int i);
    int get(int i);
}
