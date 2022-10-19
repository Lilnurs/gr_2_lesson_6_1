public class Boss extends GameEntity {
    Weapon Bossweapon = new Weapon();

    public Weapon getBossweapon(WeaponType kineticWeapon) {
        return Bossweapon;
    }

    public void setBossweapon(Weapon bossweapon) {
        Bossweapon = bossweapon;
    }
    public String printinfo(){
        return " Skeleton Damage: " + getDamageBoss() + " Skeleton HP: " + getHpBoss() + " Skeleton Defence: " + getDefenceBoss();
    }
}
