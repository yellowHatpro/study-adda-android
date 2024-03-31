package dev.yellowhatpro.studyadda.common.utils

sealed class Result<T> {
    sealed class Loading<T>: Result<T>() {
        class FromCache<T>: Loading<T>()
        class FromNetwork<T> (val isCacheFetchSuccessful: Boolean = true): Loading<T>()
    }
    data class Success<T>(val data: T) : Result<T>()
    data class Failure<T>(val exception: Exception) : Result<T>()

    companion object {
        fun <T> loading() = Loading.FromCache<T>()
        fun <T> loadingFromCache() = Loading.FromCache<T>()
        fun <T> loadingFromNetwork(isCacheFetchSuccessful: Boolean) = Loading.FromNetwork<T>(isCacheFetchSuccessful)
        fun <T> success(data: T) = Success(data)
        fun <T> failed(e: Exception) = Failure<T>(e)
        fun <T> failed(msg: String) = Failure<T>(Exception(msg))
    }

}