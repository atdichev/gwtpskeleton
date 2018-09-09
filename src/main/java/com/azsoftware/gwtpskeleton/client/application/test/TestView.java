package com.azsoftware.gwtpskeleton.client.application.test;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

class TestView extends ViewImpl implements TestPresenter.MyView {
    interface Binder extends UiBinder<Widget, TestView> {
    }

    @Inject
    TestView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}