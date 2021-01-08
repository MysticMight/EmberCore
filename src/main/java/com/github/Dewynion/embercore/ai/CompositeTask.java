package com.github.Dewynion.embercore.ai;

import java.util.ArrayList;

public abstract class CompositeTask extends TaskBase {
    protected ArrayList<TaskBase> children;
    public CompositeTask() {
        children = new ArrayList<>();
    }
}
