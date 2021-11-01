package com.headfirst.build.effective;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : com.headfirst.build.effective
 * @Description : 实现构建器的方式之一
 * @Create on : 2021/10/30 22:43
 **/
public class ConcreteUser extends AbstractUser{

    private final NATURE nature;

    private ConcreteUser(ConcreteBuilder concreteBuilder) {
        super(concreteBuilder);
        this.nature = concreteBuilder.nature;
    }

    public static class ConcreteBuilder extends AbstractUser.Builder{

        private final NATURE nature;

        public ConcreteBuilder(NATURE na) {
            this.nature = na;
        }

        @Override
        protected ConcreteUser process() {
            System.err.println("处理逻辑一");
            return new ConcreteUser(this);
        }

        @Override
        public Builder build() {
            return this;
        }
    }
}
