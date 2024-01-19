package com.example.testandroidapp.view.controller
import com.airbnb.epoxy.TypedEpoxyController
import com.example.testandroidapp.header
import com.example.testandroidapp.save

public class SampleController: TypedEpoxyController<List<String>>() {
    override fun buildModels(data: List<String>) {
        // isOkを渡さないとfalseで処理される
        header {
            id("header")
            title(data.firstOrNull())
            // isOk(true)
        }
        save {
            id("save")
        }
    }
}