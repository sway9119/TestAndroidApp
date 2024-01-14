package com.example.testandroidapp

import android.content.Context
import android.os.AsyncTask
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.example.testandroidapp.databinding.ActivityMainBinding
import com.example.testandroidapp.db.AppDatabase
import com.example.testandroidapp.db.User
import com.example.testandroidapp.view.controller.SampleController
import kotlin.coroutines.CoroutineContext

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val context = applicationContext

        // 非同期処理を実行する
        AsyncTaskExample().execute(context)

        // RecyclerViewの設定
        val controller = SampleController()
        val data = listOf("test") // データを設定
        controller.setData(data)
        binding.recyclerView.adapter = controller.adapter
    }
}

class AsyncTaskExample : AsyncTask<Context, Void, String>() {
    override fun doInBackground(vararg params: Context): String {
        // データベースにアクセス
        val context = params[0]
        val db = Room.databaseBuilder(
            context,
            AppDatabase::class.java, "database-name"
        ).build()
        val userDao = db.userDao()
        val users: List<User> = userDao.getAll()
        // 非同期処理をここに記入
        println(users)
        // 結果を返す
        return "処理が完了しました"
    }

    override fun onPostExecute(result: String) {
        // 非同期処理が終了した後にUIスレッドで実行される処理を記述
        // この例では結果をログに出力します
        println(result)
    }
}