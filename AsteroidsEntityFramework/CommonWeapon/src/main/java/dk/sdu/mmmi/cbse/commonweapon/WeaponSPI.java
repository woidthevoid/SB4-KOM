package dk.sdu.mmmi.cbse.commonweapon;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;

public interface WeaponSPI {
    Entity createWeapon(Entity e, GameData gameData);
}
