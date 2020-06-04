package com.okta.kotlin.resourceserver.gateway.repository

import com.okta.kotlin.resourceserver.model.CoffeeShop
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

/**
 * Created by IntelliJ IDEA.
 *
 * @author Vitor Carrilho
 * @since 04/06/2020
 */
@RepositoryRestResource(collectionResourceRel = "coffee-shops", path = "coffee-shops")
interface CoffeeShopRepository : CrudRepository<CoffeeShop, Long> {
}