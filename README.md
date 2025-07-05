# Virtual Threads Demo in Java

This repository demonstrates the performance differences between traditional threads and virtual threads (Project Loom)
in Java.

## Overview

The project compares three different approaches to running concurrent tasks:

1. Traditional platform threads (old school threads)
2. Virtual threads using `Thread.ofVirtual()`
3. Virtual threads using `Thread.startVirtualThread()`

The demo creates 50,000 tasks using each method and measures the total execution time.

## Prerequisites

- Java 21 or later (required for virtual threads)

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/miladsade96/vtd.git
   ```

2. Open it using IntelliJ Idea:
    - Open IntelliJ IDEA.
    - Select "Open" and navigate to the cloned repository.
    - Open the `src/main/java` directory.

3. Run the demo:
    - In IntelliJ IDEA, right-click on the `VirtualThreadsDemo` class in the `src/main/java` directory.
    - Select "Run VirtualThreadsDemo.main()".

4. When prompted, choose the method:
    - Enter `1` for traditional threads.
    - Enter `2` for virtual threads using `Thread.ofVirtual()`.
    - Enter `3` for virtual threads using `Thread.startVirtualThread()`.

