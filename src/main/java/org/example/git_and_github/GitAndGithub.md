
---

# Git and GitHub Basics

## Introduction to Version Control

Version control is a system that records changes to a file or set of files over time so that you can recall specific versions later. It allows multiple contributors to collaborate on a project efficiently.

## Git and GitHub

### Git

Git is a distributed version control system that enables collaboration and keeps track of changes made to files. It allows users to work offline and synchronize changes with remote repositories.

**What is Git?**
- Git is a distributed version control system.
- It tracks changes to files and enables collaboration among developers.
- It supports branching and merging for parallel development.

**Why Git?**
- Facilitates collaboration among developers.
- Tracks changes and enables version control.
- Supports branching and merging for parallel development.

**How to Use Git:**
1. Install Git on your system.
2. Set up global configurations:
    ```
    $ git config --global user.name "Your Name"
    $ git config --global user.email "your_email@example.com"
    ```
3. Initialize Git in your project directory using `git init`.
4. Stage changes with `git add` and commit them with `git commit -m "Commit message"`.
5. View commit history with `git log`.
6. Create branches with `git branch` and switch between them using `git checkout`.
7. Merge branches with `git merge`.

### GitHub

GitHub is a web-based platform for hosting Git repositories. It provides additional features like issue tracking, pull requests, and project management tools.

**What is GitHub?**
- GitHub is a web-based hosting service for Git repositories.
- It provides collaboration features like pull requests and issue tracking.
- It offers project management tools for software development teams.

**Why GitHub?**
- Centralized hosting for Git repositories.
- Facilitates collaboration among developers globally.
- Offers features like pull requests for code review and collaboration.

**How to Use GitHub:**
1. Create a new repository on GitHub.
2. Link your local repository to the remote one using `git remote add origin <repository_URL>`.
3. Push changes from your local repository to GitHub using `git push origin <branch_name>`.
4. Collaborate with others by forking repositories, creating pull requests, and reviewing code changes.
5. Keep your forked repository up to date with the original repository using `git fetch`, `git pull`, and `git push`.

## Git Commands and Workflow

Here are some common Git commands and workflows:

1. `git status`: Check the current status of your repository.
2. `git add .`: Add all changes to the staging area.
3. `git add <file>`: Add specific files to the staging area.
4. `git commit -m "commit message"`: Commit changes to the repository with a descriptive message.
5. `git restore --staged <file>`: Unstage changes from the staging area.
6. `git log`: View commit history.
7. `git reset <commit_hash>`: Reset to a specific commit.
8. `git stash`: Temporarily stash changes.
9. `git stash pop`: Retrieve stashed changes.
10. `git stash clear`: Clear all stashed changes.
11. `git remote -v`: View remote repositories.
12. `git push origin <branch_name>`: Push changes to a remote repository.
13. `git clone <repository_URL>`: Clone a repository from a remote source.
14. `git fetch --all --prune`: Fetch changes from all remote branches.
15. `git merge <branch_name>`: Merge changes from a branch into the current branch.
16. `git rebase -i <commit_hash>`: Squash commits into a single commit interactively.
17. `git push origin <branch_name> -f`: Force push changes to a remote branch.

## Other Terms :

18. **HEAD**: A pointer that represents the current state of the repository or the currently checked-out commit.
19. **Pull Request**: A GitHub feature that allows contributors to propose changes to a repository and request them to be reviewed and merged.
20. **Merge Conflicts**: Occur when Git cannot automatically merge changes from different branches and requires manual intervention to resolve conflicts.
21. **Remove a Commit from Pull Request**: Use `git reset <commit_hash>` and `git push origin <branch_name> -f` to remove a commit from a pull request by forcing the push.
22. **Git Fetch Command**: Use `git fetch --all --prune` to fetch changes from all remote branches and prune deleted branches.
23. **Update a Forked Repository**: Follow these steps to update a forked repository from the upstream repository.

-  Fetch all changes (`git fetch --all --prune`).
-  Checkout to the main branch (`git checkout master`).
-  Reset the main branch of your origin to the main branch of upstream (`git reset --hard upstream/main`).
-  Push the changes (`git push origin main`).
-  Pull all changes from upstream (`git pull upstream main`).

24. **Merge Conflicts and Squashing Commits**: Use `git rebase -i <commit_hash>` to squash commits into a single commit interactively and resolve merge conflicts.

### Create a new repository on the command line :
- `git init`
- `git add README.md`
- `git commit -m "first commit"`
- `git branch -M main`
- `git remote add origin 'repolink'`
- `git push -u origin main`

### Push an existing repository from the command line :
- `git remote add origin "repo link"`
- `git branch -M main`
- `git push -u origin main`


For more detailed information and tutorials, refer to the [Git documentation](https://git-scm.com/doc) and [GitHub Guides](https://guides.github.com/).

## Basic Linux Commands

Here are some basic Linux commands frequently used in Git workflows:

1. `ls`: List files and directories.
2. `mkdir`: Create a new directory.
3. `cd`: Change directory.
4. `touch`: Create a new file.
5. `rm`: Remove/delete files or directories.
6. `ls -a`: List all files, including hidden ones.

Here are some additional basic Linux commands :
- `pwd`: Print the current working directory.
- `cp`: Copy files or directories.
- `mv`: Move or rename files or directories.
- `cat`: Display the contents of a file.
- `grep`: Search for patterns in files.
- `chmod`: Change file permissions.
- `chown`: Change file ownership.
- `sudo`: Execute a command with superuser privileges.
- `df`: Display disk space usage.
- `du`: Display disk usage of files and directories.
- `top`: Display system resource usage and running processes.
- `ps`: Display information about processes.
- `kill`: Terminate processes.
- `tar`: Create or extract compressed archive files.
- `wget`: Download files from the internet.
- `curl`: Transfer data from or to a server.
- `man`: Display the manual page for a command.
- `alias`: Create custom shortcuts for commands.
- `history`: Display command history.
- `echo`: Print text or variables to the terminal.
- `uname`: Print system information.
- `hostname`: Display or set the hostname of the system.
- `ifconfig` or `ip`: Display network interface information.

These commands can be helpful for managing files, navigating the file system, and performing system-related tasks while working with Git on a Linux-based system.

---
