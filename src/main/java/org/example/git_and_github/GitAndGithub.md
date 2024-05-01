
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

## Basic Linux Commands

Here are some basic Linux commands frequently used in Git workflows:

- `ls`: List files and directories.
- `mkdir`: Create a new directory.
- `cd`: Change directory.
- `touch`: Create a new file.
- `rm`: Remove/delete files or directories.
- `ls -a`: List all files, including hidden ones.

## Git Commands and Workflow

Here are some common Git commands and workflows:

- **git status**: Check the current status of your repository.
- **git add .**: Add all changes to the staging area.
- **git add <file>**: Add specific files to the staging area.
- **git commit -m "commit message"**: Commit changes to the repository with a descriptive message.
- **git restore --staged <file>**: Unstage changes from the staging area.
- **git log**: View commit history.
- **git reset <commit_hash>**: Reset to a specific commit.
- **git stash**: Temporarily stash changes.
- **git stash pop**: Retrieve stashed changes.
- **git stash clear**: Clear all stashed changes.
- **git remote -v**: View remote repositories.
- **git push origin <branch_name>**: Push changes to a remote repository.
- **git clone <repository_URL>**: Clone a repository from a remote source.
- **git fetch --all --prune**: Fetch changes from all remote branches.
- **git merge <branch_name>**: Merge changes from a branch into the current branch.
- **git rebase -i <commit_hash>**: Squash commits into a single commit interactively.
- **git push origin <branch_name> -f**: Force push changes to a remote branch.

## Additional Tips and Techniques

- **HEAD**: A pointer that represents the current state of the repository or the currently checked-out commit.
- **Pull Request**: A GitHub feature that allows contributors to propose changes to a repository and request them to be reviewed and merged.
- **Merge Conflicts**: Occur when Git cannot automatically merge changes from different branches and requires manual intervention to resolve conflicts.

For more detailed information and tutorials, refer to the [Git documentation](https://git-scm.com/doc) and [GitHub Guides](https://guides.github.com/).

---
