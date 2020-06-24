package com.flutter.utils.base;

import com.intellij.openapi.actionSystem.AnActionEvent;

import java.io.File;

public abstract class AndroidProjectBaseAction extends BaseAction {

    public File getCustomWorkingDirectory(AnActionEvent e) {
        String iosPath = getProjectRootPath(e) + "/android";
        return new File(iosPath);
    }
}
