package com.designpatterns.command.texteditor.operations;

//Receiver
public class AddtextOperationImpl<T> implements Operations<T>{
    @Override
    public void executeOperation(T t) {
        String s = (String)t;

    }
}
