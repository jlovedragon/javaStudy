package com.coroutine;

import java.math.BigDecimal;

/**
 * ${DESCRIPTION}
 *
 * @author riverxu
 * @create 2016-08-26-12:27.
 */
public class Calculation {
    private BigDecimal dividend;
    private BigDecimal divisor;
    private BigDecimal answer;

    public Calculation(BigDecimal dividend, BigDecimal divisor) {
        super();
        this.dividend = dividend;
        this.divisor = divisor;
    }

    public BigDecimal getDividend() {
        return dividend;
    }

    public void setDividend(BigDecimal dividend) {
        this.dividend = dividend;
    }

    public BigDecimal getDivisor() {
        return divisor;
    }

    public void setDivisor(BigDecimal divisor) {
        this.divisor = divisor;
    }

    public BigDecimal getAnswer() {
        return answer;
    }

    public void setAnswer(BigDecimal answer) {
        this.answer = answer;
    }

    public String printAnswer() {
        return "Calculation{" +
                "dividend=" + dividend +
                ", divisor=" + divisor +
                ", answer=" + answer +
                '}';
    }
}