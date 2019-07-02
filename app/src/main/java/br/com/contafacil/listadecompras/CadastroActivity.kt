package br.com.contafacil.listadecompras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cadastro.*

class CadastroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        btn_inserir.setOnClickListener{
            val produto = txt_produto.text.toString()
            val qtd = txt_qtd.text.toString()
            val valor = txt_valor.text.toString()
            if(produto.isNotEmpty() && qtd.isNotEmpty() && valor.isNotEmpty()) {

                val prod = Produto(produto, qtd.toInt(), valor.toDouble())
                produtosGlobal.add(prod)

                txt_produto.text.clear()
                txt_qtd.text.clear()
                txt_valor.text.clear()
            } else{
                if (txt_produto.text.isEmpty()){
                    txt_produto.error = "Preencha o nome do produto"
                }else{
                    txt_produto.error = null
                }
                if (txt_qtd.text.isEmpty()){
                    txt_qtd.error = "Preencha a quantidade"
                }else{
                    txt_qtd.error = null
                }
                if (txt_valor.text.isEmpty()){
                    txt_valor.error = "Preencha o valor"
                }else{
                    txt_valor.error = null
                }
            }
        }

    }
}
