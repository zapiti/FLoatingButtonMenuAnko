package com.dev.nathan.myapplication


import org.jetbrains.anko.*


class ActiviyUi : AnkoComponent<MainActivity> {

    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        relativeLayout(){

            textView(){
                textSize = 18f
                text = "Mussum Ipsum, cacilds vidis litro abertis. Detraxit consequat et quo num tendi nada. Mé faiz elementum girarzis, nisi eros vermeio. Sapien in monti palavris qui num significa nadis i pareci latim. Suco de cevadiss, é um leite divinis, qui tem lupuliz, matis, aguis e fermentis.\n" +
                        "\n" +
                        "Nec orci ornare consequat. Praesent lacinia ultrices consectetur. Sed non ipsum felis. Quem num gosta di mé, boa gentis num é. Paisis, filhis, espiritis santis. Posuere libero varius. Nullam a nisl ut ante blandit hendrerit. Aenean sit amet nisi.\n" +
                        "\n" +
                        "Vehicula non. Ut sed ex eros. Vivamus sit amet nibh non tellus tristique interdum. Atirei o pau no gatis, per gatis num morreus. Quem manda na minha terra sou euzis! Viva Forevis aptent taciti sociosqu ad litora torquent.\n" +
                        "\n" +
                        "Todo mundo vê os porris que eu tomo, mas ninguém vê os tombis que eu levo! Praesent malesuada urna nisi, quis volutpat erat hendrerit non. Nam vulputate dapibus. Aenean aliquam molestie leo, vitae iaculis nisl. Não sou faixa preta cumpadi, sou preto inteiris, inteiris.\n" +
                        "\n" +
                        "Diuretics paradis num copo é motivis de denguis. Per aumento de cachacis, eu reclamis. In elementis mé pra quem é amistosis quis leo. Admodum accumsan disputationi eu sit. Vide electram sadipscing et per.\n" +
                        "\n" +
                        "Casamentiss faiz malandris se pirulitá. Praesent vel viverra nisi. Mauris aliquet nunc non turpis scelerisque, eget. Em pé sem cair, deitado sem dormir, sentado sem cochilar e fazendo pose. Delegadis gente finis, bibendum egestas augue arcu ut est.\n" +
                        "\n" +
                        "Tá deprimidis, eu conheço uma cachacis que pode alegrar sua vidis. Nullam volutpat risus nec leo commodo, ut interdum diam laoreet. Sed non consequat odio. Interessantiss quisso pudia ce receita de bolis, mais bolis eu num gostis. Si u mundo tá muito paradis? Toma um mé que o mundo vai girarzis!\n" +
                        "\n" +
                        "Quem num gosta di mim que vai caçá sua turmis! Suco de cevadiss deixa as pessoas mais interessantis. Copo furadis é disculpa de bebadis, arcu quam euismod magna. Mais vale um bebadis conhecidiss, que um alcoolatra anonimis."
            }
            skFloatActionMenu(){

            }.lparams(){
                bottomMargin = dip(15)
            }
        }
    }
}