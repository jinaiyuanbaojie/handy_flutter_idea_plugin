package com.flutter.utils.actions.buildrunner;

import com.flutter.utils.base.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class BuildRunnerAction extends BaseAction {

    @Override
    public String getCommand(AnActionEvent e) {
        return "flutter pub run build_runner build";
    }
}
