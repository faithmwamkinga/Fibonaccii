package com.displaynumbers.fibonaccii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.displaynumbers.fibonaccii.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        displayFibonacci()
    }
    fun displayFibonacci(): Long {
        var sum = 0L
        var previous = 0L
        var current = 1L

        while (current <= 100) {
            if (current % 2 == 0L) {
                sum += current
            }

            val next = previous + current
            previous = current
            current = next
        }

        return sum
    }


}

