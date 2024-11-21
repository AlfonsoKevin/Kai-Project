# 食用指南

项目使用`Maven Archetype`构建多模块脚手架

所以一定要有Maven, 本地配置正常并且在3.0以上

## 指定坐标信息创建⭐

以这样的命令在对应想要创建的目录下执行，当然，这些参数都可以自定义

```xml
mvn archetype:generate "-DarchetypeGroupId=io.github.alfonsokevin" "-DarchetypeArtifactId=Kai-Project-cli" "-DarchetypeVersion=1.1.1" "-DgroupId=com.project" "-DartifactId=Kai-Cli" "-Dversion=1.0.0" "-DinteractiveMode=false" "-DarchetypeRepository=https://github.com/AlfonsoKevin/Kai-Project"
```



格式化后：

```xml
mvn archetype:generate
 -DgroupId=com.project
 -DartifactId=Kai-Cli
 -Dversion=1.0.0
 -Dpackage=com.project
 -DarchetypeGroupId=io.github.alfonsokevin
 -DarchetypeArtifactId=Kai-Project-cli
 -DarchetypeVersion=1.0.0
 -DinteractiveMode=false
 -DarchetypeRepository=https://github.com/AlfonsoKevin/Kai-Project
```



参数解读：

| 参数                  | 解释                                 | 是否可自定义 |
| --------------------- | ------------------------------------ | ------------ |
| -DinteractiveMode     | 非交互式                             | Y            |
| -DgroupId             | 你想要生成项目的groupId              | Y            |
| -DartifactId          | 你想要生成项目的artifactId（项目名） | Y            |
| -Dversion             | 你想要生成项目的version              | Y            |
| -Dpackage             | 你想要生成项目的包名                 | Y            |
| -DarchetypeGroupId    | 使用到的模板的groupId                | N            |
| -DarchetypeArtifactId | 使用到的模板的artifactIdv            | N            |
| -DarchetypeVersion    | 使用到的模板的version                | N            |





## 本地保存文件创建



将`archetype-catalog.xml`文件添加到本地仓库`~/.m2/repository`中(一般是在C:Users下)

```xml
<?xml version="1.0" encoding="UTF-8"?>
<archetype-catalog xsi:schemaLocation="http://maven.apache.org/plugins/maven-archetype-plugin/archetype-catalog/1.0.0 http://maven.apache.org/xsd/archetype-catalog-1.0.0.xsd"
    xmlns="http://maven.apache.org/plugins/maven-archetype-plugin/archetype-catalog/1.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
  <archetypes>
    <!-- 本地文件中添加 -->
    <archetype>
      <groupId>io.github.alfonsokevin</groupId>
      <artifactId>Kai-Project-cli</artifactId>
      <version>1.0.0</version>
      <description>A concise template for rapid development based on SpringBoot</description>
    </archetype>
  </archetypes>
</archetype-catalog>

```



### 使用方式

在想要创建项目的文件夹下，进入命令行窗口

```bash
mvn archetype:generate -DarchetypeCatalog=local
```



使用可供选择的模板

![img1.png](https://github.com/AlfonsoKevin/Kai-Project/blob/main/imgs/description/img1.png?raw=true)

输入对应需要的参数

![img2.png](https://github.com/AlfonsoKevin/Kai-Project/blob/main/imgs/description/img2.png?raw=true)

![img3.png](https://github.com/AlfonsoKevin/Kai-Project/blob/main/imgs/description/img3.png?raw=true)

生成项目，查看即可。

![img4.png](https://github.com/AlfonsoKevin/Kai-Project/blob/main/imgs/description/img4.png?raw=true)