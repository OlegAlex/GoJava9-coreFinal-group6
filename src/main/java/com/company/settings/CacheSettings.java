package com.company.settings;

public class CacheSettings extends SuperSettings {

    public boolean work;
    private String pathToYouTubeCache;

    public CacheSettings() {
        this.pathToYouTubeCache = "settings/YouTubeCache.json";
    }

    public void setCacheWork(String workInput) {
        if (SuperSettings.trueFalseCheckFromString(workInput).equals("true"))
            this.work = true;
        else this.work = false;
    }

    public String getPathToYouTubeCache() {
        return pathToYouTubeCache;
    }

    public void setPathToYouTubeCache(String pathToYouTubeCache) {
        this.pathToYouTubeCache = pathToYouTubeCache;
    }

}
