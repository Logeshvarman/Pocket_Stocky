# Pocket_Stocky API

Free Stock Market API  from https://www.alphavantage.co


# plugins
  
id 'com.android.application'

id 'org.jetbrains.kotlin.android'

id 'kotlin-kapt'

id 'dagger.hilt.android.plugin'

id 'kotlin-parcelize'

id 'com.google.devtools.ksp' version '1.6.10-1.0.2'



# dependencies

implementation 'androidx.core:core-ktx:1.7.0'

implementation "androidx.compose.ui:ui:$compose_version"

implementation "androidx.compose.material:material:$compose_version"

implementation "androidx.compose.ui:ui-tooling-preview:$compose_version"

implementation 'androidx.lifecycle:lifecycle-runtime-ktx:2.4.1'

implementation 'androidx.activity:activity-compose:1.4.0'

testImplementation 'junit:junit:4.13.2'

androidTestImplementation 'androidx.test.ext:junit:1.1.3'

androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'

androidTestImplementation "androidx.compose.ui:ui-test-junit4:$compose_version"

debugImplementation "androidx.compose.ui:ui-tooling:$compose_version"

coreLibraryDesugaring 'com.android.tools:desugar_jdk_libs:1.1.5'

implementation 'androidx.navigation:navigation-compose:2.5.0-alpha04'


// OpenCSV

implementation 'com.opencsv:opencsv:5.6'

// Compose dependencies

implementation "androidx.lifecycle:lifecycle-viewmodel-compose:2.4.1"

implementation "androidx.compose.material:material-icons-extended:$compose_version"

implementation "androidx.activity:activity-compose:1.6.0-alpha01"

implementation 'com.google.accompanist:accompanist-swiperefresh:0.24.6-alpha'


// Compose Nav Destinations

implementation 'io.github.raamcosta.compose-destinations:core:1.4.4-beta'

ksp 'io.github.raamcosta.compose-destinations:ksp:1.4.4-beta'


//Dagger - Hilt

implementation 'com.google.dagger:hilt-android:2.41'

kapt 'com.google.dagger:hilt-android-compiler:2.41'

implementation "androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03"

kapt "androidx.hilt:hilt-compiler:1.0.0"

implementation 'androidx.hilt:hilt-navigation-compose:1.0.0'


// Retrofit

implementation 'com.squareup.retrofit2:retrofit:2.9.0'

implementation 'com.squareup.retrofit2:converter-moshi:2.9.0'

implementation 'com.squareup.okhttp3:okhttp:5.0.0-alpha.6'

implementation 'com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.6'


// Room

implementation "androidx.room:room-runtime:2.4.2"

kapt "androidx.room:room-compiler:2.4.2"


// Kotlin Extensions and Coroutines support for Room

implementation "androidx.room:room-ktx:2.4.2"
