package com.example.homework10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.homework10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataList = listOf(
            Data(R.drawable.ic_edit, "Edit Profile", "", R.drawable.ic_arrow),
            Data(R.drawable.ic_location, "Address", "", R.drawable.ic_arrow),
            Data(R.drawable.ic_notification, "Notification", "", R.drawable.ic_arrow),
            Data(R.drawable.ic_payment, "Payment", "", R.drawable.ic_arrow),
            Data(R.drawable.ic_security, "Security", "", R.drawable.ic_arrow),
            Data(R.drawable.ic_language, "Language", "English (US)", R.drawable.ic_arrow),
            Data(R.drawable.ic_darkmode, "Dark Mode", "", 0, true),
            Data(R.drawable.ic_privacy, "Privacy Policy", "", R.drawable.ic_arrow),
            Data(R.drawable.ic_help, "Help Center", "", R.drawable.ic_arrow),
            Data(R.drawable.ic_invite, "Invite Friends", "", R.drawable.ic_arrow),
            Data(R.drawable.ic_logout, "Log Out", "", 0)
        )

        val adapter = Adapter(dataList)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter
    }
}