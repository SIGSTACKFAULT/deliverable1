package war;

class PlayerDeck {
    private Player parent;

    PlayerDeck(Player parent){
        this.parent = parent;
    }

    public Player getParent(){
        return this.parent;
    }
}
