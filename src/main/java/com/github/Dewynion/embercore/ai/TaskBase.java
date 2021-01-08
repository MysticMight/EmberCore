package com.github.Dewynion.embercore.ai;

public abstract class TaskBase {
    protected final String name;
    protected final boolean isRoot;
    protected final TaskBase parent;

    public TaskBase(String name, TaskBase parent) {
        this.name = name;
        this.parent = parent;
        this.isRoot = parent == null;
    }

    public TaskBase(String name) {
        this(name, null);
    }
}
