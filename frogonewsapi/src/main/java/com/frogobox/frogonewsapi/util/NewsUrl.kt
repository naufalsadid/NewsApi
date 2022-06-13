package com.frogobox.frogonewsapi.util

object NewsUrl {

    const val NEWS_BASE_URL = "https://newsapi.org/"
    const val NEWS_API_KEY = "de59e968705c4112bc5026162926628b"

    const val NEWS_BASE_PATH = "v2/"

    const val NEWS_PATH_TOP_HEADLINE = "top-headlines"
    const val NEWS_PATH_EVERYTHING = "everything"
    const val NEWS_PATH_SOURCES = "sources"

    const val NEWS_URL_TOP_HEADLINE = "$NEWS_BASE_PATH$NEWS_PATH_TOP_HEADLINE"
    const val NEWS_URL_EVERYTHING = "$NEWS_BASE_PATH$NEWS_PATH_EVERYTHING"
    const val NEWS_URL_SOURCES = "$NEWS_BASE_PATH$NEWS_PATH_SOURCES"
}