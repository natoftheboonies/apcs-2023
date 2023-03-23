# Visual Studio Code on Windows

Codespaces are great, for developing in a browser. And they work on your Chromebook!

On the other hand, desktop software often beats cloud-based software. This page about how to install Visual Studio, plus Java and Git (Version Control) in Windows **without** Admin rights.

## Unless you have Admin...

If you have Admin rights, just install normal Git and normal Java.

1. Visit [Git Downloads](https://git-scm.com/download/windows) and choose a "Standalone Installer" package.
2. For Java, [recommended](https://whichjdk.com/) is [Adoptium](https://adoptium.net/temurin/releases/) OpenJDK version 17. Download the windows .msi installer.
3. Download [Visual Studio Code](https://code.visualstudio.com/Download) and install it. Then proceed as below.

## For a non-Admin windows user...

### Collect Git

1. Visit [Git Downloads](https://git-scm.com/download/windows) and choose the "Portable" edition.
2. Download and unzip this on your computer somewhere, like a "Git" folder in your home directory.

### Collect Java

1. For Java, [recommended](https://whichjdk.com/) is [Adoptium](https://adoptium.net/temurin/releases/) OpenJDK version 17. Download the windows .zip and unzip it somewhere, like your home directory, perhaps. It will create a folder like `jdk-17.0.6+10` where you unzip it.
2. Set your %PATH% to know about java. Hit WindowsKey-I, search for "environment", and select "Edit environment variables for your account."
   - Add one called `JAVA_HOME` set to `C:\Users\xxx\jdk-17.0.6+10` (or wherever you unzipped it),
   - Edit the `PATH` environment variable to point to `%JAVA_HOME%\bin` near the top of the list.
   - While you are here, also add `C:\Users\xxx\Git\cmd` (or wherever you put Portable Git, including the `cmd` subdirectory) to your `PATH` somewhat lower.
3. See if they work! Open up a command prompt, and try:
   - `java -version` Maybe there is already a different java version, and that's OK.
   - `git -v` should show "git version 2.40.0.windows.1" or something.
4. Teach Git some configuration:
   - `git config --global user.email "youremail@stu.asd103.org"`
   - `git config --global user.name "Firstname Lastname"`
   - `git config --global pull.rebase true`

### Collect Visual Studio Code

1.  Visit [Visual Studio Code Downloads](https://code.visualstudio.com/Download) and select the windows "User Installer" package.

## Configure your Development Environment

1. Open Visual Studio Code, select Extensions (from the bottom-left gear) and then install the "Extension Pack for Java"
2. Within VS Code Settings, search for "git path" and then edit within settings.json. Per [StackOverflow](https://stackoverflow.com/questions/71515762/use-portable-vscode-with-portable-git), set `"git.path"` to `"C:\\Users\\XXX\\Git\\cmd\\git"` replacing XXX with your username (or wherever you unzipped it).
3. In the same settings.json file, add a `"java.jdt.ls.java.home"` property and set it to your java unzip, perhaps like `"C:\\Users\\XXX\\jdk-17.0.6+10"`.
   - Remember the comma after each property so your settings.json is error free.
   - while you are in settings.json, a property like `"git.autofetch": true` would also be helpful.
4. Restart VS Code, visit the "Version Control" tab, select "Clone Repository", and clone your GitHub repo, perhaps to your home directory.

Now, maybe, you can develop on your desktop. Phew!

When you first run java, it will prompt for Admin access to allow it through the firewall. As we don't have admin access, just hit OK and your code should still run...
