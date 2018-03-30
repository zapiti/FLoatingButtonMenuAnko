package com.dev.nathan.myapplication

import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import org.jetbrains.anko.*
import org.jetbrains.anko.design.floatingActionButton


class ActiviyUi : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {

        relativeLayout {
            id = fabFrame



            linearLayout {
                gravity = Gravity.CENTER_VERTICAL
                id = layoutFabSave
                orientation = LinearLayout.HORIZONTAL

                textView {
                    text = "bagulho luco"
                    textSize = 18f
                }.lparams(wrapContent, wrapContent) {
                    weight = 1f
                    gravity = Gravity.CENTER
                    marginEnd = dip(5)

                }
                floatingActionButton {
                    id = fabSave
                    imageResource = R.drawable.ic_save_black_24dp
//
                }.lparams(width = wrapContent, height = wrapContent){
                    weight = 1f
                }
            }.lparams(width = wrapContent, height = wrapContent) {
                alignParentEnd()
                above(layoutFabEdit)
                marginEnd = dip(5)
                bottomMargin = dip(15)
            }



            linearLayout {
                gravity = Gravity.CENTER_VERTICAL
                id = layoutFabEdit
                orientation = LinearLayout.HORIZONTAL
                textView {
                    text = "bagulho luco"
                    textSize = 18f
                }.lparams(wrapContent, wrapContent) {
                    weight = 1f
                    gravity = Gravity.CENTER
                    marginEnd = dip(5)
                }

                floatingActionButton {
                    id = fabEdit
                    imageResource = R.drawable.ic_create_black_24dp
//                    backgroundTint = android.R.color.holo_green_dark
//                    fabSize = mini
                }.lparams(width = wrapContent, height = wrapContent){
                    weight = 1f

                }
            }.lparams(width = wrapContent, height = wrapContent) {

                alignParentEnd()
                above(layoutFabPhoto)
                marginEnd = dip(5)
                bottomMargin = dip(15)
            }


            linearLayout {
                gravity = Gravity.CENTER_VERTICAL
                id = layoutFabPhoto
                orientation = LinearLayout.HORIZONTAL

                textView {
                    text = "bagulho luco"
                    textSize = 18f
                }.lparams(wrapContent, wrapContent) {
                    weight = 1f
                    gravity = Gravity.CENTER
                    marginEnd = dip(5)

                }
                floatingActionButton {
                    id = fabPhoto
                    imageResource = R.drawable.ic_camera_alt_black_24dp
//
                }.lparams(width = wrapContent, height = wrapContent){
                    weight = 1f
                }
            }.lparams(width = wrapContent, height = wrapContent) {
                alignParentEnd()
                above(layoutFabSettings)
                marginEnd = dip(5)
                bottomMargin = dip(15)

            }


            linearLayout {
                gravity = Gravity.CENTER_VERTICAL
                id = layoutFabSettings
                orientation = LinearLayout.HORIZONTAL

                floatingActionButton {
                    id = fabSetting
                    imageResource = R.drawable.ic_add_black
//                    backgroundTint = R.color.primary_dark_material_dark
//                    fabSize = normal
                }.lparams(width = wrapContent, height = wrapContent) {

                }
            }.lparams(width = wrapContent, height = wrapContent) {
                alignParentEnd()
                alignParentBottom()
                marginEnd = dip(15)
                bottomMargin = dip(15)
            }
        }
    }

    companion object {
        val cvtEdit = 1
        val cvtPhoto = 2
        val cvtSave = 3
        val fabEdit = 4
        val fabFrame = 5
        val fabPhoto = 6
        val fabSave = 7
        val fabSetting = 8
        val layoutFabEdit = 9
        val layoutFabPhoto = 10
        val layoutFabSave = 11
        val layoutFabSettings = 12
    }
}