package com.aa.springbootmybatis.db;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * @author chen
 * @date 2018/7/20 10:33
 */
public class MpGenerator {

    private static String url = "jdbc:mysql://localhost:3306/cmfz";
    private static String user = "root";
    private static String password = "123456";
    private static String dirverName = "com.mysql.jdbc.Driver";
    private static String author = "liyu";
    private static String outputDir = "src\\main\\java\\com\\aa\\springbootmybatis";
    private static String packageName = "domain";//生成的东西放在这个包里

    public static void main(String[] args) {
        GlobalConfig config = new GlobalConfig();
        String dbUrl = url;
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setUrl(dbUrl)
                .setUsername(user)
                .setPassword(password)
                .setDriverName(dirverName);
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig
                .setCapitalMode(true)
                .setEntityLombokModel(false)
                .setDbColumnUnderline(true)
                .setNaming(NamingStrategy.underline_to_camel);
        config.setActiveRecord(false)
                .setEnableCache(false)
                .setAuthor(author)
                .setOutputDir(outputDir)
                .setFileOverride(true)
                .setServiceName("%sService");
        new AutoGenerator().setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(
                        new PackageConfig()
                                .setParent(packageName)
                                .setController("controller")
                                .setEntity("entity")
                ).execute();
    }

}
