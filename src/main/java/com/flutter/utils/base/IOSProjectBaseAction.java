package com.flutter.utils.base;

import com.intellij.openapi.actionSystem.AnActionEvent;

import java.io.File;

public abstract class IOSProjectBaseAction extends BaseAction {

    public File getCustomWorkingDirectory(AnActionEvent e) {
        String iosPath = getProjectRootPath(e) + "/ios";
        return new File(iosPath);
    }
}
