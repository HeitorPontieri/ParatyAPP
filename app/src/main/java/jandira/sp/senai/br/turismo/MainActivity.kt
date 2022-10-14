package jandira.sp.senai.br.turismo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import jandira.sp.senai.br.turismo.adapter.PontosTuristicosAdapter
import jandira.sp.senai.br.turismo.dao.PontosTuristicosDAO
import org.intellij.lang.annotations.JdkConstants

class MainActivity : AppCompatActivity() {

    lateinit var  rvPontosTuristico :  RecyclerView
    lateinit var  adapterPontosTuristicos: PontosTuristicosAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // Criar instância da RecyclerView
        rvPontosTuristico = findViewById(R.id.rv_pontos_turisticos)

        rvPontosTuristico.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

        adapterPontosTuristicos = PontosTuristicosAdapter(this)
        adapterPontosTuristicos.updatePontosTuristicosList(PontosTuristicosDAO.getPontosTuristicos(this))

        rvPontosTuristico.adapter = adapterPontosTuristicos

    }
}