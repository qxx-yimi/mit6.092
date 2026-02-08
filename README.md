# MIT 6.092: Introduction to Programming in Java - Assignments

本项目包含了 MIT 6.092 课程的系列编程作业实现。该课程是 Java 编程的入门指南，涵盖了从基础语法到面向对象设计、图形界面以及文件 I/O 的核心概念。

## 项目结构

仓库按照作业编号（Assignment）划分为不同的 package，每个部分专注于特定的 Java 知识点：

* **assn1: GravityCalculator**
* **重点**：变量、表达式、基本算术运算。
* **内容**：计算物体在重力作用下的位置。


* **assn2: FooCorporation**
* **重点**：条件控制流（if/else）、方法（methods）。
* **内容**：计算员工工资，包含加班费逻辑和最低时薪限制。


* **assn3: Marathon**
* **重点**：循环（for/while）、数组（Arrays）。
* **内容**：在一组马拉松选手的成绩中找出冠军和亚军。


* **assn4: Library System**
* **重点**：类与对象（Classes and Objects）、字段、构造函数。
* **内容**：模拟简单的图书借阅系统，包含 `Book` 类和 `Library` 类。


* **assn5: DrawGraphics**
* **重点**：Java 2D 图形、列表（Lists）。
* **内容**：在窗口中绘制基本形状，并管理多个图形对象。


* **assn6: Graphical Animation**
* **重点**：接口（Interfaces）、多态（Polymorphism）。
* **内容**：通过定义 `Sprite` 和 `Mover` 接口实现可移动的图形动画。


* **assn7: Magic Squares**
* **重点**：文件 I/O、异常处理、二维数组。
* **内容**：从文本文件中读取数字矩阵，并验证其是否符合“幻方（Magic Square）”的特征。



## 环境要求

* **JDK**: 1.8 或更高版本。
* **IDE**: 推荐使用 IntelliJ IDEA（仓库包含 `.idea` 配置文件）或 Eclipse。

## 如何运行

1. 克隆或下载本仓库。
2. 在 IDE 中导入该项目。
3. 找到对应作业目录下的 `main` 方法文件（例如 `assn7.MagicSquares`）。
4. 直接运行即可查看控制台输出或图形界面结果。

## 资源说明

每个作业目录下通常包含：

* `.java` 源代码文件。
* 对应的作业说明 PDF（如 `assn01.pdf` 等，用于详细查阅题目要求）。
* （可选）测试数据文件，如 `Mercury.txt` 和 `Luna.txt` 用于幻方验证。
