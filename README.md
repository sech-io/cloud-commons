# 将公共组件抽离，方便其它项目引用和维护，github和gitee同步更新

1、cloud-commons-base 常用底层基础类封装
2、cloud-commons-pay 支付、公众号相关工具类以及bean
3、cloud-commons-utils 常用底层工具类类封装
4、cloud-commons-config 自动化配置
5、cloud-commons-core 核心依赖
6、cloud-commons-file 文件存储
7、cloud-commons-id 主键生成
8、cloud-commons-rabbitmq 消息队列
9、cloud-commons-redis 分布式缓存

# 依赖方式

1、项目主工程增加 oss.sonatype 远程maven
~~~
<distributionManagement>
  <repository>
    <id>sonatype-releases</id>
    <name>sonatype repository</name>
    <url>https://oss.sonatype.org/service/local/staging/deploy/maven2</url>
  </repository>
  <snapshotRepository>
    <id>sonatype-snapshots</id>
    <name>Nexus Snapshot Repository</name>
    <url>https://oss.sonatype.org/content/repositories/snapshots</url>
  </snapshotRepository>
</distributionManagement>

<repositories>
  <repository>
    <id>oss-snapshots</id>
    <url>https://oss.sonatype.org/content/repositories/snapshots</url>
    <releases>
      <enabled>false</enabled>
    </releases>
    <snapshots>
      <enabled>true</enabled>
    </snapshots>
  </repository>
</repositories>
~~~

2、版本号查看[https://oss.sonatype.org/content/repositories/snapshots/com/github/sech/](https://oss.sonatype.org/content/repositories/snapshots/com/github/sech/)

3、项目工程依赖
~~~
<dependency>
    <groupId>com.sech.commons</groupId>
    <artifactId>cloud-commons-utils</artifactId>
    <version>${cloud.commons.version}</version>
</dependency>

<dependency>
    <groupId>com.sech.commons</groupId>
    <artifactId>cloud-commons-base</artifactId>
    <version>${cloud.commons.version}</version>
</dependency>

<dependency>
    <groupId>com.sech.commons</groupId>
    <artifactId>cloud-commons-pay</artifactId>
    <version>${cloud.commons.version}</version>
</dependency>

<dependency>
    <groupId>com.sech.commons</groupId>
    <artifactId>cloud-commons-config</artifactId>
    <version>${cloud.commons.version}</version>
</dependency>

<dependency>
    <groupId>com.sech.commons</groupId>
    <artifactId>cloud-commons-core</artifactId>
    <version>${cloud.commons.version}</version>
</dependency>

<dependency>
    <groupId>com.sech.commons</groupId>
    <artifactId>cloud-commons-file</artifactId>
    <version>${cloud.commons.version}</version>
</dependency>

<dependency>
    <groupId>com.sech.commons</groupId>
    <artifactId>cloud-commons-id</artifactId>
    <version>${cloud.commons.version}</version>
</dependency>

<dependency>
    <groupId>com.sech.commons</groupId>
    <artifactId>cloud-commons-rabbitmq</artifactId>
    <version>${cloud.commons.version}</version>
</dependency>

<dependency>
    <groupId>com.sech.commons</groupId>
    <artifactId>cloud-commons-redis</artifactId>
    <version>${cloud.commons.version}</version>
</dependency>

<dependency>
    <groupId>com.sech.commons</groupId>
    <artifactId>cloud-commons-rest</artifactId>
    <version>${cloud.commons.version}</version>
</dependency>

<dependency>
    <groupId>com.sech.commons</groupId>
    <artifactId>cloud-commons-swagger</artifactId>
    <version>${cloud.commons.version}</version>
</dependency>
~~~
