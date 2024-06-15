package com.designpatterns.command.texteditor.command;

import com.designpatterns.command.texteditor.operations.Operations;

public class RedoCommand<T> implements ICommand<T> {

    Operations receiver;

    // constrcutor injection
    RedoCommand(Operations receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute(T t) {
        // do the undo operation
        // call the receiver function

        receiver.executeOperation(t);
    }

}
