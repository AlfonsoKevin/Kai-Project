

<p align="center">
    <a href="" target="_blank">
      <img src="../imgs/cover.png" width="280" />
    </a>
</p>
<h1 align="center">SpringBoot-Kai-Project-cli</h1>
<p align="center"><strong>Kai's scaffolding for rapid development of SpringBoot project<br><em>Continuous updates～</em></strong></p>
<div align="center">
    <a href="https://github.com/AlfonsoKevin/Kai-Project"><img src="https://img.shields.io/badge/github-项目地址-yellow.svg?style=plasticr"></a>
    <a href="https://github.com/AlfonsoKevin/Kai-Project"><img src="https://img.shields.io/badge/license-MIT-blue.svg"></a>
</div>



## Introduction

---

A template for rapid development based on SpringBoot, dedicated to quickly getting started with developing SpringBoot projects

- Adopting Maven's modular architecture pattern
- Introduce commonly used dependencies for easy and quick development
- Clear directory structure and strong maintainability



## Catalog Structure&Design🚀

---



```txt
├─📄 .gitignore------------------------------------------ # Prevent files submitted by Git
├─📁 kai-admin-server------------------------------------ # Business end
├─📁 kai-custom-server----------------------------------- # Custom end
│ ├─📄 pom.xml------------------------------------------- # C-end dependencies
│ └─📁 src
│   ├─📁 main
│   │ ├─📁 java
│   │ │ └─📁 com
│   │ │   └─📁 kaikai
│   │ │     └─📁 kproject
│   │ │       └─📁 custom
│   │ │         ├─📁 chat-------------------------------- # Xx business/module (modifiable)
│   │ │         ├─📁 common------------------------------ # Common components in the current C-end
│   │ │         │ ├─📁 config---------------------------- # Bean configuration management
│   │ │         │ ├─📁 event----------------------------- # Spring event monitoring
│   │ │         │ │ └─📁 listener------------------------ # monitor
│   │ │         │ └─📁 intercepter----------------------- # interceptor
│   │ │         ├─📄 KaiProjectCustomApplication.java
│   │ │         └─📁 user-------------------------------- # Xx Business
│   │ │           ├─📁 controller------------------------ # Controller
│   │ │           ├─📁 dao------------------------------- # persistent layer
│   │ │           ├─📁 domain---------------------------- # entity
│   │ │           │ ├─📁 dto----------------------------- # Service oriented business processing
│   │ │           │ ├─📁 entity-------------------------- # entity
│   │ │           │ └─📁 vo------------------------------ # Front end access parameters
│   │ │           ├─📁 enums----------------------------- # Enumeration classes
│   │ │           ├─📁 mapper---------------------------- # Mapper layer
│   │ │           └─📁 service--------------------------- # Business layer
│   │ │             ├─📁 adapter------------------------- # Adapter
│   │ │             └─📁 cache--------------------------- # Cache under the current module
│   │ └─📁 resources
│   │   ├─📄 application-test.properties----------------- # testing environment
│   │   └─📄 application.yml----------------------------- # Multi environment configuration
│   └─📁 test-------------------------------------------- # TEST
│     └─📁 java
├─📁 kai-framework--------------------------------------- # Storage of general tools
│ ├─📁 kai-common---------------------------------------- # Public tools
│ │ ├─📄 pom.xml----------------------------------------- # Dependence on public tools
│ │ └─📁 src
│ │   ├─📁 main
│ │   │ ├─📁 java
│ │   │ │ └─📁 com
│ │   │ │   └─📁 kaikai
│ │   │ │     └─📁 kproject
│ │   │ │       ├─📁 cache------------------------------- # Universal cache module
│ │   │ │       └─📁 utils------------------------------- # Universal tool class
│ │   │ └─📁 resources
│ │   └─📁 test
│ └─📄 pom.xml
└─📄 pom.xml--------------------------------------------- # Create a parent project for dependency version management
```



### Detailed Introduction💻

Share my own multi module construction mode, using the project name `Kai Project` as an example

The entire project mainly consists of three parts:

`kai-admin-server`：Package providing management services。Introducing dependencies for the `kai common` module

`kai-custom-server`：Specifically responsible for xx business, if it is developed by an individual, the B and C ends can be merged and renamed as` name xxx server `, which is responsible for xxx business. Introducing dependencies for the `kai common` module

`kai-framework`：A package of general tools for providing microservices, which can have different modules, such as

