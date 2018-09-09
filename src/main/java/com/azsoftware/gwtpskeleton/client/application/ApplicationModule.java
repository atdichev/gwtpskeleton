package com.azsoftware.gwtpskeleton.client.application;

import com.azsoftware.gwtpskeleton.client.application.home.HomeModule;
import com.azsoftware.gwtpskeleton.client.application.test.TestModule;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class ApplicationModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new HomeModule());
        install(new TestModule());

        bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class,
                ApplicationPresenter.MyProxy.class);
    }
}
