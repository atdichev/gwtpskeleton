package com.azsoftware.gwtpskeleton.client.application.test;

import com.azsoftware.gwtpskeleton.client.application.ApplicationPresenter;
import com.azsoftware.gwtpskeleton.client.place.NameTokens;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;

public class TestPresenter extends Presenter<TestPresenter.MyView, TestPresenter.MyProxy>  {
    interface MyView extends View  {
    }
    
    @ProxyCodeSplit
    @NameToken(NameTokens.TEST)
    interface MyProxy extends ProxyPlace<TestPresenter> {
    }

    @Inject
    TestPresenter(
            EventBus eventBus,
            MyView view, 
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN);
    }
}