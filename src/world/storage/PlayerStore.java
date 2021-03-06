package world.storage;

import database.IDBAccessor;
import world.entity.player.Player;

/**
 * The type Player store.
 */
public class PlayerStore implements DataAccessor<Player, Player>, DataStore<Boolean, Player> {
    private final IDBAccessor<Player> playerDb;

    /**
     * Instantiates a new Player store.
     *
     * @param playerStore the player store
     */
    public PlayerStore(IDBAccessor<Player> playerStore) {
        playerDb = playerStore;
    }


    @Override
    public Boolean store(String key, Player o) {
        return playerDb.insert(o);
    }


    @Override
    public Player load(Player obj) {
        return playerDb.findOneAndPopulate(obj.getUsername(), obj);
    }
}
