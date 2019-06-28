# 项目名称
mybatis-plus-generator

#### 项目介绍
mybatis-plus逆向工程

---
项目基于mybatis-plus **3.x** 版本生成代码，2.x版本生成代码之后需要手动导入一些包

---
数据库及代码生成相关配置存在 generator-config.properties 文件中，运行代码之前请更改配置

生成代码运行 com.big_cat.generator.generator.CodeGenerator 的main方法即可

---
##注意事项
由于代码里配置的是生成所有表的方法及xml文件和相关接口，强烈建议不要直接生成在所需项目的路径下，生成之后手动复制到项目里，以免造成项目异常，影响工作效率