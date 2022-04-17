package com.octar.pocketstocky.data.mapper

import com.octar.pocketstocky.data.local.CompanyListingEntity
import com.octar.pocketstocky.data.remote.dto.CompanyInfoDto
import com.octar.pocketstocky.domain.model.CompanyInfo
import com.octar.pocketstocky.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing {
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity {
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo {
    return CompanyInfo(
        symbol = symbol ?: "",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: ""
    )
}