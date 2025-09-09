package org.name.implementation;

import org.name.base.BaseClass;

public class ChromeBaseClassImplementation implements BaseClass {
    @Override
    public void openBrowser() {
        System.out.println("Chrome Browser Opened");
    }

    @Override
    public void navigate(String url) {
        System.out.println("Navigate to Url"+url);

    }

    public void enter(String userName){
        System.out.println("Specific to chrome");
    }
}
