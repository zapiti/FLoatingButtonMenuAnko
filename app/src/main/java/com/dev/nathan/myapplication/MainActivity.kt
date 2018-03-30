package com.dev.nathan.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import android.support.design.widget.FloatingActionButton

import android.view.View
import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import org.jetbrains.anko.setContentView
import android.view.animation.Animation
import com.dev.nathan.myapplication.R.anim.fab_open
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.toast


class MainActivity : AppCompatActivity() {

    private var fabExpanded = false
    private lateinit var fabSettings: FloatingActionButton
    private lateinit var layoutFabSave: LinearLayout
    private lateinit var layoutFabEdit: LinearLayout
    private lateinit var layoutFabPhoto: LinearLayout
    lateinit var ui: ActiviyUi
    var fab_open: Animation? = null
    var fab_close: Animation? = null
    var rotate_forward: Animation? = null
    var rotate_backward: Animation? = null
    val array = ArrayList<View>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ui = ActiviyUi()
        ui.setContentView(this)


        fab_open = AnimationUtils.loadAnimation(applicationContext, R.anim.fab_open)
        fab_close = AnimationUtils.loadAnimation(applicationContext,R.anim.fab_close)
        rotate_forward = AnimationUtils.loadAnimation(applicationContext,R.anim.rotate_forward)
        rotate_backward = AnimationUtils.loadAnimation(applicationContext,R.anim.rotate_backward)

        fabSettings = findViewById<View>(ActiviyUi.fabSetting) as FloatingActionButton

        layoutFabSave = findViewById<View>(ActiviyUi.layoutFabSave) as LinearLayout
       
        layoutFabEdit = findViewById<View>(ActiviyUi.layoutFabEdit) as LinearLayout
        
        layoutFabPhoto = findViewById<View>(ActiviyUi.layoutFabPhoto) as LinearLayout
        array.add(layoutFabSave)
        array.add(layoutFabEdit)
        array.add(layoutFabPhoto)
        array.map{c->c.isClickable = false}

        layoutFabSave.onClick {
            toast("falhou")
        }
        fabSettings.setOnClickListener {
            if (fabExpanded) {
                closeSubMenusFab()
                fabSettings.startAnimation(rotate_backward)

            } else {
                openSubMenusFab()
                fabSettings.startAnimation(rotate_forward)
            }
        }

        //Only main FAB is visible in the beginning
        closeSubMenusFab()
    }

    //closes FAB submenus
    private fun closeSubMenusFab() {
        array.map{c->c.startAnimation(fab_close)}
        array.map{c->c.isClickable = false}
        fabExpanded = false
    }

    //Opens FAB submenus
    private fun openSubMenusFab() {



        array.map{c->c.startAnimation(fab_open)}
        array.map{c->c.isClickable = true}
       // array.map{c->c.visibility = View.GONE}


        //Change settings icon to 'X' icon

        fabExpanded = true
    }


}