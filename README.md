The fix is pretty simple, starting with 4.0.0-milestone5, you should add:

```
testImplementation("io.vertx:vertx-junit5-rx-java2:4.0.0-milestone5")
```

to the list of your dependencies, and it works perfectly fine.


-------------

Original issue: 
 

Just run `gradle test`


Tests are failing (either Kotlin or Java ones) with the following error:

```
No ParameterResolver registered for parameter [io.vertx.reactivex.core.Vertx arg0] in method [void com.github.aesteve.vertx.reproducers.junit5milestone5.DummyTestJava.test(io.vertx.reactivex.core.Vertx,io.vertx.junit5.VertxTestContext)].
```
