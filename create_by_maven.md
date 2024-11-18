# 食用指南

项目使用`Maven Archetype`构建多模块脚手架

所以一定要有Maven

将`archetype-catalog.xml`文件添加到本地仓库`~/.m2/repository`中(一般是在C:Users下)

```xml
<?xml version="1.0" encoding="UTF-8"?>
<archetype-catalog xsi:schemaLocation="http://maven.apache.org/plugins/maven-archetype-plugin/archetype-catalog/1.0.0 http://maven.apache.org/xsd/archetype-catalog-1.0.0.xsd"
    xmlns="http://maven.apache.org/plugins/maven-archetype-plugin/archetype-catalog/1.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
  <archetypes>
    <archetype>
      <groupId>com.kaikai</groupId>
      <artifactId>Kai-Project-archetype</artifactId>
      <version>1.0-SNAPSHOT</version>
      <description>Parent pom providing dependency and plugin management for applications built with Maven</description>
    </archetype>
  </archetypes>
</archetype-catalog>

```



## 使用方式

在想要创建项目的文件夹下，进入命令行窗口

```bash
mvn archetype:generate -DarchetypeCatalog=local
```



使用可供选择的模板

![img1.png](.\imgs\description\img1.png)

输入对应需要的参数

![img2.png](.\imgs\description\img2.png)

![img3.png](.\imgs\description\img3.png)

生成项目，查看即可。

![img4.png](.\imgs\description\img4.png)