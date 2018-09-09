package com.azsoftware.gwtpskeleton.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

public interface AppResources extends ClientBundle {
    interface Normalize extends CssResource {
    }

    interface Style extends CssResource {
    }

    @Source("normalize.gss")
    Normalize normalize();

    @Source("style.gss")
    Style style();
}
