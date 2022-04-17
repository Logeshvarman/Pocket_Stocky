package com.octar.pocketstocky.domain.repository

import com.octar.pocketstocky.domain.model.CompanyInfo
import com.octar.pocketstocky.domain.model.CompanyListing
import com.octar.pocketstocky.domain.model.IntradayInfo
import com.octar.pocketstocky.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}