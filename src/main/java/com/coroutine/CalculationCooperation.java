package com.coroutine;

import kilim.Mailbox;
import kilim.Task;

/**
 * ${DESCRIPTION}
 *
 * @author riverxu
 * @create 2016-09-13-3:39.
 */
public class CalculationCooperation {

    public static void main(String[] args) {
        Mailbox<Calculation> sharedMailbox = new Mailbox<Calculation>();

        Task deferred = new DeferredDivision(sharedMailbox);
        Task calculator = new Calculator(sharedMailbox);

        deferred.start();
        calculator.start();
    }
}
