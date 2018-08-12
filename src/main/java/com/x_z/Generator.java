package com.x_z;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 代码生成器运行类
 */
public class Generator {
    public static void main(String[] args) throws Exception{
        //代码生成器运行过程中的警告信息
        List<String> warnings = new ArrayList<String>();
        //当生成重复代码时覆盖原代码
        boolean overwrite  = true;
        //读取配置文件,文件位置视具体情况而定
        InputStream inputStream = Generator.class.getResourceAsStream("/generator.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration configuration = cp.parseConfiguration(inputStream);
        inputStream.close();

        DefaultShellCallback shellCallback = new DefaultShellCallback(overwrite);

        //创建代码生成器
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(configuration, shellCallback, warnings);
        //执行生成代码
        myBatisGenerator.generate(null);
        //输出警告信息
        for (String warning : warnings) {
            System.out.println(warning);
        }
    }
}
