package com.signingofdocuments.view;

import com.signingofdocuments.controller.utils.UserType;
import com.signingofdocuments.model.menus.IssuerMenu;
import com.signingofdocuments.model.menus.SignatoryMenu;

public class UserMenu implements UserInterface{

    private IssuerMenu issuerMenu = new IssuerMenu();
    private SignatoryMenu signatoryMenu = new SignatoryMenu();

    public void presentMenu(UserType userType) {
        switch (userType){
            case UserType.Issuer -> System.out.println(issuerMenu.getMenuInfo());
            case UserType.Signatory -> System.out.println(signatoryMenu.getMenuInfo());
        }
    }
}
