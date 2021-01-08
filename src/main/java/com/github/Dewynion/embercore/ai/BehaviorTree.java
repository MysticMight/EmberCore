package com.github.Dewynion.embercore.ai;

public class BehaviorTree {
    protected TaskBase root;

    public BehaviorTree() {}

    public TaskState evaluate() {
        if (root == null)
            return TaskState.SUCCESS;

    }
}
