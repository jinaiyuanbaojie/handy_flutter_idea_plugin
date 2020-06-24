package com.flutter.utils.actions.ios;

import com.flutter.utils.base.IOSProjectBaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class CleaniOSProjectAction extends IOSProjectBaseAction {
    @Override
    public String getCommand(AnActionEvent e) {
        return "xcodebuild clean";
    }
}
