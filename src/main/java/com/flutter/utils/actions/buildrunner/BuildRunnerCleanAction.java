package com.flutter.utils.actions.buildrunner;

import com.flutter.utils.base.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

public class BuildRunnerCleanAction extends BaseAction {

    @Override
    public String getCommand(@NotNull AnActionEvent e) {
        return "flutter pub run build_runner build clean";
    }
}
