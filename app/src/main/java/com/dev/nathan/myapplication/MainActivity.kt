package com.dev.nathan.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import android.support.design.widget.FloatingActionButton

import android.view.View
import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import org.jetbrains.anko.setContentView
import android.view.animation.Animation
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.toast


class MainActivity : AppCompatActivity() {

    private var fabExpanded = false
    private lateinit var layoutFloatMenu: FloatingActionButton
    private lateinit var layoutCamera: LinearLayout
    private lateinit var layoutImage: LinearLayout
    private lateinit var layoutLocation: LinearLayout
    private lateinit var layoutFile: LinearLayout

    lateinit var ui: ActiviyUi
    lateinit var fab_open: Animation
    lateinit var fab_close: Animation
    lateinit var rotate_forward: Animation
    lateinit var rotate_backward: Animation
    val arrayFloatMenuView = ArrayList<View>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ui = ActiviyUi()
        ui.setContentView(this)







//
//        fab_open = AnimationUtils.loadAnimation(applicationContext, R.anim.fab_open)
//        fab_close = AnimationUtils.loadAnimation(applicationContext,R.anim.fab_close)
//        rotate_forward = AnimationUtils.loadAnimation(applicationContext,R.anim.rotate_forward)
//        rotate_backward = AnimationUtils.loadAnimation(applicationContext,R.anim.rotate_backward)
//
//        layoutFloatMenu = ui.floatBtnMenu
//
//        layoutCamera = ui.cameraContainer
//
//        layoutImage = ui.imageContainer
//
//        layoutLocation = ui.locationContainer
//
//        layoutFile = ui.fileContainer
//
//
//
//        arrayFloatMenuView.add(layoutImage)
//        arrayFloatMenuView.add(layoutCamera)
//        arrayFloatMenuView.add(layoutLocation)
//        arrayFloatMenuView.add(layoutFile)
//        arrayFloatMenuView.map{c->c.isClickable = false}
//
//        layoutFloatMenu.setOnClickListener {
//            if (fabExpanded) {
//                closeSubMenusFab()
//                layoutFloatMenu.startAnimation(rotate_backward)
//
//            } else {
//                openSubMenusFab()
//                layoutFloatMenu.startAnimation(rotate_forward)
//            }
//        }
//        //Apenas principal FAB é visível no começo
//        closeSubMenusFab()
//    }
//
//    //fecha os submenus da FAB
//    private fun closeSubMenusFab() {
//        arrayFloatMenuView.map{c->c.startAnimation(fab_close)}
//        arrayFloatMenuView.map{c->c.isClickable = false}
//        fabExpanded = false
//    }
//
//    //abrir os submenus da FAB
//    private fun openSubMenusFab() {
//        arrayFloatMenuView.map{c->c.startAnimation(fab_open)}
//        arrayFloatMenuView.map{c->c.isClickable = true}
//        fabExpanded = true
//    }


    }
}