package com.flutter.utils.base;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.Objects;

public abstract class BaseAction extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        String command = getCommand(e);
        File file = getProjectRootFile(e);
        try {
            Process process = Runtime.getRuntime().exec(command, null, file);
            printLog(process);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    /**
     * The return command will always execute under the root directory.
     * You should change directory by yourself.
     *
     * @return the command which will be executed.
     */
    public abstract String getCommand(AnActionEvent e);

    public String getProjectRootPath(AnActionEvent e) {
        return Objects.requireNonNull(e.getProject()).getBasePath();
    }

    public File getProjectRootFile(AnActionEvent e) {
        return new File(getProjectRootPath(e));
    }

    public void printLog(Process process) throws IOException {
        BufferedInputStream inputStream = new BufferedInputStream(process.getInputStream());
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(inputStream));

        BufferedInputStream errorStream = new BufferedInputStream(process.getErrorStream());
        BufferedReader errorInputReader = new BufferedReader(new InputStreamReader(errorStream));

        String line;
        while ((line = inputReader.readLine()) != null) {
            System.out.println(line + "\n");
        }

        while ((line = errorInputReader.readLine()) != null) {
            System.out.println(line + "\n");
        }
    }
}
