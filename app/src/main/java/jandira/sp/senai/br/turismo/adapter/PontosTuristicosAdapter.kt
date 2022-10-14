package jandira.sp.senai.br.turismo.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import jandira.sp.senai.br.turismo.R
import jandira.sp.senai.br.turismo.model.PontoTuristico
import org.w3c.dom.Text

class PontosTuristicosAdapter(val context: Context) : RecyclerView.Adapter<PontosTuristicosAdapter.HolderPt>() {

    private var pontosTuristicosList =  listOf<PontoTuristico>()

    fun updatePontosTuristicosList(PontosTuristicos : List<PontoTuristico>){
        this.pontosTuristicosList = PontosTuristicos
        notifyDataSetChanged()
    }


    //criar uma inner class
    class HolderPt(view: View) : RecyclerView.ViewHolder(view) {
        val textTituloPT = view.findViewById<TextView>(R.id.text_title_holder)
        val textDescricao = view.findViewById<TextView>(R.id.text_view_holder)
        val imgHolder = view.findViewById<ImageView>(R.id.image_holder)
        val buttonDetalhes = view.findViewById<Button>(R.id.button_holder)

        fun bind(pontoTuristico: PontoTuristico){
            textTituloPT.text = pontoTuristico.nomePontoTuristico
            textDescricao.text = pontoTuristico.descricao
            imgHolder.setImageDrawable(pontoTuristico.imagem)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderPt {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.holder_layout, parent, false)
        return HolderPt(view)
    }

    override fun onBindViewHolder(holder: HolderPt, position: Int) {
        holder.bind(pontosTuristicosList.get(position))
    }

    override fun getItemCount(): Int {
        return pontosTuristicosList.size
    }


}