package org.horrgs.siteapi.example;

/**
 * Created by Horrgs on 9/18/2015.
 */
public interface SiteJson {

    public boolean isStatus();

    public String getMotd();

    public String getVersion();

    public int getPlayersOnline();

    public int getMaxPlayers();

    public String getPing();
}
