package com.flutter.utils.actions.android;

import com.flutter.utils.base.AndroidProjectBaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class UnInstallApkAction extends AndroidProjectBaseAction {

    @Override
    public String getCommand(AnActionEvent e) {
        return "adb uninstall com.honeywell.mes";
    }
}
