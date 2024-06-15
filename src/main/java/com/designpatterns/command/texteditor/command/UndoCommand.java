package com.designpatterns.command.texteditor.command;


// Invoker, Receiver, ConcreteCommand
/*
Receiver know how to do the operation , actual business logic
ConcreteCommand is the impl of command execute . It communicates with receiver to do the operation
Client is the remote application

 */

import com.designpatterns.command.texteditor.operations.Operations;

//Concrete Command
public class UndoCommand<T> implements ICommand<T> {

    Operations receiver;

    // constrcutor injection
    UndoCommand(Operations receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute(T t) {
        // do the undo operation
        // call the receiver function

        receiver.executeOperation(t);
    }
}
