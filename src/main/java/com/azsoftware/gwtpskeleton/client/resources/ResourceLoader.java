package com.azsoftware.gwtpskeleton.client.resources;

import javax.inject.Inject;

public class ResourceLoader {
    @Inject
    ResourceLoader(AppResources appResources) {
        appResources.normalize().ensureInjected();
        appResources.style().ensureInjected();
    }
}
