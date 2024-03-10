package com.example.testandroidapp.view.controller
import com.airbnb.epoxy.TypedEpoxyController
import com.example.testandroidapp.header
import com.example.testandroidapp.save

public class SampleController: TypedEpoxyController<List<String>>() {
    override fun buildModels(data: List<String>) {
        data.forEachIndexed { index, item ->
            // isOkを渡さないとfalseで処理される
            header {
                id("header")
                title(item)
                isOk(true)
            }
            save {
                id("save")
            }
        }
    }
}