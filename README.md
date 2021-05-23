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
