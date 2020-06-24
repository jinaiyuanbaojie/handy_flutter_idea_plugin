package com.flutter.utils.actions.ios;

import com.flutter.utils.base.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class PodInstallAction extends BaseAction {
    @Override
    public String getCommand(AnActionEvent e) {
        return "cd ./ios && pod install";
    }
}
