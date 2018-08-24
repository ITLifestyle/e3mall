package com.lwy.util;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Generator {
    public void generator() throws Exception {
        List<String> warnings = new ArrayList<>();
        boolean overwrite = true;

        File config = new File("E:\\IT\\project\\ShoppingMall\\Dao\\src\\main\\resources\\generatorConfig.xml");
        ConfigurationParser configurationParser = new ConfigurationParser(warnings);
        Configuration configuration = configurationParser.parseConfiguration(config);
        DefaultShellCallback defaultShellCallback = new DefaultShellCallback(overwrite);

        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(configuration, defaultShellCallback, warnings);
        myBatisGenerator.generate(null);
    }

    public static void main(String[] args) throws Exception {
        Generator generator = new Generator();
        generator.generator();
    }
}
