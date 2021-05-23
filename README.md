# Maven PlayGround

Maven を遊んで理解するためのリポジトリ

## project の作成

```shell
$ mvn archetype:generate
```

これを行うことで、以下のようなプロジェクトが作成される。

```
.
├── pom.xml
└── src
    ├── main
    │   └── java
    │       └── jp/sample
    │           └── App.java
    └── test
        └── java
            └── jp/sample
                └── AppTest.java
```

## build

```
$ mvn package
```

## execute

```
$ java -jar target/maven-playground-1.0-SNAPSHOT.jar
```

## WARNING

```
$ java -jar target/maven-playground-1.0-SNAPSHOT.jar
target/maven-playground-1.0-SNAPSHOT.jarにメイン・マニフェスト属性がありません
```

`pom.xml` に `maven-jar-plugin` と、その `<configuration>` を追加する必要がある。

```pom.xml
        <plugin>
          <artifactId>maven-jar-plugin</artifactId>
          <version>3.0.2</version>
          <configuration>
            <archive>
              <manifest>
                <mainClass>jp.sample.App</mainClass>
                <addClasspath>true</addClasspath>
                <addExtensions>true</addExtensions>
                <classpathPrefix>lib/</classpathPrefix>
              </manifest>
            </archive>
          </configuration>

        </plugin>

```
