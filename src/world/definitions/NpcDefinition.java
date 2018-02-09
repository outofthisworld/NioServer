/*
 Project by outofthisworld24
 All rights reserved.
 */

/*
 * Project by outofthisworld24
 * All rights reserved.
 */

/*------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 Project by outofthisworld24
 All rights reserved.
 -----------------------------------------------------------------------------*/

package world.definitions;

import database.CollectionAccessor;
import database.DatabaseConfig;
import database.IDBAccessor;
import database.serialization.GsonSerializer;

import java.util.Collections;
import java.util.List;

public final class NpcDefinition {
    private static final IDBAccessor<NpcDefinition> npcDB = new CollectionAccessor<>(new GsonSerializer<>(NpcDefinition.class), DatabaseConfig.NPC_COLLECTION);
    private static List<NpcDefinition> npcsDefinitions = null;

    static {
        if (NpcDefinition.npcsDefinitions == null) {
            NpcDefinition.npcsDefinitions = Collections.unmodifiableList(NpcDefinition.npcDB.findAll());
        }
    }

    private final boolean attackable = false;
    private final boolean retreats = false;
    private final boolean aggressive = false;
    private final boolean poisinous = false;
    private final int respawn = 20;
    private final int maxHit = 0;
    private final int attackSpeed = 6;
    private final int[] stats = new int[18];
    private final String[] combatTypes = new String[6];
    private int id;
    private String name;
    private String examine;
    private int size;
    private int walkRadius;
    private int hitpoints;
    private int attackAnim;
    private int defenceAnim;
    private int deathAnim;
    private int combatLevel;
    private int slayerLevel;
    private int combatFollowDistance;

    private NpcDefinition() {
    }

    public static NpcDefinition getForId(int id) {
        if (NpcDefinition.npcsDefinitions == null || id < 0 || id >= NpcDefinition.npcsDefinitions.size()) {
            return null;
        }

        return NpcDefinition.npcsDefinitions.get(id);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getExamine() {
        return examine;
    }

    public int getSize() {
        return size;
    }

    public int getWalkRadius() {
        return walkRadius;
    }

    public boolean isAttackable() {
        return attackable;
    }

    public boolean isRetreats() {
        return retreats;
    }

    public boolean isAggressive() {
        return aggressive;
    }

    public boolean isPoisinous() {
        return poisinous;
    }

    public int getRespawn() {
        return respawn;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public int getMaxHit() {
        return maxHit;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public int getAttackAnim() {
        return attackAnim;
    }

    public int getDefenceAnim() {
        return defenceAnim;
    }

    public int getDeathAnim() {
        return deathAnim;
    }

    public int getCombatLevel() {
        return combatLevel;
    }

    public int[] getStats() {
        return stats;
    }

    public int getSlayerLevel() {
        return slayerLevel;
    }

    public int getCombatFollowDistance() {
        return combatFollowDistance;
    }

    public String[] getCombatTypes() {
        return combatTypes;
    }
}