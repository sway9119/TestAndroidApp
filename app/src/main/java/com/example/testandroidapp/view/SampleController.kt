package com.example.testandroidapp.view
import com.airbnb.epoxy.EpoxyController
import com.airbnb.epoxy.TypedEpoxyController
import com.example.testandroidapp.header

public class SampleController: TypedEpoxyController<List<String>>() {
    override fun buildModels(data: List<String>) {
        header {
            id("header")
            title(data.firstOrNull())
        }
    }
}