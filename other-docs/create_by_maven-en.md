# Eating Guide & Enjoy

The project uses `Maven Archetype` to build a multi module scaffold

So it is necessary to have Maven, with normal local configuration and above 3.0

## Create Specified Coordinate Information⭐

Execute this command in the corresponding directory you want to create, of course, these parameters can be customized

```xml
mvn archetype:generate "-DarchetypeGroupId=io.github.alfonsokevin" "-DarchetypeArtifactId=Kai-Project-cli" "-DarchetypeVersion=1.1.1" "-DgroupId=com.project" "-DartifactId=Kai-Cli" "-Dversion=1.0.0" "-DinteractiveMode=false" "-DarchetypeRepository=https://github.com/AlfonsoKevin/Kai-Project"
```

This is in the **Windows command line window**. If it is **Linux**, please search for it yourself

`"-DarchetypeRepository=https://github.com/AlfonsoKevin/Kai-Project"`Parameters are used to try to be compatible with Maven 2.0+versions, so it should not be a problem to not add them

After formatting:

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



Parameter interpretation:

| Parameters            | Explain                                                      | Customizable |
| --------------------- | ------------------------------------------------------------ | ------------ |
| -DinteractiveMode     | non-interactive                                              | Y            |
| -DgroupId             | You want to generate the groupId for the project             | Y            |
| -DartifactId          | You want to generate the artifact ID (project name) for the project | Y            |
| -Dversion             | You want to generate a version of the project                | Y            |
| -Dpackage             | You want to generate the package name for the project        | Y            |
| -DarchetypeGroupId    | The groupId of the template used                             | N            |
| -DarchetypeArtifactId | ArtifactIdv of the template used                             | N            |
| -DarchetypeVersion    | The version of the template used                             | N            |





## Create Locally Saved Files



Add the `archetype-catalog. xml` file to the local repository `~/. m2/repository` (usually under C: Users)

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
      <version>1.1.1</version>
      <description>A concise template for rapid development based on SpringBoot</description>
    </archetype>
  </archetypes>
</archetype-catalog>

```



### Usage

在想要创建项目的文件夹下，进入命令行窗口

```bash
mvn archetype:generate -DarchetypeCatalog=local
```



In the folder where you want to create the project, enter the command line window

![img1.png](https://github.com/AlfonsoKevin/Kai-Project/blob/main/imgs/description/img1.png?raw=true)

Enter the corresponding required parameters

![img2.png](https://github.com/AlfonsoKevin/Kai-Project/blob/main/imgs/description/img2.png?raw=true)

![img3.png](https://github.com/AlfonsoKevin/Kai-Project/blob/main/imgs/description/img3.png?raw=true)

Generate a project and view it.

![img4.png](https://github.com/AlfonsoKevin/Kai-Project/blob/main/imgs/description/img4.png?raw=true)