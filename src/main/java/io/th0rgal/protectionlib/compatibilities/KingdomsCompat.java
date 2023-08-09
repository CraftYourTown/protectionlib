package io.th0rgal.protectionlib.compatibilities;

import com.oxywire.kingdoms.KingdomsPlugin;
import com.oxywire.kingdoms.api.KingdomsApi;
import com.oxywire.kingdoms.entities.types.perms.Permission;
import io.th0rgal.protectionlib.ProtectionCompatibility;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class KingdomsCompat extends ProtectionCompatibility {

    private static KingdomsApi kingdomsApi;

    public KingdomsCompat(JavaPlugin mainPlugin, Plugin plugin) {
        super(mainPlugin, plugin);
        kingdomsApi = KingdomsPlugin.get().getKingdomsApi();
    }

    @Override
    public boolean canBuild(Player player, Location target) {
        return kingdomsApi.hasPermission(player, Permission.BLOCK_PLACE, target);
    }

    @Override
    public boolean canBreak(Player player, Location target) {
        return kingdomsApi.hasPermission(player, Permission.BLOCK_BREAK, target);
    }

    @Override
    public boolean canInteract(Player player, Location target) {
        return kingdomsApi.hasPermission(player, Permission.BLOCK_PLACE, target);
    }

    @Override
    public boolean canUse(Player player, Location target) {
        return kingdomsApi.hasPermission(player, Permission.BLOCK_PLACE, target);
    }
}
