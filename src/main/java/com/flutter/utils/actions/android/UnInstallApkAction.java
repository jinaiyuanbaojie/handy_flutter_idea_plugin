package com.flutter.utils.actions.android;

import com.flutter.utils.base.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class UnInstallApkAction extends BaseAction {
    @Override
    public String getCommand(AnActionEvent e) {
        return "adb uninstall com.honeywell.mes";
    }
}
