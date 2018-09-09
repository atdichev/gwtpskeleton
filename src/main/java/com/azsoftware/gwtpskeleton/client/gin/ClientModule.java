package com.azsoftware.gwtpskeleton.client.gin;

import com.azsoftware.gwtpskeleton.client.application.ApplicationModule;
import com.azsoftware.gwtpskeleton.client.place.NameTokens;
import com.azsoftware.gwtpskeleton.client.resources.ResourceLoader;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;

public class ClientModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new DefaultModule
                .Builder()
                .defaultPlace(NameTokens.HOME)
                .errorPlace(NameTokens.HOME)
                .unauthorizedPlace(NameTokens.HOME)
                .build());
        install(new ApplicationModule());

        bind(ResourceLoader.class).asEagerSingleton();
    }
}
