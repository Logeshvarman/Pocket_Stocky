package com.octar.pocketstocky.di

import com.octar.pocketstocky.data.csv.CSVParser
import com.octar.pocketstocky.data.csv.CompanyListingsParser
import com.octar.pocketstocky.data.csv.IntradayInfoParser
import com.octar.pocketstocky.data.repository.StockRepositoryImpl
import com.octar.pocketstocky.domain.model.CompanyListing
import com.octar.pocketstocky.domain.model.IntradayInfo
import com.octar.pocketstocky.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}