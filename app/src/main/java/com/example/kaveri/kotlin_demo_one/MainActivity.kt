package com.example.kaveri.kotlin_demo_one

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONObject
import java.util.*
import java.util.logging.Logger

//There are two types of strings in Kotlin:-
//1)Escaped Strings  - these strings are written inside double quotes.
//can include escaped strings like \b,\n,\t etc.
//2)Raw Strings these strings are written inside triple quotes.
//These include characters and new lines but can not include escaping characters .
val s = "Hello ,World\n" +
        "from escaped string\n"+
        "kotlin"

//By default | is used as margin prefix, but you can choose another character
// and pass it as a parameter, like trimMargin(">").
/**You can remove leading whitespace with trimMargin() function:*/

val m = """Hello, World
           |from raw string
           |kotlin """.trimMargin()
val n = "Kotlin"

//String Templates :-
//Strings that contain expressions that can be evaluated , we can implement these with '$' :-
// It consists of either a simple name: ,
//val i = 10
//println("i = $i") // prints "i = 10"
//or an arbitrary expression in curly braces:
//val s = "abc"
//println("$s.length is ${s.length}") // prints "abc.length is 3"
//This is supported in raw strings as well

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var  random = Random().nextInt(10)
        text_with_expression.text = "you lucky number is: $random"
        text_with_expression.setTextColor(Color.CYAN)


        val rw = """ The word $n  has ${n.length} characters"""
        text_with_expression1.text = rw

        //If you need to represent a literal $ character in a raw string
        // (which doesn't support backslash escaping), you can use the following syntax:

        val price = """
            ${'$'}9.99
        """.trimIndent()

        text_with_expression2.text = price

        /** String Concatenation
         *  using [StringBuilder]
         *  using [plus]/+
         *  using '$'
         * */

        val hello = "Hello"
        val kotlin = " Kotlin"

      //  title_string.text = hello+kotlin
       // title_string.text = "$hello $kotlin"
        title_string.text = hello.plus(kotlin)




    }

    /** in kotlin switch is replaced with when */

   fun toastMe(view : View) {

       when (view.id) {
           R.id.button -> Toast.makeText(this,s,Toast.LENGTH_SHORT).show()
           R.id.button2 -> Toast.makeText(this,m,Toast.LENGTH_SHORT).show()
           else -> { // Note the block

               print("Default option...")
           }
       }
   }
    
 

}
