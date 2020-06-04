package com.okta.kotlin.resourceserver.model

import java.math.BigDecimal
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by IntelliJ IDEA.
 *
 * @author Vitor Carrilho
 * @since 04/06/2020
 */
@Entity
data class CoffeeShop(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = -1,
        var name: String = "",
        var address: String = "",
        var phone: String = "",
        var coffeePrice: BigDecimal = BigDecimal.ZERO,
        var powerAccessible: Boolean = true
)