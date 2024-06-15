package com.designpatterns.command.texteditor.command;

//Command interface
public interface ICommand<T> {
    public void execute(T t);
}
