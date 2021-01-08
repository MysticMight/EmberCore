package com.github.Dewynion.embercore.ai;

import org.bukkit.entity.LivingEntity;

public interface Agent {
    LivingEntity getEntity();
    BehaviorTree getBehaviorTree();
}
