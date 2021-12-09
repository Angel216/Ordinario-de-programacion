package com.example.ordinariodeprogramacion

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ordinariodeprogramacion.databinding.CriptomonedaListItemBinding

class CriptoListAdapter(private val criptoList: List<Criptomonedas>): RecyclerView.Adapter<CriptoListAdapter.ViewHolder>() {
    inner class ViewHolder(private val binding: CriptomonedaListItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(criptomoneda: Criptomonedas){
            Glide
                .with(binding.root)
                .load(criptomoneda.img)
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_foreground)
                .into(binding.criptoImg)
            binding.criptoName.text = criptomoneda.nombre
            binding.criptoPrecio.text = criptomoneda.precioActual.toString()
            binding.criptoPorcentaje.text = criptomoneda.porcentaje+"%"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = CriptomonedaListItemBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(criptoList[position])
    }

    override fun getItemCount(): Int {
        return criptoList.count()
    }
}