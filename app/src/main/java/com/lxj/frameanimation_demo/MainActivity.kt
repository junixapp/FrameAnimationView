package com.lxj.frameanimation_demo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var frames: IntArray? = intArrayOf(R.drawable.loading1, R.drawable.loading2, R.drawable.loading3, R.drawable.loading4, R.drawable.loading5, R.drawable.loading6, R.drawable.loading7, R.drawable.loading8, R.drawable.loading9, R.drawable.loading10, R.drawable.loading11, R.drawable.loading12, R.drawable.loading13, R.drawable.loading14, R.drawable.loading15, R.drawable.loading16, R.drawable.loading17, R.drawable.loading18, R.drawable.loading19, R.drawable.loading20, R.drawable.loading21, R.drawable.loading22, R.drawable.loading23, R.drawable.loading24, R.drawable.loading25)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iv.apply {
            setInterval(10)
            setIsLoop(false)
            setFramesArray(frames)
        }
        start.setOnClickListener {
            iv.start()
        }

        stop.setOnClickListener {
            iv.stop()
        }
    }
}
