public class Main {
    public static void main(String[] args) {
        Boss tanos = new Boss();
        tanos.setHpBoss(5000);
        tanos.setDamageBoss(60);
        tanos.setDefenceBoss("Magecal");
        tanos.getBossweapon(WeaponType.KINETIC_WEAPON);
        System.out.println("Boss HP: " + tanos.getHpBoss() + "Boss Damage; " + tanos.getDamageBoss() + "Boss Defence: " + tanos.getDefenceBoss() +
                "Boss Weapon: " + WeaponType.KINETIC_WEAPON);





        Skeleton skeleton = new Skeleton();
        skeleton.setHpBoss(5500);
        skeleton.setDamageBoss(70);
        skeleton.setArrows(100);
        skeleton.setDefenceBoss("Защита от магических атак ");
        System.out.println(skeleton.printinfo());

        Skeleton habib = new Skeleton();
        habib.setHpBoss(2300);
        habib.setDamageBoss(55);
        habib.setArrows(100);
        habib.setDefenceBoss("Защита от кинетических ударов ");
        System.out.println(habib.printinfo());


    }
}