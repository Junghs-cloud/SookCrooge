package com.example.sookcrooge

data class Chat(var chatName: String,var chatNum: String, var userName: String,var date:String)
{
    lateinit var documentID:String
    fun addDocumentID(documentID: String)
    {
        this.documentID = documentID
    }
}
