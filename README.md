# 用户管理系统

## 项目简介
这是一个基于Spring Boot的用户管理系统，提供用户信息管理功能。

## 技术栈
- Spring Boot 3.4.5
- Java 17
- Spring Data JPA
- SQLite数据库
- Lombok

## 项目结构
```
usermgmt/
├── .mvn/
├── src/
│   ├── main/
│   │   ├── java/com/ibm/usermgmt/  # 主代码目录
│   │   │   ├── UsermgmtApplication.java  # 启动类
│   │   │   ├── controllers/  # 控制器层
│   │   │   │   └── UserController.java
│   │   │   ├── daos/  # 数据访问层
│   │   │   │   └── UserRepository.java
│   │   │   ├── entity/  # 实体类
│   │   │   │   └── User.java
│   │   │   └── services/  # 服务层
│   │   │       ├── UserService.java
│   │   │       └── impl/
│   │   │           └── UserServiceImpl.java
│   │   └── resources/  # 配置文件
│   └── test/  # 测试代码
├──.gitattributes
├──.gitignore
│   └── test/                       # 测试代码
├── .gitattributes
├── .gitignore
├── identifier.sqlite               # SQLite数据库文件
├── mvnw
├── mvnw.cmd
├── pom.xml                         # Maven配置文件
└── users.db                        # SQLite数据库文件
```

## 快速启动指南
1. 确保已安装Java 17和Maven
2. 克隆项目
3. 运行 `mvn spring-boot:run`
4. 访问 `http://localhost:8080`

## api调用
1. 添加用户
   - POST /api/v1/users
2. 获取单个用户
   - GET /api/v1/users/{id}
![usermgmt1.png](picture%2Fusermgmt1.png)
![usermgmt2.png](picture%2Fusermgmt2.png)
![usermgmt3.png](picture%2Fusermgmt3.png)