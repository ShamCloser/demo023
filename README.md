# demo023
项目
  环境：win10 + idea
  配置 springboot2.0.3 + jpa + mybatis + MySQL
  希望能完成一个根据员工不同角色，分类对后台管理系统进行操作
## day01 进行配置文件和实体类的属性创建
~~~
#配置文件：
  spring:
  datasource:
    url: jdbc:mysql://localhost:3306/project?characterEncoding-utf-8
    username: root
    password: root
    driver-class-name: com.mysql.jdbc.Driver
    type: com.alibaba.druid.pool.DruidDataSource
  jpa:
    show-sql: true
    hibernate:
      ddl-auto: update
 
 
