package com.dev.nathan.myapplication

import android.content.Context
import android.support.design.widget.FloatingActionButton
import android.view.Gravity
import android.view.View
import android.view.ViewManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import android.widget.TextView
import org.jetbrains.anko.*
import org.jetbrains.anko.cardview.v7.cardView
import org.jetbrains.anko.custom.ankoView
import org.jetbrains.anko.design.floatingActionButton
import org.jetbrains.anko.sdk25.coroutines.onClick


fun ViewManager.skFloatActionMenu(): SkfloatActionMenu= skFloatActionMenu {}

inline fun ViewManager.skFloatActionMenu(init: (@AnkoViewDslMarker SkfloatActionMenu).() -> Unit): SkfloatActionMenu =
        ankoView({ ctx: Context -> SkfloatActionMenu(ctx) }, theme = 0) { init() }

class SkfloatActionMenu(ctx: Context) : _RelativeLayout(ctx) {
    lateinit var cameraContainer: LinearLayout
    lateinit var cameraFloatBtn : FloatingActionButton
    lateinit var cameraTitle :TextView

    lateinit var imageContainer : LinearLayout
    lateinit var imageFloatBtn : FloatingActionButton
    lateinit var photoTitle :TextView

    lateinit var fileContainer : LinearLayout
    lateinit var fileFloatBtn : FloatingActionButton
    lateinit var fileTitle :TextView

    lateinit var locationContainer : LinearLayout
    lateinit var locationFloatBtn : FloatingActionButton
    lateinit var locationTitle :TextView


    lateinit var floatBtnMenuContainer : LinearLayout
    lateinit var floatBtnMenu : FloatingActionButton

    private var fabExpanded = false
    private val fab_open: Animation = AnimationUtils.loadAnimation(context, R.anim.fab_open)
    private val fab_close: Animation = AnimationUtils.loadAnimation(context,R.anim.fab_close)
    private val rotate_forward: Animation = AnimationUtils.loadAnimation(context,R.anim.rotate_forward)
    private val rotate_backward: Animation = AnimationUtils.loadAnimation(context,R.anim.rotate_backward)
    private val arrayFloatMenuView = ArrayList<View>()

    init {
        relativeLayout {

            //region <! Botao principal !>
            floatBtnMenuContainer =  linearLayout {

                id = idFloatBtnMenuContainer

                onClick {

                    if (fabExpanded) {
                        closeMenusFab()
                        startAnimation(rotate_backward)

                    } else {
                        openMenusFab()
                        startAnimation(rotate_forward)
                    }
                }

                floatBtnMenu =  floatingActionButton {

                    imageResource = R.drawable.ic_add_white

                }.lparams( wrapContent,  wrapContent) {

                }
            }.lparams( wrapContent,  wrapContent) {
                alignParentEnd()
                alignParentBottom()
                marginEnd = dip(15)
                bottomMargin = dip(15)
            }
            //endregion

            //region <! Primeiro botao da lista !>
            locationContainer =  linearLayout {

                id = idLocationContainer

                cardView {


                    locationTitle = textView {
                        View.generateViewId()
                        text = " Localização "
                        textSize = 14f
                    }

                }.lparams(wrapContent, wrapContent) {

                    gravity = Gravity.CENTER_VERTICAL
                    marginEnd = dip(10)

                }

                locationFloatBtn = floatingActionButton {

                    imageResource = R.drawable.ic_location_white
                    customSize = dip(40)

                }.lparams( wrapContent,  wrapContent){

                }
            }.lparams( wrapContent,  wrapContent) {
                alignParentEnd()
                above(floatBtnMenuContainer)
                marginEnd = dip(21)
                bottomMargin = dip(10)

            }
            //endregion

            //region <! Segundo botao da lista !>
            fileContainer = linearLayout {

                id = idFileContainer

                cardView {
                    fileTitle = textView {
                        text = " Documento "
                        textSize = 14f

                    }
                }.lparams(wrapContent, wrapContent) {

                    gravity = Gravity.CENTER_VERTICAL
                    marginEnd = dip(10)
                }

                fileFloatBtn = floatingActionButton {

                    imageResource = R.drawable.ic_file_white
                    customSize = dip(40)

                }.lparams( wrapContent,  wrapContent){


                }
            }.lparams( wrapContent,  wrapContent) {

                alignParentEnd()
                above(locationContainer)
                marginEnd = dip(21)
                bottomMargin = dip(10)
            }

            //endregion

            //region <! Terceiro botao da lista !>
            imageContainer =  linearLayout {

                id = idPhotoContainer
                cardView(){
                    photoTitle = textView {
                        text = " FotosVideos "
                        textSize = 14f
                    }
                }.lparams(wrapContent, wrapContent) {


                    gravity = Gravity.CENTER_VERTICAL
                    marginEnd = dip(10)

                }
                imageFloatBtn = floatingActionButton {

                    imageResource = R.drawable.ic_image_white
                    customSize = dip(40)

                }.lparams( wrapContent,  wrapContent){

                }
            }.lparams( wrapContent,  wrapContent) {
                alignParentEnd()
                above(fileContainer)
                marginEnd = dip(21)
                bottomMargin = dip(10)


            }
            //endregion

            //region <! Quarto botao da lista !>
            cameraContainer =  linearLayout {

                id = idCameraContainer




                cardView {
                    fileTitle = textView {
                        text = " Câmera "
                        textSize = 14f

                    }
                }.lparams(wrapContent, wrapContent) {

                    gravity = Gravity.CENTER_VERTICAL
                    marginEnd = dip(10)
                }

                cameraFloatBtn = floatingActionButton {

                    imageResource = R.drawable.ic_camera_white
                    customSize = dip(40)

                }.lparams( wrapContent,  wrapContent){


                }
            }.lparams( wrapContent,  wrapContent) {

                alignParentEnd()
                above(imageContainer)
                marginEnd = dip(21)
                bottomMargin = dip(10)
            }
            //endregion






            arrayFloatMenuView.add(locationContainer)
            arrayFloatMenuView.add(fileContainer)
            arrayFloatMenuView.add(imageContainer)
            arrayFloatMenuView.add(cameraContainer)
            arrayFloatMenuView.map{c->c.isClickable = false}

            closeMenusFab()
        }

    }
    //fecha os submenus da FAB
    private fun closeMenusFab() {
        arrayFloatMenuView.map{c->c.startAnimation(fab_close)}
        arrayFloatMenuView.map{c->c.visibility = View.GONE}
        arrayFloatMenuView.map{c->c.isClickable = false}
        fabExpanded = false
    }

    //abrir os submenus da FAB
    private fun openMenusFab() {
        arrayFloatMenuView.map{c->c.startAnimation(fab_open)}
        arrayFloatMenuView.map{c->c.visibility = View.VISIBLE}
        arrayFloatMenuView.map{c->c.isClickable = true}
        fabExpanded = true
    }


    companion object {
        val idFloatBtnMenuContainer = 1
        val idCameraContainer = 2
        val idFileContainer = 3
        val idLocationContainer = 4
        val idPhotoContainer = 5
    }
}