package com.aichat.base.base

interface StorageClass<UM> {
     fun setUser(user: UM)
     fun getUser() : UM
     fun stateUser() : Boolean
     fun exitUser() : Boolean
}