package com.example.applicationdemo.Model


data class CategoryModel(
    val categories: List<Category>
)

data class Category (
    val idCategory: String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescription: String
)
