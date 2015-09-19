package org.horrgs.siteapi.example;

import org.horrgs.siteapi.Site;
import org.json.JSONException;

/**
 * Created by Horrgs on 9/18/2015.
 */
public class SiteExample implements SiteJson {
    static Site site = new Site("https://mcapi.ca/query/us.mineplex.com/info");
    public static void main(String[] args) {
        site.startJson(null, null);
        SiteExample sE = new SiteExample();
        System.out.println(sE.isStatus());
        System.out.println(sE.getMotd());
    }


    @Override
    public boolean isStatus() {
        return site.get(null, "status");
    }

    @Override
    public String getMotd() {
        return site.get(null, "motd");
    }

    @Override
    public String getVersion() {
        return site.get(null, "version");
    }

    @Override
    public int getPlayersOnline() {
        try {
            return site.get(site.getJsonObject().getJSONObject("players"), "online");
        } catch(JSONException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    @Override
    public int getMaxPlayers() {
        try {
            return site.get(site.getJsonObject().getJSONObject("players"), "max");
        } catch(JSONException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    @Override
    public String getPing() {
        return site.get(null, "ping");
    }
}
