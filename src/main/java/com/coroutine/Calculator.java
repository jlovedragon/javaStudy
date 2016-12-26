package com.coroutine;

import kilim.Mailbox;
import kilim.Pausable;
import kilim.Task;

import java.math.RoundingMode;

/**
 * ${DESCRIPTION}
 *
 * @author riverxu
 * @create 2016-09-13-3:32.
 */
public class Calculator extends Task {

    private Mailbox<Calculation> mailbox;

    public Calculator(Mailbox<Calculation> mailbox) {
        super();
        this.mailbox = mailbox;
    }

    @Override
    public void execute() throws Pausable, Exception {
        while (true) {
            Calculation calc = mailbox.get();
            if (calc.getAnswer() == null) {
                calc.setAnswer(calc.getDividend().divide(calc.getDivisor(), 8, RoundingMode.HALF_UP));

                System.out.println("Calculator determined answer");
                mailbox.putnb(calc);
            }

            Task.sleep(1000);
        }
    }
}
