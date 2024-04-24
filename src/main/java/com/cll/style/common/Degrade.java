package com.cll.style.common;

import com.cll.style.DegradeCityContent;

public abstract class Degrade<P, T> {
    private final Action<P, T> notDegradeAction;
    private final Action<P, T> degradeAction;

    public Degrade() {
        this.notDegradeAction = new Action<P, T>() {
            @Override
            public T doAction(P content) {
                return doNotDegradeAction(content);
            }
        };
        this.degradeAction = new Action<P, T>() {
            @Override
            public T doAction(P content) {
                return doDegradeAction(content);
            }
        };
        ;
    }

    public boolean doSwitch(P content) {
        return true;
    }

    public final T doAction(P content) {
        if (doSwitch(content)) {
            return notDegradeAction.doAction(content);
        }
        return degradeAction.doAction(content);
    }

    public abstract T doNotDegradeAction(P content);

    public abstract T doDegradeAction(P content);
}
