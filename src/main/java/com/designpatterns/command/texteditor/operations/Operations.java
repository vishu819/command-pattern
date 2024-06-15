package com.designpatterns.command.texteditor.operations;

public interface Operations<T> {
    public void executeOperation(T t);
}
