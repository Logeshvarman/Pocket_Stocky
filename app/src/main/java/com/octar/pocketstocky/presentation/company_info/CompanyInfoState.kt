package com.octar.pocketstocky.presentation.company_info

import com.octar.pocketstocky.domain.model.CompanyInfo
import com.octar.pocketstocky.domain.model.IntradayInfo

data class CompanyInfoState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
