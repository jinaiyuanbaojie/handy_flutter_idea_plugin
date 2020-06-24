package com.flutter.utils.actions.flutter;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.flutter.utils.base.BaseAction;

public class FormatAction extends BaseAction {

    @Override
    public String getCommand(AnActionEvent e) {
        return "flutter format ./lib";
    }
}
