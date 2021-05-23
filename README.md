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

### WARNING

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

## Other Commands

* compile ( build without test ??)

```
$ mvn compile
```

* run test

```
$ mvn test
```

* build 結果のクリーン

`./target` 以下をお掃除してくれる。

```
$ mvn clean
```

* ???

```
$ mvn install
```

## Links

* [Mavenの使い方](https://qiita.com/soushiy/items/6095401054959ce5d1a5)
* [【超初心者向け】Maven超入門](https://qiita.com/tarosa0001/items/e5667cfa857529900216)
* [Java初心者のためのMaven入門](https://myenigma.hatenablog.com/entry/2019/11/10/084321)
  * [Mavenとは何ぞや](https://qiita.com/ASHITSUBO/items/6c2aa8dd55043781c6b4)

* `ERROR: メイン・マニフェスト属性がありません`
  * [mavenでのjarファイル作成](https://skill-up-engineering.com/2015/10/22/post-856/)

* To Be..??
  * [【初めてのJava】Intellijでとりあえず動くものを作る](https://qiita.com/Esfahan/items/5dfd3a07cd30093092c5)
