package org.name.implementation;

import org.name.base.BaseClass;

public class FireFoxBaseClassImplementation implements BaseClass {
    @Override
    public void openBrowser() {
        System.out.println("FireFox Browser opened");
    }

    @Override
    public void navigate(String url) {
        System.out.println("Navigate to url in firefox browser "+url);

    }
}
