---
layout: page
title: User Guide

---
## Table Of Contents

1. [Introduction](#1-introduction)

2. [How do I use this User Guide?](#2-how-do-i-use-this-user-guide)

3. [Getting Started](#3-getting-started)

4. [Understanding KanBug Tracker](#4-understanding-kanbug-tracker)

   4.1 [Understanding the Graphical User Interface](#41-understanding-the-graphical-user-interface)

   4.2 [What is a bug?](#42-what-is-a-bug)

   4.3 [What are commands?](#43-what-are-commands)

5. [Features](#5-features)

   5.1 [Switching Views : **`switch`**](#51-switching-views--switch)

   5.2 [Viewing help : **`help`**](#52-viewing-help--help)

   5.3 [Listing all bugs : **`list`**](#53-listing-all-bugs--list)

   5.4 [Searching for bugs: **`search`**](#54-searching-for-bugs--search)

   5.5 [Adding a bug : **`add`**](#55-adding-a-bug--add)

   5.6 [Deleting a bug : **`delete`**](#56-deleting-a-bug--delete)

   5.7 [Editing a bug : **`edit`**](#57-editing-a-bug--edit)

   5.8 [Editing a tag of a bug: **`editTag`**](#58-editing-a-tag-of-a-bug--edittag)

   5.9 [Adding a tag to a bug : **`addTag`**](#59-adding-a-tag-to-a-bug--addtag)

   5.10 [Moving a bug : **`move`**](#510-moving-a-bug--move)

   5.11 [Clearing all bugs: **`clear`**](#511-clearing-all-bugs--clear)

   5.12 [Exiting the program :  **`exit`**](#512-exiting-the-program--exit)

   5.13 [Saving the data](#513-saving-the-data--automatically)

6. [Command Summary](#6-command-summary)



## 1. Introduction

Are you struggling to find an effective way to keep track of and manage the bugs you encounter while programming?

Perhaps you're still relying on the archaic methods of pen and paper? Or you cannot wrap your head around the unnecessarily complex features of existing bug trackers?

Do you desire an offline solution that is easy to use yet powerful enough to solve all your bug management problems? Look no further because we have the perfect product for you.

Introducing KanBug Tracker, a revolutionary bug management application!

Let's look at some ways that KanBug Tracker can benefit you:

- **Bug Management**: Store and organise all the bugs you encounter while programming with the press of a button. 
- **Visualisation**: Our intuitive layout is designed to give you a high-level overview of your bug fixing progress, giving you the ability to plan your approach like never before.
- **Incredible Portability**: The application lives on your computer and does not require an internet connection, allowing you to manage your bugs wherever you are.
- **Powerful features**: Take your bug tracking efforts to the next level with features that will allow you to search for bugs and move them between states.
- **Performance**: We understand developers. That's why KanBug Tracker is powered by a slick Command Line Interface (CLI) designed to maximise your productivity.

As you can see, KanBug Tracker was designed for developers like you, with powerful features that help you stay on top of your bug fixing process.

## 2. How do I use this User Guide?

The team here at KanBug Tracker has broken down this User Guide into easy to understand sections that will help to answer any questions you have pertaining to our application.

Before continuing, it would be good to familiarise yourself with a few symbols that you will encounter in this User Guide:

<div markdown="span" class="alert alert-info">:information_source: Note: This provides you with additional information that you should take note of. 
</div>

<div markdown="span" class="alert alert-warning">:warning: WARNING: Watch out for warnings! They tell you important information that you NEED to know! 
</div>

<div markdown="span" class="alert alert-success">:bulb: Tip: This provides you with tips and tricks or some context behind the feature.
</div>

Now you're all set to get started! But where should you begin?

- If you are a first-time user, start [here](#3-getting-started) by learning how to download and set up KanBug Tracker.
- If you are confused about the various parts of KanBug Tracker (GUI, what is a bug, etc.), you can learn about them [here](#4-understanding-kanbug-tracker).
- If you are interested to learn about the different exciting features KanBug Tracker has, check out the Features section [here](#5-features).
- If you are already familiar with KanBug Tracker but have some trouble remembering the command syntax, take a look at the Command Summary section [here](#6-command-summary).

## 3. Getting Started

1. Ensure that you have `Java 11` or above installed on your computer. If you do not have a suitable version of `Java` installed on your computer, you may head [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) to download the installer for your operating system.

   

2. Download the latest `KanBugTracker.jar` from our [GitHub](https://github.com/AY2021S1-CS2103T-W17-1/tp/releases)
   ![Download](images/KanBugDownload.png)







  

3. Copy the `KanBugTracker.jar` file to a folder you want to use as your _root folder_.
   ![HomeFolder](images/HomeFolder.png)

<div markdown="span" class="alert alert-info">:information_source: Note: In this instance, <b>Home Folder</b> acts as our <b>root folder</b>. Users are free to name their <b>root folder</b> however they wish. 
</div>



4. Double-click on the `KanBugTracker.jar`file to launch the application. You should see something similar.

   ![HomeFolder](images/Ui2.png)

5. Now that you're all set up, you're ready to take your bug management to the next level! 

   You can start getting familiar with the various commands that KanBug Tracker has to offer.	

   - You can get an in-depth explanation of the various features that KanBug Tracker has to offer [here](#5-features).
   - To get a summary of all the commands, refer [here](#6-command-summary).



## 4. Understanding KanBug Tracker

We're sure that you're excited to start using KanBug Tracker! Before that however, there are some terms and parts of the application that you need to be familiar with to make the best out of your KanBug Tracker experience.

We have divided this section into three. The first section introduces the various aspects of KanBug Tracker's **Graphical User Interface (GUI)**. The second section explains what a **bug is and explains its various parts**. The third section focuses on how the **user interacts with the application** and introduces some key ideas that users need to know.

### 4.1 Understanding the Graphical User Interface

KanBug Tracker provides two different views that the user can switch between. The first is the traditional Kanban board style view which aims to allow users to get a high-level overview of the state of bugs in their project. The second view is the List view which allows users to focus only on the bugs within a particular section of the KanBug Tracker.

#### Kanban View (default):

![Ui](images/Ui3.png)

1. Command Line Interface for users to enter their commands
2. Display that the application uses to give feedback on commands to the user
3. Each individual bug will be displayed with the following data listed in order of display from top to bottom:
   - Name of bug
   - Priority of bug
   - Short description of bug
   - Relevant tags
4. Four of pre-declared states that KanBug Tracker comes with. Each bug will be assigned to one of the four states to aid users in tracking the life cycle of each bug.

#### List View:

![Ui](images/Ui4.png)

1. Command Line Interface for users to enter their commands
2. Display that the application uses to give feedback on commands to the user
3. Scroll bar to navigate up and down the bug list
4. Each individual bug will be displayed with the following data listed in order of display from top to bottom and left to right:
   - Name of bug
   - Priority of bug
   - State of bug
   - Short description of bug
   - Relevant tags
   - Note containing extra information about the bug

### 4.2 What is a bug?

By now, you've probably seen the word **bug** a lot. But what exactly is a bug and what are the various parts of it you have to know? Let's take a look and find out.

![BugImage](images/Ui5.png)

#### 1 - Bug Name

You get to choose what you want to name each bug you enter into the KanBug Tracker. No two bugs can have the same name.

#### 2 - Priority

When adding bugs to the KanBug Tracker, you can include a priority level for the bug. Priority levels help give you an indication of how urgently a particular bug has to be fixed. 

You choose from three pre-defined priority levels:

- **LOW**
- **MEDIUM**
- **HIGH**

#### 3 - State

Bugs in the KanBug Tracker can have one of four pre-defined states. States help you track which part of the bug's lifecycle a particular bug is in. 

The four available states are:

- **Backlog** - Bugs you have discovered but do not have the time to work on yet.
- **Todo** - Bugs you intend to work on now.
- **Ongoing** - Bugs you are currently working on.
- **Done** - Bugs that have been resolved.

<div markdown="span" class="alert alert-success">:bulb: Tip: The meanings of the states are not fixed. You are free to interpret them in any way that best suits you.
</div>

#### 4 - Description

A short description detailing some key parts of the bug. Useful in helping you remember what the bug is about at a glance.

#### 5 - Tag

Multiple user-defined tags can be attached to each bug. Tags aid in helping you draw connections between multiple bugs. For instance, two bugs with the same tag **Ui** indicates that both bugs are related to the user-interface.

#### 6 - Notes

Notes are longer versions of descriptions. They are meant to provide more depth and can be used to log key pieces of information about the bug.



### 4.3 What are commands?

Commands are how you interact with the KanBug Tracker. The various commands will be covered in detail in the next [section](#5-features). However, there are some key parts of commands that you should take note of!

#### Columns

You may have noticed that some commands require you to provide the column that the bug is in. Don't fret, columns in the Kanban View simply refer to the state of a particular bug.

<div markdown="span" class="alert alert-info">:information_source: Note: You only need to tell us the column when you are in <b>Kanban View</b>.
<br>
    • <b>List view:</b> You should not supply the <code>COLUMN</code>. The bug at the specified <code>INDEX</code> is edited. The index refers to the index number shown in the displayed list of bugs.<br>
    • <b>Kanban view:</b> Remember to supply the <code>COLUMN</code> when using this view! The bug you have chosen at <code>INDEX</code> in the <b>chosen column</b> is deleted.<br>
<br>
Example: <br>
<img src="images/ListViewDelete.png"> <br>
The <b>highlighted bug is deleted</b> when command <code>delete 1</code> is executed <br>
<br>
<img src="images/KanbanViewDelete.png"> <br>
The <b>highlighted bug is deleted</b> when command <code>delete 1 c/backlog</code> is executed<br>
</div>

#### Index

The index of a bug is the position of that bug in the list.

#### Prefixes

Some commands require the use of prefixes to indicate user input. Every command will have its own specific format so do pay close attention to the command's requirements!

<div markdown="span" class="alert alert-info">:information_source: Note: If you accidentally include multiple copies of the same prefix, the programme will use the prefix that appears last.
Eg. <code>edit 1 n/firstname n/secondname</code> will result in the name of Bug 1 being editted to <b>secondname</b>.
</div>

<div markdown="span" class="alert alert-warning">:warning: WARNING: Using a prefix inside another prefix will result in it not being recognised by the application.
Eg. <code>d/t/Location</code> will result in the description field of the Bug being set to <code>t/Location</code>. 
</div>

## 5. Features

- Words in `UPPER_CASE` are parameters to be supplied by the user
- Items in `[...]` are **optional**
- Items in `(...)` are only required in **KanBan view** and should not be supplied in **List view**
- `INDEX` **must be a positive integer** 1,2,3...

### 5.1 Switching Views : `switch`

Want to get a high level overview of the bugs in your program or focus only on a particular column? Just switch views!

Format: `switch`
(Any parameters entered are ignored)

- Switches between **Kanban view** and **List view**

### 5.2 Viewing help : `help`

Not sure what to do next? Don't worry, just ask for help.

Format: `help` 
(Any parameters entered are ignored)

- Gets all commands’ syntax and the link to this User Guide.

Example: Stuck? Or just forgot what the commands are? Don't worry just do this:

![HomeFolder](images/HelpExample1.png)

Just type `help` and hit `Enter`

![HomeFolder](images/HelpExample2.png)

This creates a popup (the Help Window) with a command guide that you can refer to.

### 5.3 Listing all bugs : `list`

After running the search command you might want to see all the bugs you have in your Kanbug Tracker at one glance. Thats where the `list` can be used.

Format: `list`
(Any parameters entered are ignored)

- Shows all the bugs in your Kanbug Tracker

Example: Lets say you have just completed a search for bugs related to `list` using the command `search q/list` and now you want to view all your bugs again. Just do this:

![HomeFolder](images/ListExample1.png)

Just type `list` and hit `Enter`

![HomeFolder](images/ListExample2.png)

The result display will then indicate the result of your command, and the Kanbug Tracker will display all your bugs.

### 5.4 Searching for bugs : `search`

When there are a lot of bugs in the tracker, the search command is here to help to find out particular bugs you are looking for.

Format: `search q/QUERYSTRING`

- This command sorts out bugs based on your given query-string. The tracker returns all the bugs that has either name or description or tags containing this query-string as a substring. 
- The query-string cannot be empty and case-insensitive.
- If there are repetitive `q/` prefixes, the tracker only considers the last one.

Examples:

- `search q/frontend`, returns a list of bugs of which either name or description or tags contains query-string **frontend** (case-insensitive) in the words.

### 5.5 Adding a bug : `add`

When a bug is encountered, the add command is here to help keep track of the bug for future reference.

Format: `add n/NAME d/DESCRIPTION [s/STATE] [note/NOTE] [t/TAG] [pr/PRIORITY]`

- Add a bug with the specified name, description and state to the bottom of the list.
- The state, note and tag fields are optional, all other fields are needed.
- If state is not specified, a default state of backlog will be assigned.
- The command will fail if a bug with the same name already exists.

Examples:

Suppose you encountered a bug that is not too urgent for now, it would be a good idea to put the bug in the backlog with a priority of low.

![HomeFolder](images/addExample1.png)

You can type `add n/Ui bug d/Homepage not loading properly s/backlog pr/low` and press `Enter`.

![HomeFolder](images/addExample2.png)

Once the command has been entered, the result display shows the result of your command and KanBug Tracker
add the bug to the bottom of the list.

<div markdown="span" class="alert alert-warning">:warning: WARNING: Do note that for the following commands (Section 5.6 - 5.10) you have to include the <code>c/COLUMN</code> prefix when using it in the <b>Kanban View</b> which should not be added when using it in the <b>List View</b>.
</div>

### 5.6 Deleting a bug : `delete`

After a bug is fixed and a project is done, its time to remove the bug from the application.

Format: `delete INDEX (c/COLUMN)`

- Deletes the bug at the specified index

Example:
Suppose you fixed a bug and want to clear some space. This is how you can do it:

![HomeFolder](images/deleteCommandExample1.png)

You can type `delete 3` and press `Enter`.

![HomeFolder](images/deleteCommandExample2.png)

Once the command has been entered, the result display shows the result of your command and KanBug Tracker will remove the bug at the specified index.

### 5.7 Editing a bug : `edit`

Made a mistake when adding in a bug or simply changed your mind on what the description should be? Fret not, that's what the edit command is for.

Format: `edit INDEX (c/COLUMN) [n/NEW_NAME] [d/NEW_DESCRIPTION] [s/NEW_STATE] [note/NEW_NOTE] [t/NEW_TAG] [pr/NEW_PRIORITY]`

- Edits the specified bug.
- At least one of the optional fields must be provided.
- Existing values will be updated to the input values.
- **Multiple tags** can be added or edited.
- The command will fail if the operation results in duplicated bugs (bugs with the same name).

<div markdown="span" class="alert alert-info">:information_source: Note: To remove optional fields such as <code>Priority</code> and <code>Note</code> simply type the prefix without providing anything after.
Eg. <code>edit 1 pr/</code> will remove the assigned priority of the Bug if there is one present.
</div>

Examples:

Example 1: Suppose you incorrectly named a bug and provided it with an inaccurate description as well as priority and want to change the name of the bug to **Wrong list numbers when displaying list**, the description to **List column printed as all 1's** and priority to **high**:

![HomeFolder](images/EditExample1.png)

You can type `edit 6 n/Wrong list numbers when displaying list d/List column printed as all 1's pr/high` and press `Enter`.

![HomeFolder](images/EditExample2.png)

Once the command has been entered, the result display shows the result of your command and the Kanbug tracker has been updated with the updated name, description as well as priority.

Example 2: Perhaps then you tried some ways to fix it that didn't work so you want to add a `note` of **Tried a fix using iterator, did not work**. This is how you can do it:

![HomeFolder](images/EditExample3.png)

Type `edit 6 note/Tried a fix using iterator, did not work` as input and press `Enter`.

![HomeFolder](images/EditExample4.png)

Once the command has been entered, the result display shows the result of your command and the KanBug Tracker has been updated with the updated note.

Example 3: After toiling away at the bug, you realise that you have solved it! So now you want to remove the `priority` of the Bug. This is how you can do it:

![HomeFolder](images/EditExample5.png)

Type `edit 6 pr/` as input and press `Enter`.

![HomeFolder](images/EditExample6.png)

Once the command has been entered, the result display shows the result of your command and the Kanbug tracker has been updated with the priority of the bug removed.

### 5.8 Editing a tag of a bug : `editTag`

Made a mistake when adding tags to your bug? With this command, you can easily make amends without having to retype every single tag!

Format: `editTag INDEX [c/COLUMN] ot/OLD_TAG nt/NEW_TAG`

- The command to be used depends on which view the user is in. The user can either be in **Kanban view** or **List view**.
  - **Kanban view**: User must supply `COLUMN`. The bugs are filtered such that only bugs that have a `STATE` matching the `COLUMN` selected are considered. The bug at the specified `INDEX` of this filtered list is selected to be edited.
  - **List view**: `COLUMN` should **not** be supplied. The bug at the specified `INDEX` is edited. The index refers to the index number shown in the displayed list of bugs.
- The `OLD_TAG` supplied must be an existing tag.
- The `NEW_TAG` supplied must **not** be an existing tag.
- The `OLD_TAG` will be updated to the `NEW_TAG`

Examples:

- `editTag 1 ot/UI nt/UserDisplay` edits the bug at index **1** and replaces the tag **UI** with the tag **UserDisplay**.
- `editTag 1 c/backlog ot/CommandResult nt/CommandParser` filters all bugs and only considers those that have a **state** of **backlog**. It then edits the bug at index **1** of this list and replaces the tag **CommandResult** with the tag **CommandParser**.

### 5.9 Adding a tag to a bug : `addTag`

Forgot to add a tag to one of your bugs? Or perhaps you want to add a new one? With this command, adding tags has never been simpler!

Format: `addTag INDEX [c/COLUMN] nt/NEW_TAG`

- The command to be used depends on which view the user is in. The user can either be in **Kanban view** or **List view**.
  - **Kanban view**: User must supply `COLUMN`. The bugs are filtered such that only bugs that have a `STATE` matching the `COLUMN` selected are considered. The bug at the specified `INDEX` of this filtered list is selected to be edited.
  - **List view**: `COLUMN` should **not** be supplied. The bug at the specified `INDEX` is edited. The index refers to the index number shown in the displayed list of bugs.
- The `NEW_TAG` supplied must **not** be an existing tag.
- The `NEW_TAG` will be added to the bug.

Examples:

- `addTag 2 nt/UserDisplay` edits the bug at index **2** and adds the tag **UI** to the bug.
- `addTag 1 c/backlog nt/CommandParser` filters all bugs and only considers those that have a **state** of **backlog**. It then edits the bug at index **1** of this list and adds the tag **CommandParser** to the bug.

### 5.10 Moving a bug : `move`

Whether you begin to work on a bug, finish fixing one or plan to deal with a bug later, you can use `move` to update the 
progress on dealing with that bug.

Format: `move INDEX [c/COLUMN] s/STATE`

- The command to be used depends on which view the user is in. The user can either be in **Kanban view** or **List view**.
  - **Kanban view**: User must supply `COLUMN`. The bugs are filtered such that only bugs that have a `STATE` matching the `COLUMN` selected are considered. The bug at the specified `INDEX` of this filtered list is selected to be edited.
  - **List view**: `COLUMN` should **not** be supplied. The bug at the specified `INDEX` is edited. The index refers to the index number shown in the displayed list of bugs.
- Specifically, this command will change the state of the bug.
- The state field is **mandatory** and must be provided.
- State can either be **backlog, todo, ongoing** or **done**.
- If the **destination** state is the same with the initial state of the bug, no change will be made.
- The bug must exist to be moved (e.g. we cannot move the fifth bug in the List view if there are only four bugs).

Examples:

- `move 1 s/todo`, moves the first bug in the List view from its initial state to the **Todo** state.
- `move 3 c/ongoing s/done`, moves the bug third bug in the Ongoing column of Kanban view from its initial state (Ongoing) to the **Done** state.

### 5.11 Clearing all bugs : `clear`

Imagine the project you just finish ends up with a hundred of bug records in the tracker. How to restart? Don't worry! Clear command is here to help you to clear all bugs to reinitialize the application.

Format: `clear`
(Any parameters entered are ignored)

- This command is applicable to both Kanban and List views.

### 5.12 Exiting the program : `exit`

Ends and closes the app.

Format: `exit`
(Any parameters entered are ignored)

When you are done with managing your tasks, use this command to saves all of the local data and exit from the app. 
Alternatively, you can also close the window directly or press Esc key, and the app will do the same thing.

### 5.13 Saving the data : automatically

Data is saved into the hard disk every time a change is made.

------

## 6. Command Summary

|   Action    |                            Format                            |
| :---------: | :----------------------------------------------------------: |
|  **help**   |                            `help`                            |
|  **list**   |                            `list`                            |
| **search**  |                      `search q/QUERYSTRING`                  |
|   **add**   |   `add n/NAME d/DESCRIPTION [s/STATE] [note/NOTE] [t/TAG] [pr/PRIORITY]`   |
| **delete**  |                        `delete INDEX (c/COLUMN)`                        |
|  **edit**   | `edit INDEX (c/COLUMN) [n/NEW_NAME] [d/NEW_DESCRIPTION] [s/NEW_STATE] [note/NEW_NOTE] [t/NEW_TAG] [pr/NEW_PRIORITY]` |
| **editTag** |       `editTag INDEX (c/COLUMN) ot/OLD_TAG nt/NEW_TAG`       |
| **addTag**  |             `addTag INDEX (c/COLUMN) nt/NEW_TAG`             |
|  **move**   |               `move INDEX (c/COLUMN) s/STATE`                |
|  **clear**  |                            `clear`                           |
|  **exit**   |                            `exit`                            |

[Back to top](#table-of-contents)

Team Name: AY2021S1-CS2103T-W17-1

