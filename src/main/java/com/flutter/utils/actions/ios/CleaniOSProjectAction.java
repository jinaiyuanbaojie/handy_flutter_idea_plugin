package com.flutter.utils.actions.ios;

import com.flutter.utils.base.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class CleaniOSProjectAction extends BaseAction {
    @Override
    public String getCommand(AnActionEvent e) {
        return "cd ./ios && xcodebuild clean";
    }
}
