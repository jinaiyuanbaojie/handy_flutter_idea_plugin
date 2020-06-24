package com.flutter.utils.actions.flutter;

import com.flutter.utils.base.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class FlutterCleanAction extends BaseAction {
    @Override
    public String getCommand(AnActionEvent e) {
        return "flutter clean";
    }
}
