package SnakeAndLadderOptimised.utils.rolledValueCalculator.implementations;

import SnakeAndLadderOptimised.utils.rolledValueCalculator.RolledValueCalculator;

import java.util.Random;
import java.util.logging.Logger;

public class DefaultRolledValueCalculator implements RolledValueCalculator {

    private Integer minRollValue;
    private Integer maxRollValue;
    private final Random random = new Random();
    private Integer rolledValueResult;
//    private Logger logger;

    private final Integer DEFAULT_MIN_ROLL_VALUE=1;
    private final Integer DEFAULT_MAX_ROLL_VALUE=6;

    public DefaultRolledValueCalculator() {
        this.minRollValue = DEFAULT_MIN_ROLL_VALUE;
        this.maxRollValue = DEFAULT_MAX_ROLL_VALUE;
//        this.logger = Logger.getLogger(this.getClass().getName());
//        this.logger.info(this.getClass().getName() + " has a minimum roll value of " + minRollValue
//        + " and a maximum roll value of " + maxRollValue);
        System.out.println(this.getClass().getSimpleName() + " has a has a minimum roll value of " +  minRollValue +
                 " and a maximum roll value of " + maxRollValue);
    }


    public DefaultRolledValueCalculator(Integer minRollValue, Integer maxRollValue) {
        this.minRollValue = minRollValue;
        this.maxRollValue = maxRollValue;
//        this.logger = Logger.getLogger(this.getClass().getName());
//        this.logger.info(this.getClass().getName() + " has a minimum roll value of " + minRollValue
//                + " and a maximum roll value of " + maxRollValue);
        System.out.println(this.getClass().getSimpleName() + " has a has a minimum roll value of " +  minRollValue +
                " and a maximum roll value of " + maxRollValue);
    }

    @Override
    public void calculateRolledValue() {
         this.rolledValueResult =random.nextInt(maxRollValue - minRollValue) + minRollValue;
//        this.logger.info("Obtained Rolled value " + this.rolledValueResult);
        System.out.println("Obtained Rolled value " + this.rolledValueResult);
    }

    @Override
    public Integer getRolledValue() {
//        this.logger.info("Returning rolled value result  " + this.rolledValueResult);
   //     System.out.println("Returning rolled value result  " + this.rolledValueResult);
        return this.rolledValueResult;
    }
}
