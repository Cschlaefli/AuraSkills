package dev.aurelium.auraskills.common.modifier;

import dev.aurelium.auraskills.common.user.User;

public interface ModifierManager {

    void applyModifiers(User user, boolean reload);

}
