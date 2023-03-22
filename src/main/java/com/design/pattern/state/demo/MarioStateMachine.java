package com.design.pattern.state.demo;

/**
 * 马里奥状态机
 *
 * @author liuhangfei
 * @date 2023/03/21 17:36
 **/
public class MarioStateMachine {

    private int score;
    private State currentState;

    public MarioStateMachine(){
        score = 0;
        currentState = State.SMALL;
    }

    /**
     * 获得蘑菇房
     */
    public void obtainMashRoom(){
        if (currentState.equals(State.SMALL)){
            currentState = State.SUPER;
            score += 100;
        }
    }

    /**
     * 获得披肩
     */
    public void obtainCape(){
        if (currentState.equals(State.SMALL) || currentState.equals(State.SUPER)){
            currentState = State.CAPE;
            score += 200;
        }
    }

    /**
     * 获得Fire
     */
    public void obtainFireFlower(){
        if (currentState.equals(State.SMALL) || currentState.equals(State.SUPER)){
            currentState = State.FIRE;
            score += 300;
        }
    }

}
