package com.headfirst.state.use;


/**
 * 状态模式重写糖果机
 */
public class CandyMechanica implements CandyState {

    private int count;
    /**
     * 当前状态
     */
    private CandyState nowState;

    // 有硬币
    private CandyState hasState;
    // 无硬币
    private CandyState notState;
    // 售罄
    private CandyState solidOutState;
    // 售出中
    private CandyState solidState;


    public CandyMechanica(int count) throws InterruptedException {
        notState = new NotState(this);
        solidOutState = new SoldOutState(this);
        hasState = new HasState(this);
        solidState = new SoldOutState(this);
        if (count <= 0) {
            throw new InterruptedException("初始化失败");
        } else {
            nowState = notState;
        }
        this.count = count;
    }

    @Override
    public void startUp() {
        nowState.startUp();
    }

    @Override
    public void putCoin() {
        nowState.putCoin();
    }

    @Override
    public void candySold() {
        nowState.candySold();
    }


    /**
     *
     */
    public static class HasState implements CandyState {

        private CandyMechanica candyMechanica;

        public HasState(CandyMechanica candyMechanica) {
            this.candyMechanica = candyMechanica;
        }

        @Override
        public void startUp() {
            candyMechanica.nowState = candyMechanica.solidState;
            candyMechanica.candySold();
            System.out.println("糖果售出中，请稍后");
        }

        @Override
        public void putCoin() {
            System.out.println("当前已有糖果，请勿重复投入");
        }

        @Override
        public void candySold() {
            System.out.println("糖果已售罄");
        }
    }


    /**
     * 售罄状态
     */
    public static class SoldOutState implements CandyState {

        private CandyMechanica candyMechanica;

        public SoldOutState(CandyMechanica candyMechanica) {
            this.candyMechanica = candyMechanica;
        }

        @Override
        public void startUp() {
            System.out.println("糖果已售罄");
        }

        @Override
        public void putCoin() {
            System.out.println("糖果已售罄,您投入的硬币将会在稍后退回");
        }

        @Override
        public void candySold() {
            System.out.println("糖果已售罄");
        }
    }

    /**
     * 售出状态
     */
    public static class SoldState implements CandyState {

        private CandyMechanica candyMechanica;

        public SoldState(CandyMechanica candyMechanica) {
            this.candyMechanica = candyMechanica;
        }

        @Override
        public void startUp() {
            System.out.println("糖果售出中，请稍后");
        }

        @Override
        public void putCoin() {
            System.out.println("糖果售出中，请勿重复投放");
        }

        @Override
        public void candySold() {
            System.out.println("糖果已售出，请取走您的糖果");
            candyMechanica.count--;
            if (candyMechanica.count == 0) {
                System.out.println("当前糖果已经售罄");
                candyMechanica.nowState = candyMechanica.solidOutState;
            }
            candyMechanica.nowState = candyMechanica.notState;
        }
    }

    /**
     * 无硬币状态
     */
    public static class NotState implements CandyState {

        private CandyMechanica candyMechanica;

        public NotState(CandyMechanica candyMechanica) {
            this.candyMechanica = candyMechanica;
        }

        @Override
        public void startUp() {
            System.out.println("当前糖果机没有硬币，请先投入硬币");
        }

        @Override
        public void putCoin() {
            candyMechanica.nowState = candyMechanica.hasState;
            System.out.println("投入硬币成功，请开启糖果机");
        }

        @Override
        public void candySold() {
            System.out.println("当前机器内没有硬币，请先投入硬币");
        }
    }
}
