package com.okta.kotlin.resourceserver.gateway.config

import com.okta.kotlin.resourceserver.model.CoffeeShop
import org.springframework.context.annotation.Configuration
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer

/**
 * Created by IntelliJ IDEA.
 *
 * @author Vitor Carrilho
 * @since 04/06/2020
 */
@Configuration
open class RestConfig : RepositoryRestConfigurer {

    override fun configureRepositoryRestConfiguration(config: RepositoryRestConfiguration?) {
        config?.exposeIdsFor(CoffeeShop::class.java)
        config?.setBasePath("/api")
    }
}