package com.datasoft.abs.domain.executor

import kotlinx.coroutines.CoroutineDispatcher

interface PostExecutorThread {
    val main: CoroutineDispatcher
    val io: CoroutineDispatcher
    val default: CoroutineDispatcher
}