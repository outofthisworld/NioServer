package world.definitions.item;

import world.definitions.IDefinition;
import world.entity.player.combat.CombatStyle;
import world.interfaces.WeaponInterfaceType;

import java.util.ArrayList;
import java.util.Objects;


public class WeaponInterfaceDefinition implements IDefinition {
    private int interfaceId;
    private WeaponInterfaceType interfaceType;
    private int attackSpeed;
    private int nameLineId;
    private int specialBarId;
    private int specialMeterId;
    private ArrayList<Integer> weaponIds = new ArrayList<>();
    private CombatStyle[] combatStyles = new CombatStyle[4];


    public int getId() {
        return Objects.hash(interfaceType.name());
    }

    public int getInterfaceId() {
        return interfaceId;
    }

    public WeaponInterfaceType getInterfaceType() {
        return interfaceType;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public int getNameLineId() {
        return nameLineId;
    }

    public int getSpecialBarId() {
        return specialBarId;
    }

    public int getSpecialMeterId() {
        return specialMeterId;
    }

    public ArrayList<Integer> getWeaponIds() {
        return weaponIds;
    }

    public CombatStyle[] getCombatStlyes() {
        return combatStyles;
    }

    public String getInterfaceName() {
        return interfaceType.name();
    }
}
