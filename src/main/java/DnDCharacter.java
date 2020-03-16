class DnDCharacter {

    private int constitution;

    public DnDCharacter() {
        constitution = getRandomAbilityLevel();
    }

    int getRandomAbilityLevel() {
        return 3 + (int) (Math.random() * 16);
    }

    int ability() {
        return getRandomAbilityLevel();
    }

    int modifier(int input) {
        int result = Math.floorDiv((input - 10), 2);
        return result;        
    }

    int getStrength() {
        return getRandomAbilityLevel();
    }

    int getDexterity() {
        return getRandomAbilityLevel();
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return getRandomAbilityLevel();
    }

    int getWisdom() {
        return getRandomAbilityLevel();
    }

    int getCharisma() {
        return getRandomAbilityLevel();
    }

    int getHitpoints() {
        return 10 + modifier(getConstitution());
    }

}
