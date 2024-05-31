package com.saucedo.lab01;

public class Investment {
    private double investmentAmount;
    private int numberOfYears;
    private double annualInterestRate;
    private java.util.Date loanDate;
    /** Default constructor */
    public Investment() {
        this(10000, 2, 5.75);
    }

    /** Construct a loan with specified annual interest rate,
     number of years, and loan amount
     */
    public Investment(double investmentAmount, int numberOfYears, double annualInterestRate) {
        this.investmentAmount = investmentAmount;
        this.numberOfYears = numberOfYears;
        this.annualInterestRate = annualInterestRate;
        loanDate = new java.util.Date();
    }
    /** Return annualInterestRate */
    public double getInvestmentAmount() {
        return investmentAmount;
    }
    /** Set a new Investment Amount */
    public void setInvestmentAmount(double investmentAmount) {
        this.investmentAmount = investmentAmount;
    }

    /** Return numberOfYears */
    public int getNumberOfYears() {
        return numberOfYears;
    }
    /** Set a new numberOfYears */
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    /** Return Annual Interest Rate */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    /** Set a new Annual Interest Rate */
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /** Find monthly payment */
    public double getMonthlyInterest() {
        double monthlyInterestRate = (annualInterestRate * .01) / 12;
        //double monthlyPayment = annualInterestRate * monthlyInterestRate / (1 -
        //        (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyInterestRate;
    }

    /** Find future value */
    public double getFutureValue() {
        double futureBase = 1 + getMonthlyInterest();
        double toPowerOf = numberOfYears * 12;
        double poweredUp = Math.pow(futureBase, toPowerOf);
        double futureValue = getInvestmentAmount() * poweredUp;
        return futureValue;
    }
    /** Return loan date */
    public java.util.Date getLoanDate() {
        return loanDate;
    }
}