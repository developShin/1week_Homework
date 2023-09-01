package com.android.apple

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.apple.databinding.ActivityMainBinding
import com.android.viewbinding.MyAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 데이터 원본 준비
        val dataList = mutableListOf<MyItem>()
        dataList.add(MyItem(R.drawable.sample1, "산지 한달된 선풍기 팝니다", "서울 서대문구 창천동",1000))
        dataList.add(MyItem(R.drawable.sample2, "김치냉장고", "인천 계양구 귤현동",20000))
        dataList.add(MyItem(R.drawable.sample3, "샤넬카드지갑", "수성구 범어동",10000))
        dataList.add(MyItem(R.drawable.sample4, "금고", "해운대구 우제2동",10000))
        dataList.add(MyItem(R.drawable.sample5, "갤럭시Z플립3 팝니다", "연제구 연산제8동",150000))
        dataList.add(MyItem(R.drawable.sample6, "프라다 복조리백", "수원시 영통구 원천동",50000))
        dataList.add(MyItem(R.drawable.sample7, "울산 동해오션뷰 60평 복층 펜트하우스", "남구 옥동",150000))
        dataList.add(MyItem(R.drawable.sample8, "샤넬 탑핸들 가방", "동래구 온천제2동",180000))
        dataList.add(MyItem(R.drawable.sample9, "4행정 엔진분무기 판매합니다", "원주시 명륜2동",30000))
        dataList.add(MyItem(R.drawable.sample10, "셀린느 버킷 가방", "중구 중화동",190000))


        val adapter = MyAdapter(dataList)
        binding.recyclerview.adapter = adapter
        binding.recyclerview.layoutManager = LinearLayoutManager(this)

        adapter.itemClick = object : MyAdapter.ItemClick {
            override fun onClick(view: View, position: Int) {
                val name: String = dataList[position].aName
                Toast.makeText(this@MainActivity," $name 선택!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}