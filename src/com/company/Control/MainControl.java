package com.company.Control;

import com.company.View.ViewManager;

public class MainControl
{
    public static Connexion conn;

    private static boolean connected;

    public static boolean isConnected() {
        return connected;
    }

    public static void setConnected(boolean isConnected)
    {
        MainControl.connected = isConnected;
        if(isConnected)
        {
            ViewManager.changeTabNavigation(true);
        }
        else ViewManager.changeTabNavigation(false);
    }
}
