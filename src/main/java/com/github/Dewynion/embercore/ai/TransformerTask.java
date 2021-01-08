package com.github.Dewynion.embercore.ai;

import com.github.Dewynion.embercore.ai.TaskBase;

public abstract class TransformerTask extends TaskBase {
    protected TaskBase child;

    public TransformerTask(String name, TaskBase parent) {
        super(name, parent);
    }

    public void setChild(TaskBase newChild) {
        if (newChild != parent)
            child = newChild;
    }
}
