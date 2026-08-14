package com.najma6.store

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = LinearLayout(this)
        root.orientation = LinearLayout.VERTICAL
        root.setBackgroundColor(Color.rgb(8, 8, 8))
        root.setPadding(24, 32, 24, 24)

        val title = TextView(this)
        title.text = "🌟 Najma 6"
        title.textSize = 30f
        title.setTextColor(Color.WHITE)
        title.gravity = Gravity.CENTER

        val subtitle = TextView(this)
        subtitle.text = "🎮 عالم الألعاب"
        subtitle.textSize = 18f
        subtitle.setTextColor(Color.LTGRAY)
        subtitle.gravity = Gravity.CENTER
        subtitle.setPadding(0, 16, 0, 40)

        root.addView(title)
        root.addView(subtitle)

        val games = TextView(this)
        games.text = "🔥 الألعاب المميزة\\n\\n🎮 جميع الألعاب\\n\\n🏆 الأكثر تحميلاً\\n\\n🆕 أحدث الألعاب"
        games.textSize = 20f
        games.setTextColor(Color.WHITE)

        root.addView(games)

        setContentView(root)
    }
}
