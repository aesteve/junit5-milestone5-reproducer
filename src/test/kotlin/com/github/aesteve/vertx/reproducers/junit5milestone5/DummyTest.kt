package com.github.aesteve.vertx.reproducers.junit5milestone5

import io.vertx.junit5.VertxExtension
import io.vertx.junit5.VertxTestContext
import io.vertx.reactivex.core.Vertx
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(VertxExtension::class)
class DummyTest {

    @Test
    fun someTest(vertx: Vertx, ctx: VertxTestContext) {
        ctx.completeNow()
    }

}