- `kai-common`：Provide a package for universal modules, which includes universal utility classes and introduces universal dependencies. For use by other parts
- `kai-oss-starter`：For example, there can be distributed storage for projects, and the log printing framework can be created here. Directly introduce which end needs to be used
- `...`

`Kai-Project`Only used as a parent pom to manage dependent versions. such as

```xml
   
<properties>
    <jsoup.version>1.15.3</jsoup.version>
</properties>

<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>org.jsoup</groupId>
            <artifactId>jsoup</artifactId>
            <version>${jsoup.version}</version>
        </dependency>
    </dependencies>
</dependencyManagement>

```



| Dependencies | Version      |
| ------------ | ------------ |
| SpringBoot   | 2.6.7        |
| JDK          | 8            |
| MyBatis      | 3.5.10       |
| Mybatis-Plus | 3.4.1        |
| MySQL        | 8.0.29       |
| Hutool       | 5.8.18       |
| Lombok       | 1.18.20      |
| Netty        | 4.1.76.Final |
| Swagger      | 3.0.0        |
| Rocketmq     | 2.2.2        |
| Jwt          | 3.19.0       |
| Spring-test  | 5.3.19       |
| Minio        | 8.4.5        |
| ...          | ...          |

Gitignore hides SQL files and application-prod.yml, which can be created by oneself.



### Eating Guide & Enjoy✨

> precondition:
>
> - JDK8+
> - Maven3.0+

【Option 1】

[Correct Opening Method](./create_by_maven-en.md)

You can create it without using the command line, and you can search for the form of adding an Archetype in IDEA by yourself.

【Option 2】 Manual modification

You can pull down the code and modify it to the name of the project you want.

Pay attention to the order of modification:

Assuming you want to modify it to `Test Project`, where the project includes`test customer server`and so on.

1. Clone the project and directly rename the file
2. Delete the `. idea` file, which retains the information of the original project
3. When uploading, ignore `. iml` and `target`. If there are any, please delete them. Create the desired SQL folder.
4. Enter Maven and use `global search+global replacement` `(CTRL+SHFIT+F, CTRL+SHFIT+R)` for the original project name. The simplest way to start from the parent project and correspond to the name you modified in the first step is to only modify the `artifactId` part.
5. Similarly, modify two sub projects on the BC end. If you want to merge them, simply delete one. Next are all the toolkits managed in the `framework` section, and then go to the `common` package to make modifications.
6. `rm -rf .git`After deleting the Git file, create your own repository.
7. Then delete all `. gitkeep` files to preserve the directory structure of the project
8. If you want to get started quickly, you also need to make some changes to the configuration file. Delete temporarily unused configurations, such as Redis, RocketMq, and so on.
9. If you want to modify the folder under `src`, just modify it directly, and be sure to keep it consistent with the file path configuration in the startup class.
10. Reload Maven and see where there are still some mistakes.

as follows:

<img src="../imgs/img1.png" width="280" />

If you like it, don't forget to order it ⭐， thank 🥰

---

### Modify ⚡

2024/11/21

- Upload to Maven Central repository
- Revised the user guide to simplify project creation

2024/11/20

- Modified two `SpringBootApplication` issues under `custom server`
- Adjusting the default values of `SpringBootApplication`, `application. yml`, and `application. properties`
- Ensure that the package path corresponding to the main entrance is customizable.

2024/11/18 

- Added visible construction of projects in the form of MVN[Correct Opening Method](./create_by_maven-en.md)
- Annotated the dependencies related to `Redisson`, `Redis`, and`RocketMq `in the common package for easy startup. If needed in the future, simply uncomment them
- Modified the configuration file, removed the redundant `yml` section, strengthened customization, sacrificed the comprehensive yml structure, and required users to **search and supplement** on their own;
- Make the clone code **start immediately** as long as there is the correct *database name* and *password*.
- All parameters before adding `application-all properties` are here

### NOTE👂

- The function of`. gitkeep` is just a conventionally agreed upon file name. In order to display the directory structure of the project, this folder is intentionally kept and deleted when in use.
- This project is for learning and reference purposes only. Please do not use it for commercial purposes without authorization.
- Welcome to contribute code or provide suggestions. You can participate in the project by submitting an Issue or Pull Request.

## Participate And Contribute

If you have any suggestions for the project or would like to contribute code, please feel free to submit an Issue or Pull Request. We look forward to your participation in improving and perfecting the project together!

---

Thank you for your attention and support to this project! 🕵️‍♀️